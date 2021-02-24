package com.example.demo.service;

import com.example.demo.entyti.Securities;

import java.util.List;

public interface SecuritiesService {

    List<Securities> getAll();

    Securities getById(Long id);

    Securities create(Securities securities);

    void  deleteById(Long id);

    Securities update(Long id, Securities securities);

}
