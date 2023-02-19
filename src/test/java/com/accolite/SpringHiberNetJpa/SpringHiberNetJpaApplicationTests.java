package com.accolite.SpringHiberNetJpa;

import com.accolite.SpringHiberNetJpa.Entites.Students;
import com.accolite.SpringHiberNetJpa.Services.StudentsServices;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringHiberNetJpaApplicationTests {
	@Autowired
	StudentsServices services;

	@Test
	void contextLoads() {
		Students stu=new Students();
		stu.setName("yesasvi");
		stu.setEmail("tyesasvi2001@gmail.com");
		stu.setPhonenumber(9966795977L);

		services.CreateStudents(stu);
		System.out.println(services.getAllStudents());
	}

}
