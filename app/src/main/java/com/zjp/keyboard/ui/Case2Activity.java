package com.zjp.keyboard.ui;

import android.databinding.DataBindingUtil;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.zjp.keyboard.R;
import com.zjp.keyboard.databinding.ActivityCase2Binding;

/**
 * Created by zjp on 2018/6/11 14:24.
 */

public class Case2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCase2Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_case_2);


        binding.fullscreenContent.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.cuc_ieschool));
        binding.fullscreenContent.start();




    }
}
