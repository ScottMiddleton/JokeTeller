package com.udacity.gradle.testing.paid;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.AndroidTestCase;

import com.google.android.gms.ads.InterstitialAd;
import com.udacity.gradle.builditbigger.EndpointsAsyncTask;
import com.udacity.gradle.builditbigger.MainActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

@RunWith(AndroidJUnit4.class)
public class FreeAsyncTaskAndroidTest extends AndroidTestCase {

    @Rule public ActivityTestRule<MainActivity> mainActivityActivityTestRule
            = new ActivityTestRule<>(MainActivity.class);

    @SuppressWarnings("unchecked")
    @Test
    public void testEndpointsAsyncTask(){

        String joke;
        InterstitialAd interstitialAd = new InterstitialAd(mainActivityActivityTestRule.getActivity());

        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(mainActivityActivityTestRule.getActivity(), interstitialAd);
        endpointsAsyncTask.execute();

        try {
            joke = endpointsAsyncTask.get();
        } catch (InterruptedException e) {
            joke = null;
        } catch (ExecutionException e) {
            joke = null;
        }
        assertNotNull(joke);
    }
}
