package com.app.tddt4iots.controller;

import com.app.tddt4iots.entities.Devices;
import com.app.tddt4iots.repository.DevicesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/devices")
public class DevicesController {

    @Autowired
    private DevicesRepository devicesRepository;

    @GetMapping
    public ResponseEntity<List<Devices>> getDevices() {
        List<Devices> listDevices = devicesRepository.findAll();
        return ResponseEntity.ok(listDevices);
    }

    @PostMapping
    public ResponseEntity<Devices> insertDevices(@RequestBody Devices devices) {
        Devices newDevices = devicesRepository.save(devices);
        return ResponseEntity.ok(newDevices);
    }

    @PutMapping
    public ResponseEntity<Devices> updateDevices(@RequestBody Devices devices) {
        Devices upDevices = devicesRepository.save(devices);
        if (upDevices != null) {
            return ResponseEntity.ok(upDevices);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<Devices> deletePersons(@PathVariable("id") Long id) {
        devicesRepository.deleteById(id);
        return ResponseEntity.ok(null);
    }

}
