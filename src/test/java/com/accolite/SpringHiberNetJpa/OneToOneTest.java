package com.accolite.SpringHiberNetJpa;

import com.accolite.SpringHiberNetJpa.Entites.Address;
import com.accolite.SpringHiberNetJpa.Entites.Students;
import com.accolite.SpringHiberNetJpa.Services.StudentsServices;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OneToOneTest {
    @Autowired
    private StudentsServices services;
    @Test
    void OTO(){
        Students stu1=new Students();
        stu1.setName("Tyesasvi");
        stu1.setEmail("tyesasvi5@gmail.com");
        stu1.setPhonenumber(9966795977L);
        Address address=new Address();
        address.setCountry("INDIA");
        address.setState("AP");
        address.setCity("vijayawada");
        address.setPincode("520001");

        stu1.setAddress(address);

        services.CreateStudents(stu1);
        System.out.println(services.getAllStudents());
    }
}
