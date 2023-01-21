package com.example.shopexample.controller;

import com.example.shopexample.model.Vehicle;
import com.example.shopexample.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class KafkaController {

    @Autowired
    KafkaProducerService kafkaProducerService;

    @PostMapping("/send")
    public void addVehicle(@RequestBody Vehicle vehicle) {
        kafkaProducerService.sendVehicle(vehicle);
    }

}
