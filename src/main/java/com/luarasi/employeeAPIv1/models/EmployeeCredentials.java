package com.luarasi.employeeAPIv1.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmployeeCredentials {
    @JsonProperty("firstname")
    String firsName;
    @JsonProperty("patrialtname")
    String patrialName;
    @JsonProperty("lastname")
    String lastName;

    public EmployeeCredentials(){
    }

    public EmployeeCredentials(String firstName, String patrialName, String lastName){
        this.firsName = firstName;
        this.patrialName = patrialName;
        this.lastName = lastName;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsNname(String firsName) {
        this.firsName = firsName;
    }

    public String getPatrialName() {
        return patrialName;
    }

    public void setPatrialName(String patrialName) {
        this.patrialName = patrialName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "EmployeeCredentials{" +
                "firsNname='" + firsName + '\'' +
                ", patrialName='" + patrialName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

