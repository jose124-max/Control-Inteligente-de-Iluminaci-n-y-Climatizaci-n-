package com.app.tddt4iots.controller;

import com.app.tddt4iots.entities.Record;
import com.app.tddt4iots.repository.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/record")
public class RecordController {

    @Autowired
    private RecordRepository recordRepository;

    @GetMapping
    public ResponseEntity<List<Record>> getRecord() {
        List<Record> listRecord = recordRepository.findAll();
        return ResponseEntity.ok(listRecord);
    }

    @PostMapping
    public ResponseEntity<Record> insertRecord(@RequestBody Record record) {
        Record newRecord = recordRepository.save(record);
        return ResponseEntity.ok(newRecord);
    }

    @PutMapping
    public ResponseEntity<Record> updateRecord(@RequestBody Record record) {
        Record upRecord = recordRepository.save(record);
        if (upRecord != null) {
            return ResponseEntity.ok(upRecord);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<Record> deletePersons(@PathVariable("id") Long id) {
        recordRepository.deleteById(id);
        return ResponseEntity.ok(null);
    }

}
