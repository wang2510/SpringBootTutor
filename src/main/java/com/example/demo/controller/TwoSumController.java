package com.example.demo.controller;

import com.example.demo.service.TwoSumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// single function interface
@RestController
@RequestMapping
public class TwoSumController {
    @Autowired
    TwoSumService twoSumService;

    @GetMapping(path = "/twosum/{target}", produces = "application/json")
    public HttpEntity towSum(@PathVariable("target") int target) {
        int[] res = twoSumService.towSum(target);
        return new ResponseEntity(res, HttpStatus.OK);
    }
}
