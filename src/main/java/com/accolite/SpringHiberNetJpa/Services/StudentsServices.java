package com.accolite.SpringHiberNetJpa.Services;


import com.accolite.SpringHiberNetJpa.Entites.Students;

import java.util.List;

public interface StudentsServices {
    List<Students>getAllStudents();
    Students CreateStudents(Students S);

}
