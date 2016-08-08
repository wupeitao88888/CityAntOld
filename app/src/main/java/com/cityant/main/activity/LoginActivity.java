package com.cityant.main.activity;

import android.os.Bundle;
import android.view.View;

import com.cityant.main.R;
import com.iloomo.base.ActivitySupport;
import com.iloomo.utils.L;

/**
 * Created by wupeitao on 16/8/8.
 */
public class LoginActivity extends ActivitySupport {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setRemoveTitle();
    }


    public void onLoginClick(View view) {
        mIntent(context, IndexFragment.class);
    }

    public void onQQLoginClick(View view) {
        mIntent(context, BindingActivity.class);
    }

    public void onWeiXinLoginClick(View view) {
        mIntent(context, BindingActivity.class);
    }

    public void onWeboLoginClick(View view) {
        mIntent(context, BindingActivity.class);
    }

    public void onForgetPasswordClick(View view) {
        mIntent(context, ForgetPasswordActivity.class);
    }

    public void onNewUserClick(View view) {
        mIntent(context, NewUserActivity.class);
    }
}

