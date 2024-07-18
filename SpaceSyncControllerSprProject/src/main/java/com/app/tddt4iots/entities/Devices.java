package com.app.tddt4iots.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.lang.*;

import jakarta.persistence.*;

@Entity
@Table(name = "Devices")
@Data
@NoArgsConstructor
public class Devices {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
     
    @Column(name = "DeviceId", nullable = false, unique = false, length = 30) 
    private String DeviceId; 
 
    @Column(name = "Name", nullable = false, unique = false, length = 30) 
    private String Name; 
 
    @Column(name = "Description", nullable = false, unique = false, length = 30) 
    private String Description; 
 
    @Column(name = "Model", nullable = false, unique = false, length = 30) 
    private String Model; 
 
    @Column(name = "ConnectionCode", nullable = false, unique = false, length = 30) 
    private String ConnectionCode; 
 
    @Column(name = "VHConsumption", nullable = false, unique = false, length = 30) 
    private String VHConsumption; 
 
    @Column(name = "ConfigurationId", nullable = false, unique = false, length = 30) 
    private String ConfigurationId; 
 
    @JoinColumn(name = "idConfigurationSystem", referencedColumnName = "id") 
    @OneToOne 
    private ConfigurationSystem configurationSystem; 
 
    
}    
