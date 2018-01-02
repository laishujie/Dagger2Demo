package com.lai.dagger2demo.di2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.lai.dagger2demo.MyApplication;
import com.lai.dagger2demo.R;

import javax.inject.Inject;

import retrofit2.Retrofit;

/**
 * @author Lai
 * @time 2017/12/28 11:23
 * @describe describe
 */

public class Di2Activity extends AppCompatActivity {


    @Inject
    Retrofit mRetrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyApplication myApplication = (MyApplication) getApplication();
        //DaggerActivityComponent2.builder().appComponent2(myApplication.getAppComponent2()).build().inject(this);

        Log.w("Di2Activity",mRetrofit.toString());
        findViewById(R.id.tv_text2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Di2Activity.this,Di2Activity2.class));
            }
        });
    }
}