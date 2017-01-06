package com.ts.exam.entity;

import org.springframework.stereotype.Component;

/**
 * 用户实体类
 * Created by ASpiralMoon on 2017/1/4.
 */
public class Customer {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
