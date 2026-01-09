package com.example.BgFirstSpring.model;

import jakarta.validation.constraints.NotNull;

public class data {
    private String name;
    private int age;
    private String password;

    public void setName(String name){
        this.name= name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age= age;
    }
    public int getAge(){
        return this.age;
    }
    public void setPassword(String password){
        this.password= password;
    }
    public String getPassword(){
        return this.password;
    }
}
