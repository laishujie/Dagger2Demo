package com.lai.dagger2demo.di.component;

import com.lai.dagger2demo.di.AMainActivity;
import com.lai.dagger2demo.di.module.AModule;
import com.lai.dagger2demo.di.scope.ActivityScope;

import dagger.Subcomponent;

/**
 * @author Lai
 * @time 2017/12/25 10:44
 * @describe describe
 */
@ActivityScope
@Subcomponent(modules = {AModule.class})
public interface ActivityComponentSub {
    void inject(AMainActivity aMainActivity);
}
