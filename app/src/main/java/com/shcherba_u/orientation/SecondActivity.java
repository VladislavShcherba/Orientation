package com.shcherba_u.orientation;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class SecondActivity extends AppCompatActivity {

    private static boolean isLandscape = false;
    private Button orientationButton;

    public SecondActivity() {
        Log.d(SecondActivity.class.getSimpleName(),"SecondActivity()");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(SecondActivity.class.getSimpleName(),"onCreate(Bundle savedInstanceState)");
        setContentView(R.layout.second_layout);
        orientationButton = (Button)findViewById(R.id.orientation_button);
        if (isLandscape) {
            orientationButton.setText(R.string.portrait);
        } else {
            orientationButton.setText(R.string.landscape);
        }
    }

    public void changeOrientation(View view) {
        Log.d(SecondActivity.class.getSimpleName(),"changeOrientation(View view)");
        if(!isLandscape) {
            Log.d(SecondActivity.class.getSimpleName(),"isLandScape==false");
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        } else {
            Log.d(SecondActivity.class.getSimpleName(),"isLandScape==true");
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }
        isLandscape = !isLandscape;
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(SecondActivity.class.getSimpleName(),"onSaveInstanceState("+outState+")");
    }

    @Override
    protected void onRestoreInstanceState(Bundle restoreState) {
        super.onRestoreInstanceState(restoreState);
        Log.d(SecondActivity.class.getSimpleName(),"onSaveInstanceState("+restoreState+")");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(SecondActivity.class.getSimpleName(),"onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(SecondActivity.class.getSimpleName(),"onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(SecondActivity.class.getSimpleName(),"onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(SecondActivity.class.getSimpleName(),"onStop()");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(SecondActivity.class.getSimpleName(),"onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(SecondActivity.class.getSimpleName(),"onRestart()");
    }

}
