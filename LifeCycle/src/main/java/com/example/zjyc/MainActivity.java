package com.example.zjyc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifeRecycle","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeRecycle","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeRecycle","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeRecycle","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeRecycle","onStop");
    }

    @Override
    protected void onRestart() {        //重启
        super.onRestart();
        Log.d("LifeRecycle","onRestart");
    }

    @Override
    protected void onDestroy() {            //结束
        super.onDestroy();
        Log.d("LifeRecycle","onDestroy");
    }

}
