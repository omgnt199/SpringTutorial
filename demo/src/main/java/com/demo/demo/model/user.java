package com.demo.demo.model;

import jakarta.persistence.Entity;

@Entity
public class user {
    private String name;
    private String id;
    private String age;
    public user(){

    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAge() {
        return age;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
