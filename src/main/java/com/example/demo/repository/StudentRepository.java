package com.example.demo.repository;

import com.example.demo.modal.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {
    List<Student> students = new ArrayList<>();

    public StudentRepository() {
        Student studentOne = Student.builder()
                .firstName("Steve")
                .lastName("Jobs")
                .id(1)
                .major("Computer Science")
                .email("stevejobs@university.edu")
                .build();

        students.add(studentOne);

        Student studentTwo = Student.builder()
                .firstName("Emily")
                .lastName("Song")
                .id(2)
                .major("Biology")
                .email("emilySong@university.edu")
                .build();

        students.add(studentTwo);

        Student studentThree = Student.builder()
                .firstName("Philip")
                .lastName("Gallangher")
                .id(1)
                .major("Electrical Engineer")
                .email("lipgallangher@university.edu")
                .build();

        students.add(studentThree);
    }


    public List<Student> findAllStudents(){
        return  students;
    }

    public List<Student> findStudentByName(String name){
        List<Student> res = new ArrayList<>();
        if(name == null) return res;
        for(Student student : students) {
            if(student.getFirstName().equals(name) || student.getLastName().equals(name))
                res.add(student);
        }
        return res;
    }
}

