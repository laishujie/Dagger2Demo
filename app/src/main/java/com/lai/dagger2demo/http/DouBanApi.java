package com.lai.dagger2demo.http;

import com.lai.dagger2demo.bean.Book;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * @author Lai
 * @time 2017/12/22 15:55
 * @describe describe
 */

public interface DouBanApi {

    @GET("v2/book/1220562")
    Observable<Book> getBook();

}
