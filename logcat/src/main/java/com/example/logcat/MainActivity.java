package com.example.logcat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt = (Button) findViewById(R.id.button);
        bt.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Log.v("logcatexample", "This is Verbose.");
                Log.d("logcatexample", "This is Debug.");
                Log.i("logcatexample", "This is Information");
                Log.w("logcatexample", "This is Warnning.");
                Log.e("logcatexample", "This is Error.");
                Log.wtf("logcatexample","This is Assert");
                System.out.println("This is println");
            }

        });
    }
}
