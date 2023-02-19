package com.accolite.SpringHiberNetJpa;

import com.accolite.SpringHiberNetJpa.Entites.Address;
import com.accolite.SpringHiberNetJpa.Entites.Course;
import com.accolite.SpringHiberNetJpa.Entites.Students;
import com.accolite.SpringHiberNetJpa.Services.StudentsServices;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

public class OneToManyTest {
    @Autowired
    private StudentsServices services;

    @Test
    void OTM(){

        Students stu3=new Students();

        stu3.setName("TNBKYESASVI");
        stu3.setPhonenumber(9966795977l);
        stu3.setEmail("tyesasvi200@gmail.com");


        Address address=new Address();
        address.setCountry("INDIA");
        address.setState("AP");
        address.setCity("vijayawada");
        address.setPincode("520001");

        stu3.setAddress(address);

        Course c1=new Course("Java");
        Course c2=new Course("Python");
        Course c3=new Course("C");

        stu3.getCourses().add(c1);
        stu3.getCourses().add(c2);
        stu3.getCourses().add(c3);


        services.CreateStudents(stu3);
        System.out.println(services.getAllStudents());




    }
}
