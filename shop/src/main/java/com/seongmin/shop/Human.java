package com.seongmin.shop;

public class Human {
    private String name = "Jeon";
    private Integer age = 24;

    public void old() {
        if(age < 99) {
            age++;
        }
    }

    public void setAge(int age) {
        if(age >= 0 && age < 100) {
            this.age = age;
        }
    }

    public Integer getAge() {
        return age;
    }

}
