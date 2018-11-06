package com.example.demo.service;


import com.example.demo.modal.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> findAllStudents(){

        return studentRepository.findAllStudents();
    }

    public List<Student> findStudentByName(String name){

        return studentRepository.findStudentByName(name);
    }
}
