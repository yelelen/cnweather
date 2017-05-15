package com.yll.cnweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by yelelen on 5/15/2017.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
