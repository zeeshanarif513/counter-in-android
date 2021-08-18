package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread td=new Thread(){
            @Override
            public void run() {
                super.run();
                try{
                    sleep(3000);
                }
                catch(Exception exp){
                    exp.printStackTrace();
                }
                finally{
                    Intent intent=new Intent(Splash.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        };td.start();
    }
}
