package com.kzkt.bssas.model;

import lombok.Data;

@Data
public class Student {

    private String personName;

    private String mobile;

    public Student(String personName, String mobile) {
        this.personName = personName;
        this.mobile = mobile;
    }
}
