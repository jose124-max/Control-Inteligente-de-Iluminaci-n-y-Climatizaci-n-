package com.app.tddt4iots.repository;
 
 import com.app.tddt4iots.entities.Devices;
 import org.springframework.data.jpa.repository.JpaRepository;
 import java.util.*;
import java.lang.*;

 public interface DevicesRepository extends JpaRepository<Devices, Long> {
 }
