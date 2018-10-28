package com.example.demo;

import com.example.demo.modal.Course;
import com.example.demo.repository.CourseRepository;
import com.example.demo.service.CourseService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
public class CourseServiceUnitTest {
    @Mock
    private CourseService courseService;

    @Mock
    private CourseRepository courseRepository;

    @Test
    public void testCourseService(){
        List<Course> courseList = new ArrayList<>();

        given(courseRepository.findAllClasses()).willReturn(courseList);

        List<Course> result = courseService.findAllCourses();

        assertTrue(result.isEmpty());
    }

}
