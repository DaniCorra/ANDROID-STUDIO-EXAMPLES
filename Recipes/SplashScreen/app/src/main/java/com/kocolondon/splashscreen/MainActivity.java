package com.kocolondon.splashscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends Activity {

    // 10 seconds
    static int GAME_THREAD_DELAY = 10000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent gameActivity = new Intent(MainActivity.this, GameActivity.class);
                MainActivity.this.startActivity(gameActivity);

                // perform all house keeping activities here

                // GAME_THREAD_DELAY = 1000;

                MainActivity.this.finish();
            }
        }, GAME_THREAD_DELAY);
    }
}
