package com.example.BgFirstSpring.service;


import org.apache.catalina.User;
import org.springframework.stereotype.Service;
import com.example.BgFirstSpring.model.data;
import java.util.ArrayList;
import com.example.BgFirstSpring.model.data;

@Service
public class FirstService {
    private final String password = "hetpa";
    private ArrayList<data> Alluser= new ArrayList<>();
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
}
