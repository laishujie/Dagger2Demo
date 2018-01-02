package com.lai.dagger2demo.di2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.lai.dagger2demo.MyApplication;
import com.lai.dagger2demo.R;
import com.lai.dagger2demo.di2.component2.DaggerActivityComponent2;

import javax.inject.Inject;

import retrofit2.Retrofit;

/**
 * @author Lai
 * @time 2017/12/28 11:23
 * @describe describe
 */

public class Di2Activity2 extends AppCompatActivity {
    @Inject
    Retrofit mRetrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyApplication myApplication = (MyApplication) getApplication();
        DaggerActivityComponent2.builder().appComponent2(myApplication.getAppComponent2()).build().inject(this);
        Log.w("Di2Activity2",mRetrofit.toString());
    }
}
