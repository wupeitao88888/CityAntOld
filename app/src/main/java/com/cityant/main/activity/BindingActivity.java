package com.cityant.main.activity;

import android.os.Bundle;
import android.view.View;

import com.cityant.main.R;
import com.iloomo.base.ActivitySupport;

/**
 * Created by wupeitao on 16/8/8.
 */
public class BindingActivity extends ActivitySupport {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binding);

    }


    public void onLoginClick(View view) {
        mIntent(context, IndexFragment.class);
    }

}
