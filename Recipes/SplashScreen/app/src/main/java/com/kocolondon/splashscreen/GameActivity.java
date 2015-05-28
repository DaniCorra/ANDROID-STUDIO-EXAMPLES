package com.kocolondon.splashscreen;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

public class GameActivity extends Activity {

    public static int THREAD_DELAY = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        new Handler().postDelayed(new Thread() {
            @Override
            public void run() {
                setContentView(R.layout.activity_splash);
            }
        }, THREAD_DELAY);
    }
}
