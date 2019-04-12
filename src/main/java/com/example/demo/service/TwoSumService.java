package com.example.demo.service;

import com.example.demo.repository.TwoSumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class TwoSumService {

    @Autowired
    TwoSumRepository twoSumRepository;

    public int[] towSum(int target) {
        return twoSumRepository.towSum(target);
    }
}
