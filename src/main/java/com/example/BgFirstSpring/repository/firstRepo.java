package com.example.BgFirstSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.BgFirstSpring.entity.firstData;

public interface firstRepo extends JpaRepository<firstData, String> {
}
