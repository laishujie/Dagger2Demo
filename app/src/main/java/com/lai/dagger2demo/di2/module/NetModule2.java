package com.lai.dagger2demo.di2.module;

import android.app.Application;
import android.util.Log;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import dagger.Module;
import dagger.Provides;
import dagger.Reusable;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author Lai
 * @time 2017/12/22 10:54
 * @describe describe
 */
@Module
public class NetModule2 {

    /*String mBaseUrl;

    // 构造module所需要的参数。根据每个人的情况而定
    public NetModule2(String baseUrl) {
        this.mBaseUrl = baseUrl;
    }*/



    @Provides
    @Reusable
    Gson provideGson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
        return gsonBuilder.create();
    }

    @Provides
    @Reusable
    Cache provideOkHttpCache(Application application) {
        int cacheSize = 10 * 1024 * 1024; // 10 MiB
        return new Cache(application.getCacheDir(), cacheSize);
    }

    @Provides
    @Reusable
    HttpLoggingInterceptor provideHttpLoggingInterceptor() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        return interceptor;
    }

    @Provides
    @Reusable
    OkHttpClient provideOkHttpClient(HttpLoggingInterceptor httpLoggingInterceptor,Cache cache) {
        Log.w("okhttp",cache.toString());
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.cache(cache).
                addInterceptor(httpLoggingInterceptor)
                .connectTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(20, TimeUnit.SECONDS)
                .readTimeout(20, TimeUnit.SECONDS)
                .build();
        return builder.build();
    }


    @Provides
    @Reusable
    Retrofit provideRetrofit(Gson gson, OkHttpClient mOkHttpClient,String mBaseUrl) {
        return new Retrofit.Builder()
                .baseUrl(mBaseUrl)
                .client(mOkHttpClient)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
    }

}
