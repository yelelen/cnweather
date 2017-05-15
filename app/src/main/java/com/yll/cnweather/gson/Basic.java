package com.yll.cnweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by yelelen on 5/15/2017.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
