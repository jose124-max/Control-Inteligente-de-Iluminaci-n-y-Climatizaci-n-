package com.app.tddt4iots.controller;

import com.app.tddt4iots.entities.Admin;
import com.app.tddt4iots.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminRepository adminRepository;

    @GetMapping
    public ResponseEntity<List<Admin>> getAdmin() {
        List<Admin> listAdmin = adminRepository.findAll();
        return ResponseEntity.ok(listAdmin);
    }

    @PostMapping
    public ResponseEntity<Admin> insertAdmin(@RequestBody Admin admin) {
        Admin newAdmin = adminRepository.save(admin);
        return ResponseEntity.ok(newAdmin);
    }

    @PutMapping
    public ResponseEntity<Admin> updateAdmin(@RequestBody Admin admin) {
        Admin upAdmin = adminRepository.save(admin);
        if (upAdmin != null) {
            return ResponseEntity.ok(upAdmin);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<Admin> deletePersons(@PathVariable("id") Long id) {
        adminRepository.deleteById(id);
        return ResponseEntity.ok(null);
    }

}
