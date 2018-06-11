package com.zjp.keyboard.model;

import android.content.Intent;
import android.view.View;

import com.zjp.keyboard.Case1Activity;

/**
 * Created by zjp on 2018/6/11 11:27.
 */

public class Case2Model {

    public void case2Click(View view) {
        view.getContext().startActivity(new Intent(view.getContext(), Case1Activity.class));
    }
}
