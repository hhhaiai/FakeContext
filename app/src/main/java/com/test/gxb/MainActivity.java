package com.test.gxb;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("sanbo", "原始 context:" + this + "-----" + (FakeContext.get() instanceof Context));
        Log.i("sanbo", "原始 pacakge:" + this.getPackageName());
        Log.i("sanbo", "MODIFY context:" + FakeContext.get() + "-----" + (FakeContext.get() instanceof Context));
        Log.i("sanbo", "MODIFY pkg:" + FakeContext.get().getPackageName());

    }
}