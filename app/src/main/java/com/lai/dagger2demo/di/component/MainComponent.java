package com.lai.dagger2demo.di.component;

import com.lai.dagger2demo.di.MainActivity;
import com.lai.dagger2demo.di.module.UserModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author Lai
 * @time 2017/12/14 11:38
 * @describe describe
 */
@Singleton
@Component(modules = UserModule.class)
public interface MainComponent {

    void inject(MainActivity mainActivity);
}
