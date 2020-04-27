package com.example.autisticvisualschedule;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;

public class SplashScreen extends Activity {

    /** Time you will wait **/
    private final int SPLASH_DISPLAY_LENGTH = 1000;

    /** Called when activity is created */
    @Override
    public void onCreate(Bundle icicle) {
            super.onCreate(icicle);
            setContentView(R.layout.activity_splash_screen);

            /* New handler to start the Menu Activity and close splash screen after a couple of seconds */
            new Handler().postDelayed(new Runnable(){
                @Override
                public void run() {
                    /* Create an Intent that will start the Menu Activity */
                    Intent mainIntent = new Intent(SplashScreen.this, Menu.class);
                    SplashScreen.this.startActivity(mainIntent);
                    SplashScreen.this.finish();
                }
            }

        }
}

