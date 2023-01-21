package com.example.shopexample.service;

import com.example.shopexample.model.Vehicle;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class KafkaProducerService {

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;
    private final String TOPIC = "vehicle-create";


    public void sendVehicle(Vehicle vehicle) {
        log.info("Producing Vehicle " + vehicle.getVin());
        kafkaTemplate.send(TOPIC, vehicle.getVin());
    }

}


