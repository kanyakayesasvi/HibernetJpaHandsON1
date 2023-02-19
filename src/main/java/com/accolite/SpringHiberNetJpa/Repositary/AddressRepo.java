package com.accolite.SpringHiberNetJpa.Repositary;

import com.accolite.SpringHiberNetJpa.Entites.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address,Integer> {
}
