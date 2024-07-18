package com.app.tddt4iots.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.util.Date; 

@Entity
@Table(name = "Record")
@Data
@NoArgsConstructor
public class Record {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
     
    @Column(name = "DeviceId", nullable = false, unique = false, length = 30) 
    private String DeviceId; 
 
    @Column(name = "Date", nullable = false, unique = false) 
    @Temporal(TemporalType.TIMESTAMP) 
    private Date Date; 
 
    @Column(name = "OnTime", nullable = false, unique = false, length = 30) 
    private String OnTime; 
 
    @Column(name = "OffTime", nullable = false, unique = false, length = 30) 
    private String OffTime; 
 
    @Column(name = "Time", nullable = false, unique = false, length = 30) 
    private String Time; 
 
    @Column(name = "ElectricConsumption", nullable = false, unique = false, length = 30) 
    private String ElectricConsumption; 
 
    
}    
