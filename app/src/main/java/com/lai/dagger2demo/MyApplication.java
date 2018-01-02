package com.lai.dagger2demo;

import android.app.Application;

import com.lai.dagger2demo.di.component.AppComponent;
import com.lai.dagger2demo.di.component.AppComponentSub;
import com.lai.dagger2demo.di.component.DaggerAppComponent;
import com.lai.dagger2demo.di.component.DaggerAppComponentSub;
import com.lai.dagger2demo.di.module.AppModule;
import com.lai.dagger2demo.di.module.NetModule;
import com.lai.dagger2demo.di2.component2.AppComponent2;
import com.lai.dagger2demo.di2.component2.DaggerAppComponent2;

/**
 * @author Lai
 * @time 2017/12/22 11:07
 * @describe describe
 */

public class MyApplication extends Application {

    //旧的Component module 传参
    private AppComponent mAppComponent;

    //新的Component module 传参
    private AppComponent2 mAppComponent2;

    //子SubComponent继承方式
    private AppComponentSub mAppComponentSub;
    @Override
    public void onCreate() {
        super.onCreate();
       mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule("https://api.douban.com/"))
                .build();

        mAppComponent2 = DaggerAppComponent2.builder().application(this).baseUrl("https://api.douban.com/").build();

        mAppComponentSub = DaggerAppComponentSub.builder().appModule(new AppModule(this))
                .netModule(new NetModule("https://api.douban.com/"))
                .build();
    }


    public AppComponent getAppComponent() {
        return mAppComponent;
    }


    public AppComponent2 getAppComponent2() {
        return mAppComponent2;
    }

    public AppComponentSub getAppComponentSub() {
        return mAppComponentSub;
    }

}
