package com.yll.cnweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by yelelen on 5/10/2017.
 */

public class County extends DataSupport {
    private int Id;
    private String countyName;
    private int cityId;
    private String weatherId;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
}
