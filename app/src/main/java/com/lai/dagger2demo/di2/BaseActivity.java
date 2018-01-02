package com.lai.dagger2demo.di2;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;

import dagger.android.AndroidInjection;

/**
 * @author Lai
 * @time 2017/12/28 17:23
 * @describe describe
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(layout());
        init();
    }

    protected abstract void init();

    @LayoutRes
    protected abstract int layout();
}
