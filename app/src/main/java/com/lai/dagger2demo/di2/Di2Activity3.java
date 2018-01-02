package com.lai.dagger2demo.di2;

import android.content.Intent;
import android.util.Log;
import android.view.View;

import com.lai.dagger2demo.R;
import com.lai.dagger2demo.http.DouBanService;

import javax.inject.Inject;

import retrofit2.Retrofit;

/**
 * @author Lai
 * @time 2017/12/28 11:23
 * @describe describe
 */

public class Di2Activity3 extends BaseActivity {
    @Inject
    Retrofit mRetrofit;

    @Inject
    DouBanService mDouBanService;

    @Override
    protected void init() {
        Log.w("Di2Activity2",mRetrofit.toString());
        findViewById(R.id.tv_text2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Di2Activity3.this,Di2Activity4.class));
            }
        });

        mDouBanService.request();
    }

    @Override
    protected int layout() {
        return R.layout.activity_main;
    }
}
