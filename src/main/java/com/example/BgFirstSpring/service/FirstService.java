package com.example.BgFirstSpring.service;


import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.BgFirstSpring.model.data;
import java.util.ArrayList;
import java.util.List;

import com.example.BgFirstSpring.repository.firstRepo;
import com.example.BgFirstSpring.entity.firstData;

@Service
public class FirstService {

    @Autowired
    private  firstRepo repo;
    private final String password = "hetpa";
    private ArrayList<data> Alluser= new ArrayList<>();

    //------------------------------------------------------
    public firstData insert(firstData data){
        return repo.save(data);
    }
    public List<firstData> all(){
        return repo.findAll();
    }
    //----------------------------------------------------------
    public data addU(data user) {
        Alluser.add(user);
        return user;
    }

    public ArrayList<data> getAll(){
        return Alluser;
    }

    public Boolean deleteAll(String password1){
        System.out.println(password1+" "+password);
        if(!password1.equals(password)) return  false;
        Alluser.clear();
        return true;
    }

    public String hello(String name){
        return "hello "+name;
    }
}
