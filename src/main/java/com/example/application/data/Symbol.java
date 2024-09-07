package com.example.application.data;

import jakarta.persistence.Entity;

@Entity
public class Symbol extends AbstractEntity {

    private String code;
    private String name;
    private String market;
    private String type;

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMarket() {
        return market;
    }
    public void setMarket(String market) {
        this.market = market;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

}
