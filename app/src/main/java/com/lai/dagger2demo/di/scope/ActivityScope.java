package com.lai.dagger2demo.di.scope;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author Lai
 * @time 2017/12/25 11:26
 * @describe describe
 */
@Scope
@Documented
@Retention(RUNTIME)
public @interface ActivityScope {}