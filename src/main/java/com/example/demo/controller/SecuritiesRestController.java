package com.example.demo.controller;

import com.example.demo.entyti.Securities;
import com.example.demo.service.SecuritiesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/securities")
public class SecuritiesRestController {

    private final SecuritiesService securitiesService;


    public SecuritiesRestController(SecuritiesService securitiesService) {
        this.securitiesService = securitiesService;
    }
    @GetMapping
    public List<Securities> getAll(){
        return securitiesService.getAll();
    }

    @GetMapping("/{id}")
     public Securities getById(@PathVariable("id") Long id){
        return securitiesService.getById(id);
     }

     @PostMapping
    public Securities create(@RequestBody Securities securities){
       return securitiesService.create(securities);
     }




     @PutMapping(value = "/{id}")
    public Securities update(@PathVariable("id") Long id, @RequestBody Securities securities){
         Optional<Securities> securitiesOptional=Optional.ofNullable(securitiesService.getById(id));
         Securities newSecurities=securitiesOptional.get();
         newSecurities.setId(securities.getId());
         newSecurities.setDate(securities.getDate());
         newSecurities.setName(securities.getName());
         newSecurities.setPrice(securities.getPrice());
         return securitiesService.update(id,newSecurities);
     }
    @DeleteMapping(value = "/{id}")
     public void deleteById(@PathVariable("id") Long id){
        Optional<Securities> securitiesOptional=Optional.ofNullable(securitiesService.getById(id));
        Securities securities=securitiesOptional.get();
        securitiesService.deleteById(id);
     }

}
