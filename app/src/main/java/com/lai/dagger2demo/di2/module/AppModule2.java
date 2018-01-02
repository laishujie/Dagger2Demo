package com.lai.dagger2demo.di2.module;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import dagger.Module;
import dagger.Provides;
import dagger.Reusable;

/**
 * @author Lai
 * @time 2017/12/22 10:44
 * @describe describe
 */
@Module
public class AppModule2 {

    /*Application mApplication;

    public AppModule2(Application application) {
        mApplication = application;
    }

    @Provides
    @Singleton
    Application providesApplication() {
        return mApplication;
    }*/

    @Provides
    @Reusable
    SharedPreferences providesSharedPreferences(Application application) {
        return PreferenceManager.getDefaultSharedPreferences(application);
    }


}
