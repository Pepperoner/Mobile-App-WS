package com.app.ws.services.impl;

import java.util.ArrayList;
import java.util.List;

//import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.ws.entities.AddressEntity;
import com.app.ws.entities.UserEntity;
import com.app.ws.repositories.AddressRepository;
import com.app.ws.repositories.UserRepository;
import com.app.ws.services.AddressService;
import com.app.ws.dto.AddressDTO;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    AddressRepository addressRepository;

    @Override
    public List<AddressDTO> getAddresses(String userId) {
        return null;
    }

    @Override
    public AddressDTO getAddress(String addressId) {
        return null;
    }
}
