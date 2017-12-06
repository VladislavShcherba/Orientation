package com.shcherba_u.orientation;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button orientationButton;
    private Button goToSecondLayoutButton;
    private static boolean isLandscape = false;
    

    public MainActivity() {
        Log.d(MainActivity.class.getSimpleName(),"MainActivity()");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(MainActivity.class.getSimpleName(),"onCreate(Bundle savedInstanceState)");
        setContentView(R.layout.main_layout);
        orientationButton = (Button)findViewById(R.id.orientation_button);
        if (isLandscape) {
            orientationButton.setText(R.string.portrait);
        } else {
            orientationButton.setText(R.string.landscape);
        }
    }

    public void changeOrientation(View view) {
        Log.d(MainActivity.class.getSimpleName(),"changeOrientation(View view)");
        if(!isLandscape) {
            Log.d(MainActivity.class.getSimpleName(),"isLandScape==false");
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        } else {
            Log.d(MainActivity.class.getSimpleName(),"isLandScape==true");
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }
        isLandscape = !isLandscape;
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(MainActivity.class.getSimpleName(),"onSaveInstanceState("+outState+")");
    }

    @Override
    protected void onRestoreInstanceState(Bundle restoreState) {
        super.onRestoreInstanceState(restoreState);
        Log.d(MainActivity.class.getSimpleName(),"onSaveInstanceState("+restoreState+")");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(MainActivity.class.getSimpleName(),"onStart()");
    }

    @Override
    protected void onResume() {
     super.onResume();
        Log.d(MainActivity.class.getSimpleName(),"onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(MainActivity.class.getSimpleName(),"onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(MainActivity.class.getSimpleName(),"onStop()");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(MainActivity.class.getSimpleName(),"onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(MainActivity.class.getSimpleName(),"onRestart()");
    }

    public void goToSecondLayout(View view) {
        Log.d(MainActivity.class.getSimpleName(),"goToSecondLayout(View view)");
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }
}
