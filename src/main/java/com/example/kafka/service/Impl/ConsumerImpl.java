package com.example.kafka.service.Impl;



import com.example.kafka.entity.UserAddress;
import com.example.kafka.repository.UserAddressRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Slf4j
@Service
@AllArgsConstructor
public class ConsumerImpl {

  private UserAddressRepository userAddressRepository;

    @KafkaListener(topics = "users", groupId = "group_id")
    public void consume(String message) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        UserAddress userAddress = mapper.readValue(message, UserAddress.class);
        userAddressRepository.save(userAddress);
        log.info(String.format("#### -> Consumed message -> %s", message));
    }
}
