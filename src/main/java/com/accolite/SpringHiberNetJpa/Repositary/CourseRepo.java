package com.accolite.SpringHiberNetJpa.Repositary;

import com.accolite.SpringHiberNetJpa.Entites.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course,Integer> {
}
