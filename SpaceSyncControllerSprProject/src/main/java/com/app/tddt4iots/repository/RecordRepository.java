package com.app.tddt4iots.repository;
 
 import com.app.tddt4iots.entities.Record;
 import org.springframework.data.jpa.repository.JpaRepository;
 import java.util.*;
import java.lang.*;

 public interface RecordRepository extends JpaRepository<Record, Long> {
 }
