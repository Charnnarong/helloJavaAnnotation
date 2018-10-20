package com.kone.cth;


public class Person {

    @KoneDefault("KoneCth")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
