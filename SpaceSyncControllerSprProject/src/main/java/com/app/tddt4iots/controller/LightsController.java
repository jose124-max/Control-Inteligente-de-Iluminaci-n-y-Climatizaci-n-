package com.app.tddt4iots.controller;

import com.app.tddt4iots.entities.Lights;
import com.app.tddt4iots.repository.LightsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/lights")
public class LightsController {

    @Autowired
    private LightsRepository lightsRepository;

    @GetMapping
    public ResponseEntity<List<Lights>> getLights() {
        List<Lights> listLights = lightsRepository.findAll();
        return ResponseEntity.ok(listLights);
    }

    @PostMapping
    public ResponseEntity<Lights> insertLights(@RequestBody Lights lights) {
        Lights newLights = lightsRepository.save(lights);
        return ResponseEntity.ok(newLights);
    }

    @PutMapping
    public ResponseEntity<Lights> updateLights(@RequestBody Lights lights) {
        Lights upLights = lightsRepository.save(lights);
        if (upLights != null) {
            return ResponseEntity.ok(upLights);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<Lights> deletePersons(@PathVariable("id") Long id) {
        lightsRepository.deleteById(id);
        return ResponseEntity.ok(null);
    }

}
