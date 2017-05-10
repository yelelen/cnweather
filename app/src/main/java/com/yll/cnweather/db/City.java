package com.yll.cnweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by yelelen on 5/10/2017.
 */

public class City extends DataSupport {
    private int Id;
    private String cityName;
    private int cityCode;
    private int provinceId;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
