package com.example.demo.service;

import com.example.demo.entyti.Securities;
import com.example.demo.repository.SecuritiesRepository;
import com.sun.istack.NotNull;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecuritiesServiceImpl implements SecuritiesService {


    private final SecuritiesRepository securitiesRepository;

    public SecuritiesServiceImpl(SecuritiesRepository securitiesRepository) {
        this.securitiesRepository = securitiesRepository;
    }

    @Override
    public List<Securities> getAll() {
        return securitiesRepository.findAll();
    }

    @Override
    public Securities getById(Long id) {
        return securitiesRepository.getOne(id);
    }

    @Override
    public Securities create(Securities securities) {
        return securitiesRepository.save(securities);
    }

    @Override
    public void deleteById(@NotNull Long id) {
        securitiesRepository.deleteById(id);

    }

    @Override
    public Securities update(Long id, Securities securities) {
        return securitiesRepository.save(securities);
    }
}
