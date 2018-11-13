package com.example.myandroidlibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static final String JOKE_INTENT_EXTRA = "joke_intent_extra";
    private String joke;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        Intent intentThatStartedThisActivity = getIntent();

            try {
            if (intentThatStartedThisActivity != null) {
                if (intentThatStartedThisActivity.hasExtra(JOKE_INTENT_EXTRA)) {
                    joke = intentThatStartedThisActivity.getStringExtra(JOKE_INTENT_EXTRA);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            joke = null;
        }

        TextView jokeTextView = findViewById(R.id.jokeTextView);
        jokeTextView.setText(joke);
    }
}
