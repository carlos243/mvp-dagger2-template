package cl.carlostapia.mvpdagger2template.screens.splash;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import cl.carlostapia.mvpdagger2template.R;
import cl.carlostapia.mvpdagger2template.screens.login.LoginActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                showLoginActivity();
            }
        }, 2000);
    }

    public void showLoginActivity() {
        Log.d("loaded", "ok showed");
        Intent i = new Intent(this, LoginActivity.class);
        startActivity(i);
    }
}
