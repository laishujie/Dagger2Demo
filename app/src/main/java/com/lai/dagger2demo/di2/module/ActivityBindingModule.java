package com.lai.dagger2demo.di2.module;

import com.lai.dagger2demo.di2.Di2Activity3;
import com.lai.dagger2demo.di2.Di2Activity4;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * @author Lai
 * @time 2017/12/28 17:05
 * @describe describe
 */
@Module
public interface ActivityBindingModule {


    @ContributesAndroidInjector(modules = DiModule.class)
    Di2Activity3 di3ActivityInjector();

    @ContributesAndroidInjector
    Di2Activity4 di4ActivityInjector();

}
