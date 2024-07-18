package com.app.tddt4iots.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Entity
@Table(name = "ConfigurationSystem")
@Data
@NoArgsConstructor
public class ConfigurationSystem {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
     
    @Column(name = "ConfigurationId", nullable = false, unique = false, length = 30) 
    private String ConfigurationId; 
 
    @Column(name = "State", nullable = false, unique = false, length = 30) 
    private String State; 
 
    @Column(name = "AutoState", nullable = false, unique = false, length = 30) 
    private String AutoState; 
 
    @Column(name = "AutoTime", nullable = false, unique = false, length = 30) 
    private String AutoTime; 
 
    @JoinColumn(name = "idDevices", referencedColumnName = "id") 
    @OneToOne 
    private Devices devices; 
 
    
}    
