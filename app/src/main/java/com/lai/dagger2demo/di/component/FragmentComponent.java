package com.lai.dagger2demo.di.component;

import com.lai.dagger2demo.AFragment;
import com.lai.dagger2demo.di.module.AModule;
import com.lai.dagger2demo.di.scope.FragmentScope;

import dagger.Component;

/**
 * @author Lai
 * @time 2017/12/25 11:44
 * @describe describe
 */
@FragmentScope
@Component(modules = AModule.class, dependencies = AppComponent.class)
public interface FragmentComponent {
    void inject(AFragment fragment);
}
