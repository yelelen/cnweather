package com.yll.cnweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by yelelen on 5/10/2017.
 */

public class Province extends DataSupport {
    private int Id;
    private String provinceName;
    private int provinceCode;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
