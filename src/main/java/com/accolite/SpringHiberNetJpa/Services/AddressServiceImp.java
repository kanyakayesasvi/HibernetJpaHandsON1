package com.accolite.SpringHiberNetJpa.Services;

import com.accolite.SpringHiberNetJpa.Entites.Address;
import com.accolite.SpringHiberNetJpa.Repositary.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImp implements AddressServices{
    @Autowired
    AddressRepo repo;

    @Override
    public List<Address> getAllAddress() {
        return this.repo.findAll();
    }

    @Override
    public Address createAddress(Address A) {
        return this.repo.save(A);
    }
}
