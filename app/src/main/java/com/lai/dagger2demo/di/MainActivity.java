package com.lai.dagger2demo.di;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.google.gson.Gson;
import com.lai.dagger2demo.R;
import com.lai.dagger2demo.bean.Book;
import com.lai.dagger2demo.di.component.DaggerMainComponent;
import com.lai.dagger2demo.di.module.UserModule;
import com.lai.dagger2demo.di.scope.BookQualifier;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.Lazy;

public class MainActivity extends AppCompatActivity {


    //@Inject//(2)
    //UserService mUserService;

    @Inject
    Gson mGson1;

    @Inject
    Gson mGson2;

    @Inject
    @Named("Book1")
    Book mBook;

    @Inject
    @BookQualifier
    Book mBook2;

    @Inject
    String mString;

    @Inject
    Lazy<Gson> mGson3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerMainComponent.builder().userModule(new UserModule()).build().inject(this);
        Log.w("MainActivity", Integer.toHexString(mGson1.hashCode()));
        Log.w("MainActivity", Integer.toHexString(mGson2.hashCode()));
        Log.w("MainActivity", mBook.getTitle());
        Log.w("MainActivity", mBook2.getTitle());
        Log.w("MainActivity", mString);
        Log.w("MainActivity", Integer.toHexString(mGson3.get().hashCode()));


        //Log.w("MainActivity", B);
        findViewById(R.id.tv_text2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AMainActivity.class));
            }
        });
    }
}
