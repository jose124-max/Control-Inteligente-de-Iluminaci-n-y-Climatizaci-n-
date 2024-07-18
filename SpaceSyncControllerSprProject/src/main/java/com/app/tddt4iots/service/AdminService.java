package com.app.tddt4iots.service;

import org.springframework.stereotype.Service;
import com.app.tddt4iots.entities.*;
import java.util.*;
import java.lang.*;
import java.io.*;

@Service
public interface AdminService {     
	 public void setConfiguration(int configurationId, Boolean state, Boolean autoState, int autoTime); 
 
	 public String authenticate(String name, String password); 
 
    
}
