package com.example.himusomogro;

import static java.lang.Thread.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class SplashScreen_Activity extends AppCompatActivity {
      private ProgressBar progressBar;
      public  int progress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
              setContentView(R.layout.activity_splash_screen);

              //progressbar
        progressBar = findViewById(R.id.progressbarId);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
              doWork();
              startApp();
            }
        });
        thread.start();
    }
        public void doWork()
        {

            for(progress=40;progress<=100;progress=progress+20){
                try {
                    Thread.sleep(1000);
                    progressBar.setProgress(progress);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }



        }

        public void startApp()
        {
            Intent intent = new Intent(SplashScreen_Activity.this,MainActivity.class);
            startActivity(intent);
            finish();


        }


    }
