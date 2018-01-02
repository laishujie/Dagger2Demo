package com.lai.dagger2demo.di;

import android.content.Context;

import com.google.gson.Gson;

import javax.inject.Inject;

/**
 * @author Lai
 * @time 2017/12/14 11:23
 * @describe describe
 */

public class UserService {

    Gson gson;
    Context context;

    public UserService() {

    }

    @Inject
    public UserService(Gson gson, Context context) {
        this.gson = gson;
        this.context = context;
    }

    public Gson getGson() {
        return gson;
    }

    public void request() {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
