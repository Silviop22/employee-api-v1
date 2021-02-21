package com.luarasi.employeeAPIv1.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmployeeCharacteristic {
    @JsonProperty("key")
    String key;
    @JsonProperty("value")
    String value;

    public EmployeeCharacteristic(){

    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "EmployeeCharacteristic{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
