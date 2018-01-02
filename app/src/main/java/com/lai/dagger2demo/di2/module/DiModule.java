package com.lai.dagger2demo.di2.module;

import com.lai.dagger2demo.http.DouBanService;

import dagger.Module;
import dagger.Provides;
import dagger.Reusable;
import retrofit2.Retrofit;

/**
 * @author Lai
 * @time 2017/12/28 17:06
 * @describe describe
 */
@Module
public class DiModule {

    @Provides
    @Reusable
    DouBanService provideUserservice(Retrofit r){
        return new DouBanService(r);
    }

}
