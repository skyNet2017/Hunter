package com.quinn.hunter.example;

import android.os.Looper;
import android.util.Log;


/**
 * Created by Quinn on 24/03/2017.
 */

public class BetaTest extends ParentTest{

    public static final String TAG = "BetaTest";

    public BetaTest() {
        this(5);
        swing(0,9);
        claw();
        new Thread(new Runnable() {
            @Override
            public void run() {
                eat();
            }
        }).start();

    }

    public BetaTest(int god){
        Log.i(TAG, "god constructor");
    }

    @Override
    public void swing(int a, int b) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Looper.getMainLooper();
    }

    private void eat() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void claw() {
        int a = 5;
        Log.i(TAG, "claw");
    }

    private void learn() {
        int a = 5;
        Log.i(TAG, "claw");
    }
}
