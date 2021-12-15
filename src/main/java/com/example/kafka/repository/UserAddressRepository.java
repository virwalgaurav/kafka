package com.example.kafka.repository;

import com.example.kafka.entity.UserAddress;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAddressRepository extends CrudRepository<UserAddress,Integer> {


}