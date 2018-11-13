package com.example.jokelib;

import java.util.Random;

public class JokeProvider {

    private String[] jokes;
    private String joke;

    public JokeProvider() {
        jokes = new String[10];
        jokes[0] = "Why is Peter Pan always flying? He neverlands.";
        jokes[1] = "Why do blind people hate skydiving? It scares the hell out of their dogs.";
        jokes[2] = "When you look really closely, all mirrors look like eyeballs.";
        jokes[3] = "My friend says to me: \"What rhymes with orange\" I said: \"No it doesn't\"";
        jokes[4] = "My wife told me I had to stop acting like a flamingo. So I had to put my foot down.";
        jokes[5] = "I couldn't figure out why the baseball kept getting larger. Then it hit me.";
        jokes[6] = "Why did the old man fall in the well? Because he couldn't see that well.";
        jokes[7] = "I ate a clock yesterday, it was very time consuming";
        jokes[8] = "Whatdya call a frenchman wearing sandals? Phillipe Phillope.";
        jokes[9] = "I'm so good at sleeping. I can do it with my eyes closed.";
    }

    public String getJoke() {
        joke = jokes[new Random().nextInt(jokes.length)];
        return joke;
    }
}