package com.lai.dagger2demo.di.module;

import com.lai.dagger2demo.di.UserService;
import com.lai.dagger2demo.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * @author Lai
 * @time 2017/12/25 10:46
 * @describe describe
 */
@Module
public class AModule {

    @Provides
    @ActivityScope
    UserService providesUserService(){
        return new UserService();
    }

}
