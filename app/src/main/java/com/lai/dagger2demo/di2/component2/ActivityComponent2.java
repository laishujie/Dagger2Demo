package com.lai.dagger2demo.di2.component2;

import com.lai.dagger2demo.di2.Di2Activity;
import com.lai.dagger2demo.di2.Di2Activity2;

import dagger.Component;

/**
 * @author Lai
 * @time 2017/12/28 11:37
 * @describe describe
 */
@Component( dependencies = AppComponent2.class)
public interface ActivityComponent2 {
    void inject(Di2Activity di2Activity);
    void inject(Di2Activity2 di2Activity);
}
