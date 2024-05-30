package com.material.study.Course.controller;

import com.material.study.Course.entity.Course;
import com.material.study.Course.service.CourseService;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController("/")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/courses")
    public List<Course> getCourses() {
        return courseService.getCourses();
    }

    @GetMapping("/courses/{id}")
    public Course getCourseById(@PathVariable Long id) throws BadRequestException {
        Optional<Course> course= courseService.getCourseByid(id);
        if(course.isPresent())
            return course.get();
        else
            throw new BadRequestException("Course not found");
    }
}
