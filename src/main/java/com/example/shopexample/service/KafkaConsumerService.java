package com.example.shopexample.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumerService {

    @KafkaListener(topics = "vehicle-create", groupId = "online-shop-group")
    public void consumeVehicle(String vin) {
        log.info("Consumed Vehicle " + vin);
    }
}
