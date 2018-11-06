package com.example.demo.controller;

import com.example.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.modal.Course;

import java.util.List;

@RestController
@RequestMapping
public class CourseController {
    @Autowired
    CourseService courseService;

    @GetMapping(path = "/", produces = "application/json")
    public HttpEntity demo(){
       // List<CourseDto> allCourses = courseService.findAllCourses();

        return new ResponseEntity<>("OK",HttpStatus.OK);
    }

    @GetMapping(path = "/api/course/findAllCourses", produces = "application/json")
    public HttpEntity<List<Course>> findAllCourses(){
        List<Course> allCourses = courseService.findAllCourses();

        return new ResponseEntity<>(allCourses, HttpStatus.OK);
    }
}
