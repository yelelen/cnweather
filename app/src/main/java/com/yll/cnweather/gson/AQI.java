package com.yll.cnweather.gson;

/**
 * Created by yelelen on 5/15/2017.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
