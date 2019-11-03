package edu.bu.metcs.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        Log.i( "Main Activity",  "onCreate() method called");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i("Main Activity", "onStart() method called");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i( "Main Activity", "onResume() method called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Main Activity", "onPause() method called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i( "Main Activity",  "onStop() method called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(  "Main Activity", "onDestroy() method called");
    }
}
