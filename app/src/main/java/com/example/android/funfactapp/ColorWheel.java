package com.example.android.funfactapp;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by joanniehuang on 2016/2/24.
 */
public class ColorWheel {

    //Members of the class
    public String[] mColor = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };

    public int getColor() {
        //Randomly select quotes
        Random random = new Random();
        int number = random.nextInt(mColor.length);

        int colorInt = Color.parseColor(mColor[number]);

        return colorInt;
    }

}
