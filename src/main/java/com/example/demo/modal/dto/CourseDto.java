package com.example.demo.modal.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CourseDto {

    private String courseName;

    private String courseLocation;

    private String courseContent;

    private long teacherId;
}
