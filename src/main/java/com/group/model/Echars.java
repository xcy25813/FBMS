package com.group.model;


import lombok.Data;

@Data
public class Echars {
    private String name;
    private Integer num;

    public Echars(String name, Integer num) {
        super();
        this.name = name;
        this.num = num;
    }

    // getter和setter以及toString略
}
