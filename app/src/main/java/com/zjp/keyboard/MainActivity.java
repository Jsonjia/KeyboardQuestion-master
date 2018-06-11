package com.zjp.keyboard;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zjp.keyboard.databinding.ActivityMainBinding;
import com.zjp.keyboard.model.Case1Model;
import com.zjp.keyboard.model.Case2Model;
import com.zjp.keyboard.model.TitleModel;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding bind = DataBindingUtil.setContentView(this, R.layout.activity_main);

        TitleModel titleModel = new TitleModel();
        titleModel.setTitle("解决横屏情况下，软键盘弹出导致整体布局上移问题");

        bind.setTitle(titleModel);

        bind.setCase1(new Case1Model());
        bind.setCase2(new Case2Model());

    }
}
