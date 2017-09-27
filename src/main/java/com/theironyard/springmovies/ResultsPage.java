package com.theironyard.springmovies;

public class ResultsPage {
    private Object results;
    private int page;
    private int total_results;
    private Object  dates;
    private int total_pages;

    public ResultsPage(Object results, int page, int total_results, Object dates, int total_pages) {
        this.results = results;
        this.page = page;
        this.total_results = total_results;
        this.dates = dates;
        this.total_pages = total_pages;
    }

    public ResultsPage(){}

    public Object getResults() {
        return results;
    }

    public void setResults(Object results) {
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
