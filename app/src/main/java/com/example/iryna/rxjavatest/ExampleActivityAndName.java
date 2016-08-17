package com.example.iryna.rxjavatest;

/**
 * Created by iryna on 17.08.16.
 */


import android.app.Activity;

/**
 * Pair consisting of the name of an example and the activity corresponding to the example.
 */
public class ExampleActivityAndName {

    public final Class<? extends Activity> mExampleActivityClass;
    public final String mExampleName;

    public ExampleActivityAndName(
            Class<? extends Activity> exampleActivityClass,
            String exampleName) {
        mExampleActivityClass = exampleActivityClass;
        mExampleName = exampleName;
    }
}
