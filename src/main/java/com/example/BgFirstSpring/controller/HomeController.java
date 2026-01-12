package com.example.BgFirstSpring.controller;



import com.example.BgFirstSpring.model.data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.BgFirstSpring.entity.firstData;
import com.example.BgFirstSpring.service.FirstService;

import java.util.List;

@RestController
public class HomeController {

    private final FirstService fist;

    HomeController(FirstService fist){
        this.fist=fist;
    }
    //---------------------------------------------
    @PostMapping("/insertData")
    public firstData insertData(@RequestBody firstData data){
        return fist.insert(data);
    }

    @PostMapping("/allUser")
    public List<firstData> allUser(){
        return fist.all();
    }
    //---------------------------------------------------------------
    @PostMapping("/addUser")
    public ResponseEntity addUser(@RequestBody data user){
        data temp = fist.addU(user);
        if(user.equals(temp)) return ResponseEntity.status(201).body("user created");
        return ResponseEntity.status(500).body("user not created");
    }
    @GetMapping("/index")
    public String index(@RequestBody String name){
        if(name==null) return "name is required";
        return fist.hello(name);
    }
    @GetMapping("/getAllUsers")
    public ResponseEntity getAllUsers(){
        return ResponseEntity.status(200).body(fist.getAll());
    }

    @DeleteMapping("/deleteAll")
    public ResponseEntity  deleteAll(@RequestBody String password){
        if(password==null) return ResponseEntity.status(400).body("password is missing");
        boolean res = fist.deleteAll(password);
        if(!res) return ResponseEntity.status(400).body("password is wrong");
        return ResponseEntity.status(200).body("all users deleted succesfully");
    }
    //---------------------------------------------------------------------------------------//
    @GetMapping("/Bg2")
    public int Bg2(){
        return 123;
    }

    @GetMapping("/bg")
    public String bg(){
        return "12223.232";
    }

    @GetMapping("/hello")
    public ResponseEntity<?> hello(){
        int[] res = {1,23,5656,56};
        return ResponseEntity.status(500).body(res);
    }

    @GetMapping("/dataBody")//localhost:port/dataBody
    public ResponseEntity dataBody(@RequestBody data d){
        //data class need to create where fields is private +getter+setter method
        return ResponseEntity.status(200).body("what spring received = "+d.getName());
    }
    @GetMapping("/data/{id}/{name}")//localhost:port/data/12121/bg
    public ResponseEntity data(@PathVariable int id, @PathVariable String name){
        System.out.println("data from client id : "+id+" name : "+name);
        return ResponseEntity.status(200).body("what spring received = "+id+" "+name);
    }
    @GetMapping("/data2/{name}")//localhost:port/data2?id=21213
    public ResponseEntity data2(@RequestParam int id,@PathVariable String name){
        System.out.println("from client = "+id+" name "+name);
        return ResponseEntity.status(300).body("from client received = "+id+" name "+name);
    }
    @GetMapping("/error")
    public ResponseEntity error(){
        return  ResponseEntity.status(404).body("not found");
    }
}
