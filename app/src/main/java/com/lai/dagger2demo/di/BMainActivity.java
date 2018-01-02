package com.lai.dagger2demo.di;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.lai.dagger2demo.MyApplication;
import com.lai.dagger2demo.R;

import javax.inject.Inject;

import retrofit2.Retrofit;

/**
 * @author Lai
 * @time 2017/12/22 16:05
 * @describe describe
 */

public class BMainActivity extends AppCompatActivity {

    @Inject
    Retrofit mRetrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((MyApplication)getApplication()).getAppComponent().inject(this);
        Log.w("BMainActivity", mRetrofit.toString());

        //((MyApplication)getApplication()).getAppComponent().inject();
    }

}
