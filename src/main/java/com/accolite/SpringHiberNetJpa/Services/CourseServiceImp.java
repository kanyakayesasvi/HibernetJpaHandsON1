package com.accolite.SpringHiberNetJpa.Services;

import com.accolite.SpringHiberNetJpa.Entites.Course;
import com.accolite.SpringHiberNetJpa.Repositary.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImp implements CourseServices{
    @Autowired
    CourseRepo repo;
    @Override
    public List<Course> getAllCources() {
        return this.repo.findAll();
    }

    @Override
    public Course createCourse(Course C) {
        return this.repo.save(C);
    }
}
