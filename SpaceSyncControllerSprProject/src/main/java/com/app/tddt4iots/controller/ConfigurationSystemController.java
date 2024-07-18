package com.app.tddt4iots.controller;

import com.app.tddt4iots.entities.ConfigurationSystem;
import com.app.tddt4iots.repository.ConfigurationSystemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/configurationsystem")
public class ConfigurationSystemController {

    @Autowired
    private ConfigurationSystemRepository configurationsystemRepository;

    @GetMapping
    public ResponseEntity<List<ConfigurationSystem>> getConfigurationSystem() {
        List<ConfigurationSystem> listConfigurationSystem = configurationsystemRepository.findAll();
        return ResponseEntity.ok(listConfigurationSystem);
    }

    @PostMapping
    public ResponseEntity<ConfigurationSystem> insertConfigurationSystem(@RequestBody ConfigurationSystem configurationsystem) {
        ConfigurationSystem newConfigurationSystem = configurationsystemRepository.save(configurationsystem);
        return ResponseEntity.ok(newConfigurationSystem);
    }

    @PutMapping
    public ResponseEntity<ConfigurationSystem> updateConfigurationSystem(@RequestBody ConfigurationSystem configurationsystem) {
        ConfigurationSystem upConfigurationSystem = configurationsystemRepository.save(configurationsystem);
        if (upConfigurationSystem != null) {
            return ResponseEntity.ok(upConfigurationSystem);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<ConfigurationSystem> deletePersons(@PathVariable("id") Long id) {
        configurationsystemRepository.deleteById(id);
        return ResponseEntity.ok(null);
    }

}
