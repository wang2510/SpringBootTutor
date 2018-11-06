package com.example.demo.controller;

import com.example.demo.modal.Student;
import com.example.demo.service.StudentService;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping(path = "/api/student/findAllStudents", produces = "application/json")
    public HttpEntity<List<Student>> findAllStudents(){
        List<Student> allStudents = studentService.findAllStudents();

        return new ResponseEntity<>(allStudents,HttpStatus.OK);
    }

    @PostMapping(path = "/api/student", produces = "application/json")
    public HttpEntity<List<Student>> findStudentByName(@RequestBody String name){
        System.out.println("name:" + name);
        List<Student> allCourses = studentService.findStudentByName(name);
        return new ResponseEntity<>(allCourses, HttpStatus.OK);
    }


//    @GetMapping(path = "/api/student/{inputString}", produces = "application/json")
//    public HttpEntity<List<Student>> findStudentByName(@PathVariable("inputString") String inputString){
//        List<Student> allCourses = studentService.findStudentByName(inputString);
//
//        return new ResponseEntity<>(allCourses, HttpStatus.OK);
//    }
}