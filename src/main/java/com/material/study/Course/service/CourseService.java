package com.material.study.Course.service;

import com.material.study.Course.entity.Course;
import com.material.study.Course.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getCourses()
    {
        return courseRepository.findAll();
    }

    public Optional<Course> getCourseByid(Long id) {
        return courseRepository.findById(id);
    }
}
