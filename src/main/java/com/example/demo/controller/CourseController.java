package com.example.demo.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class CourseController {

    @GetMapping(path = "/", produces = "application/json")
    public HttpEntity findAllCourses(){
       // List<CourseDto> allCourses = courseService.findAllCourses();

        return new ResponseEntity<>("OK",HttpStatus.OK);
    }

//    @GetMapping(path = "/api/course/findAllCourses", produces = "application/json")
//    public HttpEntity<List<CourseDto>> findAllCourses(){
//        List<CourseDto> allCourses = courseService.findAllCourses();
//
//        return new ResponseEntity<>(allCourses, HttpStatus.OK);
//    }

//    @GetMapping(path = "/look-up/{inputString}", produces = "application/json")
//    public HttpEntity<CourseDto> searchCourse(@PathVariable("inputString") String inputString) {
//
//        CourseDto courseDto = courseService.searchByCourseName(inputString);
//        return new ResponseEntity<>(courseDto, HttpStatus.OK);
//    }

}
