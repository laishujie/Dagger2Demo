package com.lai.dagger2demo.di.component;

import com.lai.dagger2demo.MyApplication;
import com.lai.dagger2demo.di.module.AppModule;
import com.lai.dagger2demo.di.module.NetModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author Lai
 * @time 2017/12/22 11:03
 * @describe describe
 */
@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface AppComponentSub {

    /*//gson

     //子Component 继承关系中不用显式地提供暴露依赖实例的接口

    Gson gson();

    Application application();

    OkHttpClient okHttpClient();

    SharedPreferences sharedPreferences();

    Retrofit retrofit();*/


    //声明子Component是谁,表明 ActivityComponentSub 继承 AppComponentSub
    ActivityComponentSub activityComponentSub();

    void inject(MyApplication application);
}
