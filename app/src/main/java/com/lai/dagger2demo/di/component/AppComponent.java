package com.lai.dagger2demo.di.component;

import android.app.Application;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.lai.dagger2demo.di.BMainActivity;
import com.lai.dagger2demo.MyApplication;
import com.lai.dagger2demo.di.module.AppModule;
import com.lai.dagger2demo.di.module.NetModule;

import javax.inject.Singleton;

import dagger.Component;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * @author Lai
 * @time 2017/12/22 11:03
 * @describe describe
 */
@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface AppComponent {

    //gson
    Gson gson();

    Application application();

    OkHttpClient okHttpClient();

    SharedPreferences sharedPreferences();

    Retrofit retrofit();

    void inject(MyApplication application);
    void inject(BMainActivity bMainActivity);
}
