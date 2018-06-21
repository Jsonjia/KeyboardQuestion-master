package com.zjp.keyboard.ui;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.zjp.keyboard.R;
import com.zjp.keyboard.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding bind = DataBindingUtil.setContentView(this, R.layout.activity_main);

        bind.setCase1(this);
        bind.setCase2(this);
    }

    public void case1Click(View view) {
        view.getContext().startActivity(new Intent(view.getContext(), Case1Activity.class));
    }

    public void case2Click(View view) {
        view.getContext().startActivity(new Intent(view.getContext(), Case2Activity.class));
    }


}
