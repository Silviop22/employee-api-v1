package com.luarasi.employeeAPIv1.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Employee {
    @JsonProperty("id")
    private String id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("type")
    private String type;
    @JsonProperty("status")
    private String status;
    @JsonProperty("createdDate")
    private String createdDate;
    @JsonProperty("desc")
    private String desc;
    @JsonProperty("department")
    private String department;
    @JsonProperty("employeeCredentials")
    private EmployeeCredentials employeeCredentials = null;
    @JsonProperty("characteristicValues")
    private List<EmployeeCharacteristic> characteristicValues = null;
    public Employee(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public EmployeeCredentials getEmployeeCredentials() {
        return employeeCredentials;
    }

    public void setEmployeeCredentials(EmployeeCredentials employeeCredentials) {
        this.employeeCredentials = employeeCredentials;
    }

    public List<EmployeeCharacteristic> getCharacteristicValues() {
        return characteristicValues;
    }

    public void setCharacteristicValues(List<EmployeeCharacteristic> characteristicValues) {
        this.characteristicValues = characteristicValues;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", desc='" + desc + '\'' +
                ", department='" + department + '\'' +
                ", employeeCredentials=" + employeeCredentials +
                ", characteristicValues=" + characteristicValues +
                '}';
    }
}
