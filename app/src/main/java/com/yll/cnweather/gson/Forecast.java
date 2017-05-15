package com.yll.cnweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * Created by yelelen on 5/15/2017.
 */

public class Forecast {
    public String date;

    @SerializedName("cond")
    public More more;

    @SerializedName("tmp")
    public Temperature temperature;

    public class Temperature{
        public String max;
        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
