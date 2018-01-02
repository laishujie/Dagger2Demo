package com.lai.dagger2demo.di.module;

import com.google.gson.Gson;
import com.lai.dagger2demo.bean.Book;
import com.lai.dagger2demo.di.scope.BookQualifier;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author Lai
 * @time 2017/12/14 17:32
 * @describe describe
 */
@Module
public class UserModule {


    @Provides
    @Singleton
    Gson provideGson() {
        return new Gson();
    }

    @Provides
    @Singleton
    @Named("Book1")
    Book provideBook1() {
        Book book = new Book();
        book.setTitle("语文");
        return book;
    }

    @Provides
    @Singleton
    @BookQualifier
    Book provideBook2() {
        Book book = new Book();
        book.setTitle("数学");
        return book;
    }

    @Provides
    @Singleton
    String provideBook(@BookQualifier Book book) {
        return book.getTitle();
    }
}
