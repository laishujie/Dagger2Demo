package com.lai.dagger2demo.di2.component2;

import android.app.Application;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.lai.dagger2demo.MyApplication;
import com.lai.dagger2demo.MyApplication2;
import com.lai.dagger2demo.di2.module.AppModule2;
import com.lai.dagger2demo.di2.module.ActivityBindingModule;
import com.lai.dagger2demo.di2.module.NetModule2;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * @author Lai
 * @time 2017/12/22 11:03
 * @describe describe
 */
@Component(modules = {
        AppModule2.class,
        NetModule2.class,
        ActivityBindingModule.class,
        AndroidSupportInjectionModule.class
})
public interface AppComponent2 extends AndroidInjector<MyApplication2> {

    @Component.Builder
    interface Builder {

        // Module所需要的参数可以这样提供
        @BindsInstance
        Builder application(Application application);

        @BindsInstance
        Builder baseUrl(String baseUrl);


        AppComponent2 build();
    }

    //gson
    Gson gson();

    Application application();

    OkHttpClient okHttpClient();

    SharedPreferences sharedPreferences();

    Retrofit retrofit();

    void inject(MyApplication application);
}
