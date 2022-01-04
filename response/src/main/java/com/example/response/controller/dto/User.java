package com.example.response.controller.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
//@JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class) 왜 안되징.;

// @JsonInclude(JsonInclude.Include.NON_NULL) null 값들은 제외

public class User
{
    private String name;
    private int age; //age 값이 없을경우 디폴트 값으로 0이 되는데 null로 변경할 경우 int --> integer로 변경
    @JsonProperty("phone_number")
    private String phoneNumber;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() { //age 값이 없을경우 디폴트 값으로 0이 되는데 null로 변경할 경우 int --> integer로 변경
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
