package com.accolite.SpringHiberNetJpa.Services;

import com.accolite.SpringHiberNetJpa.Entites.Address;

import java.util.List;

public interface AddressServices {
    List<Address> getAllAddress();

    Address createAddress(Address A);
}
