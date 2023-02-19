package com.accolite.SpringHiberNetJpa.Repositary;



import com.accolite.SpringHiberNetJpa.Entites.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Students,Integer>{

}
