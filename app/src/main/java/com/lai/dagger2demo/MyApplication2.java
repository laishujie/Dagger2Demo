package com.lai.dagger2demo;

import android.app.Activity;
import android.app.Application;

import com.lai.dagger2demo.di2.component2.DaggerAppComponent2;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * @author Lai
 * @time 2017/12/22 11:07
 * @describe describe
 */

public class MyApplication2 extends Application implements HasActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> dispatchingActivityInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerAppComponent2.builder().baseUrl("https://api.douban.com/").application(this).build().inject(this);
    }


    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingActivityInjector;
    }
}
