package com.example.mtrsliit.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtViwe2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtViwe2 = findViewById(R.id.textView3);
        txtViwe2.setText(R.string.Msg2);

        Log.i("LifeCycle", "OnCreate()Involked!!!");

    }
         public void onStart()
        {
            super.onStart();
            Log.i ("LifeCycle","onStart()Involked!!!");

        }

        public void onRestart()
        {
            super.onRestart();

            Log.i ("LifeCycle","onRestart()Involked!!!");


        }
        public void onStop()
        {
            super.onStop();
            Log.i ("LifeCycle","onStop()Involked!!!");



        }

        public void onResume()
        {

            super.onResume();
            Log.i ("LifeCycle","onResume()Involked!!!");


        }





}
