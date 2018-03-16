package com.sola.webdemo.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "good ")
public class Good {

    @Id
    @Column(name = "good_id")
    private Integer goodId;

    @Column(name = "good_name")
    private String goodName;

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    @Override
    public String toString() {
        return "Good{" +
                "goodId=" + goodId +
                ", goodName='" + goodName + '\'' +
                '}';
    }
}
