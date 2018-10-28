package com.example.demo.modal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    private String className;
    private Instructor instructor;
    private Date startDate;
    private Date endDate;
    private String timeFrame;
}
