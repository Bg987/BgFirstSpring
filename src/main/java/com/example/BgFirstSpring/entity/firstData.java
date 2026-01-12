package com.example.BgFirstSpring.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;

@Entity
@Table(name = "firstBgSpringDb")
public class firstData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long identity;
    @Column(name = "roll_no")
    private Integer roll_no;

    @Column(name = "name")
    private String name;

    public firstData() {
    }

    public firstData(Integer roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }

    public Long getIdentity() {
        return identity;
    }

    public void setIdentity(Long identity) {
        this.identity = identity;
    }

    public Integer getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(Integer roll_no) {
        this.roll_no= roll_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
