package com.app.ws.services;

import java.util.List;

import com.app.ws.dto.AddressDTO;

public interface AddressService {

    List<AddressDTO> getAddresses(String userId);

    AddressDTO getAddress(String addressId);

}
