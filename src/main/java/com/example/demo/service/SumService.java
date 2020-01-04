package com.example.demo.service;

import com.example.demo.Repository.SumRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component

public class SumService {
    @Autowired

    SumRespository sumRespository;
    public int twoSumService(int a, int b){
        return sumRespository.twosum(a,b);
    }
}
