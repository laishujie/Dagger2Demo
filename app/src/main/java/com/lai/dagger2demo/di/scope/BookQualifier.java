package com.lai.dagger2demo.di.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * @author Lai
 * @time 2017/12/25 11:26
 * @describe describe
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface BookQualifier {}