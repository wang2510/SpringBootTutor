package com.example.demo.service;


import com.example.demo.repository.TwoSumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class TwoSumService {
    @Autowired
    TwoSumRepository twoSumRepository;


    public int[] getTwoSum(String target) {

        return twoSumRepository.getTwoSum(target);
    }



}
