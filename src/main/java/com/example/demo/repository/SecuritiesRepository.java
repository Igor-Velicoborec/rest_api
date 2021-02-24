package com.example.demo.repository;

import com.example.demo.entyti.Securities;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SecuritiesRepository extends JpaRepository<Securities, Long> {
}
