package com.example.themovieapp.serviceapi;

import com.example.themovieapp.model.Result;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieApiService {

    //the service interface defines the structure and behaviour of the api requests .
    //acts as bridge between api and app.

    @GET("movie/popular")  //her you are specifying endpoint of the URL.

    //retrofit uses call class to represent network requests and response
    Call<Result> getPopularMovies(@Query("api_key") String apiKey);


}
