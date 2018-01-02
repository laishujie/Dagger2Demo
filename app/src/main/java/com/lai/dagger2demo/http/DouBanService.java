package com.lai.dagger2demo.http;

import android.util.Log;

import com.lai.dagger2demo.bean.Book;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;

/**
 * @author Lai
 * @time 2017/12/29 16:25
 * @describe describe
 */

public class DouBanService {

    private Retrofit mRetrofit;

    public DouBanService(Retrofit mRetrofit) {
        this.mRetrofit = mRetrofit;
    }

    public void request() {
        DouBanApi douBanApi = mRetrofit.create(DouBanApi.class);
        douBanApi.getBook().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<Book>() {
            @Override
            public void accept(Book book) throws Exception {
                Log.w("DouBanService", book.toString());
            }
        });
    }

}
