package com.lai.dagger2demo.di;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.lai.dagger2demo.MyApplication;
import com.lai.dagger2demo.R;

import javax.inject.Inject;

/**
 * @author Lai
 * @time 2017/12/22 16:05
 * @describe describe
 */

public class AMainActivity extends AppCompatActivity {
    //@Inject
   // Retrofit mRetrofit;
    //@Inject
   // SharedPreferences mSharedPreferences;


    @Inject
    UserService mUserService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //使用
      /*  DaggerActivityComponent.builder().appComponent(((MyApplication)getApplication()).getAppComponent())
                .build().inject(this);*/

        // Log.w("AMainActivity", Integer.toHexString(mSharedPreferences.hashCode()));

        //子Component的测试
        MyApplication myApplication =  (MyApplication)getApplication();

        myApplication.getAppComponentSub().activityComponentSub().inject(this);

        Log.w("AMainActivity", mUserService.toString());


        findViewById(R.id.tv_text2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AMainActivity.this,BMainActivity.class));
            }
        });
    }
}
