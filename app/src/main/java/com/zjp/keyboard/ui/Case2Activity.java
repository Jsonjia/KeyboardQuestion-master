package com.zjp.keyboard.ui;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;

import com.zjp.keyboard.R;
import com.zjp.keyboard.databinding.ActivityCase2Binding;
import com.zjp.keyboard.ui.view.InputTextMsgDialog;

/**
 * Created by zjp on 2018/6/11 14:24.
 */

public class Case2Activity extends AppCompatActivity {

    private InputTextMsgDialog inputTextMsgDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCase2Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_case_2);

        binding.fullscreenContent.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.cuc_ieschool));
        binding.fullscreenContent.start();

        inputTextMsgDialog = new InputTextMsgDialog(this, R.style.InputDialog);
        binding.setClick2(this);
    }

    public void onClick(View view) {

        WindowManager windowManager = getWindowManager();
        Display display = windowManager.getDefaultDisplay();
        WindowManager.LayoutParams lp = inputTextMsgDialog.getWindow().getAttributes();
        lp.width = (display.getWidth());
        inputTextMsgDialog.getWindow().setAttributes(lp);
        inputTextMsgDialog.setCancelable(true);
        inputTextMsgDialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
        inputTextMsgDialog.show();
    }


}
