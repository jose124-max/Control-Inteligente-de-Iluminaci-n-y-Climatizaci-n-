package com.app.tddt4iots.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Entity
@Table(name = "Admin")
@Data
@NoArgsConstructor
public class Admin {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
     
    @Column(name = "Name", nullable = false, unique = false, length = 30) 
    private String Name; 
 
    @Column(name = "Password", nullable = false, unique = false, length = 30) 
    private String Password; 
 
    @Column(name = "ClassroomName", nullable = false, unique = false, length = 30) 
    private String ClassroomName; 
 
    @Column(name = "ConfigurationId", nullable = false, unique = false, length = 30) 
    private String ConfigurationId; 
 
    
}    
