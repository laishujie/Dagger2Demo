package com.lai.dagger2demo.di2;

import android.util.Log;

import com.lai.dagger2demo.R;

import javax.inject.Inject;

import retrofit2.Retrofit;

/**
 * @author Lai
 * @time 2017/12/28 11:23
 * @describe describe
 */

public class Di2Activity4 extends BaseActivity {

    @Inject
    Retrofit mRetrofit;


    @Override
    protected void init() {
        Log.w("Di2Activity2",mRetrofit.toString());

    }

    @Override
    protected int layout() {
        return R.layout.activity_main;
    }
}
