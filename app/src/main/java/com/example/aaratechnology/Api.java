package com.example.aaratechnology;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface Api {

    @Headers("Content-Type: application/json")
    @POST("login/")
    Call<LoginResponse>login(
            @Body UserData userData
    );
}
