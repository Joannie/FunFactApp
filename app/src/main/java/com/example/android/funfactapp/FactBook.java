package com.example.android.funfactapp;

import java.util.Random;

/**
 * Created by joanniehuang on 2016/2/21.
 */
public class FactBook {

    //Members of the class
    public String[] quote = {
            "All the art of living lies in a fine mingling of letting go and holding on",
            "I like not only to be loved, but also to be told I am loved.",
            "Ads are the cave art of the twentieth century.",
            "Night comes to the desert all at once, as if someone turned off the light.",
            "A lover without indiscretion is no lover at all.",
            "Nature is not human hearted.",
            "Don't cry because it's over, smile because it happened.",
            "Be yourself; everyone else is already taken.",
            "You know you're in love when you can't fall asleep because reality is finally better than your dreams."
    };

    public String getQuote() {
        //Randomly select quotes
        Random random = new Random();
        int number = random.nextInt(quote.length);

        return quote[number];
    }
}
