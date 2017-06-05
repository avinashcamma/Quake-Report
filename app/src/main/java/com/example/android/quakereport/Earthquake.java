package com.example.android.quakereport;

/**
 * Created by Ankit on 1/1/2017.
 */

public class Earthquake {
    private Double magnitude = null;
    private String location = null;
    private long time = 0;
    private String url = null;


    public Double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(Double magnitude) {
        this.magnitude = magnitude;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Earthquake(Double magnitude, String location, long time, String url) {
        this.magnitude = magnitude;
        this.location = location;
        this.time = time;
        this.url = url;
    }

    public long getTimeInMilliseconds() {
        return time;
    }
}
