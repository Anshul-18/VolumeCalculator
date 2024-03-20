package com.example.themovieapp.model;

import android.app.Application;

import androidx.lifecycle.MutableLiveData;

import com.example.themovieapp.R;
import com.example.themovieapp.serviceapi.MovieApiService;
import com.example.themovieapp.serviceapi.RetrofitInstance;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MovieRepository {

    //used to abstract the data source details and provides a clean API for the ViewModel to fetch and manage data.

    private ArrayList<Movie> movies = new ArrayList<>();
//    private ArrayList<Movie> movies = new ArrayList<>();
    private MutableLiveData<List<Movie>> mutableLiveData = new MutableLiveData<>();
    //helps to prevent memory leaks and ui updates when no needed.

    private Application application;

    public MovieRepository(Application application) { //to access resources folder.
        this.application = application;
    }

    public MutableLiveData<List<Movie>> getMutableLiveData() {


        MovieApiService movieApiService = RetrofitInstance.getService(); //service instances that define API endpoints and
        // their associated HTTP methods.

        Call<Result> call = movieApiService
                .getPopularMovies(application.getApplicationContext().getString(R.string.api_key));

        //enqueue is a asynchronous method for making http requests.
        //asynchronous : means work run on background thread and result is published on ui thread.
        //handles the response on the main(UI) thread.

        call.enqueue(new Callback<Result>() { //this mehthod handle success and failure cases.
            @Override
            public void onResponse(Call<Result> call, Response<Result> response) {
                //Success
                Result result = response.body();

                if(result != null && result.getResults() != null) {
                    movies = (List<Movie>) result.getResults();
                }
            }

            @Override
            public void onFailure(Call<Result> call, Throwable t) {

            }
        });

    }
}
