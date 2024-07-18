package com.app.tddt4iots.service;

import org.springframework.stereotype.Service;
import com.app.tddt4iots.entities.*;
import java.util.*;
import java.lang.*;
import java.io.*;

@Service
public interface DevicesService {     
	 public void activateDevice(int deviceid); 
 
	 public void deactivateDevice(int deviceid); 
 
    
}
