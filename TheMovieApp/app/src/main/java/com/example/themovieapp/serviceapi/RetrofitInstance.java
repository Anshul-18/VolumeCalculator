package com.example.themovieapp.serviceapi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

    //Acts as a central config. point for defining how HTTP requests and responses should be handled.

    private static Retrofit retrofit = null;
    public static String BASE_URL = "https://api.themoviedb.org/3/";

    public static MovieApiService getService() {
        if(retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

                    //method specifies the converterfactory for serializing and deserializing json data.
            //gsonconverterfactory is used to convert json data into java or kotlin objects.
        }

        return retrofit.create(MovieApiService.class);
    }


}
