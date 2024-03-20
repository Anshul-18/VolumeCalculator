package com.example.themovieapp.model;

//this class will fetch the results.

import android.graphics.Movie;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Result {

//    @SerializedName("page")  => YOU HAVE TO USE THIS IF YOU WANT TO GIVE DIFFERENT NAME TO YOUR PRIVATE VARIABLE
//    FROM THE API RESPONSE, MAKE SURE YOU GIVE THE ARGUMENT AS SAME IN SERIALIZE AS IN THE API RESPONSE.
    @Expose //IT TELLS WHICH FIELDS TO INCLUDE IN 'SERIALIZATION' AND 'DESERIALIZATION',
            // BY DEFAULT ALL FIELDS ARE INCLUDED IN SERIALIZATION AND DESERIALIZATION.

    private Integer page;

    @SerializedName("total_pages")
    @Expose
    private Integer totalPages;

    @SerializedName("total_results")
    @Expose
    private Integer totalResults;

    @SerializedName("results")
    @Expose
    private List<Movie> results = null;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    public List<Movie> getResults() {
        return results;
    }

    public void setResults(List<Movie> results) {
        this.results = results;
    }


    public Result() {
    }
}
