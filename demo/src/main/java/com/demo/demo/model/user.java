package com.demo.demo.model;

import jakarta.persistence.Entity;

@Entity
public class user {
    private String name;
    private String id;

    public user(){

    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
