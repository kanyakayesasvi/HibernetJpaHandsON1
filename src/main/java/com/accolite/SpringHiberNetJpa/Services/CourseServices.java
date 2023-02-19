package com.accolite.SpringHiberNetJpa.Services;

import com.accolite.SpringHiberNetJpa.Entites.Course;

import java.util.List;

public interface CourseServices {
    List<Course> getAllCources();

    Course createCourse(Course C);
}
