package com.example.activitylifecyclehomework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mShowCount;
    private int mCount=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.number);
    }


//   @Override
//  public void onSaveInstanceState(Bundle outState) {
//  super.onSaveInstanceState(outState);
////  outState.putString("reply_text", mShowCount.getText().toString());
//    }

    public void increment(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
}