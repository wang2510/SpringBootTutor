package com.example.demo.controller;

import com.example.demo.service.TwoSumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// single function interface
@RestController
@RequestMapping
public class TwoSumController {

    @Autowired
    TwoSumService twoSumService;

    @GetMapping(path = "/twoSum/{target}", produces = "application/json")
    public HttpEntity getTwoSum(@PathVariable("target") String target) {
        int[] result = twoSumService.getTwoSum(target);

        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
