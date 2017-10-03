package com.theironyard.springmovies;

import java.util.List;

public class ResultsPage {
    private List<Movie> results;
    private int page;
    private int total_results;
    private Object  dates;
    private int total_pages;

    public ResultsPage(){}

    public List<Movie> getResults() {
        return results;
    }

    public void setResults(List<Movie> results) {
        this.results = results;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotal_results() {
        return total_results;
    }

    public void setTotal_results(int total_results) {
        this.total_results = total_results;
    }

    public Object getDates() {
        return dates;
    }

    public void setDates(Object dates) {
        this.dates = dates;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }
}
