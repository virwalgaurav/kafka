package com.example.kafka.service.Impl;


import com.example.kafka.entity.UserAddress;
import com.example.kafka.repository.UserAddressRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserAddressService {

    private UserAddressRepository addressRespository;

    public void save(UserAddress userAddress){
              addressRespository.save(userAddress);
    }
}
