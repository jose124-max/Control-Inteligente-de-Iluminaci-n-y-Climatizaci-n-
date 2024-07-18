package com.app.tddt4iots.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Entity
@Table(name = "Lights")
@Data
@NoArgsConstructor
public class Lights {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
     
    @Column(name = "idluz", nullable = false, unique = false, length = 30) 
    private String idluz; 
 
    
}    
