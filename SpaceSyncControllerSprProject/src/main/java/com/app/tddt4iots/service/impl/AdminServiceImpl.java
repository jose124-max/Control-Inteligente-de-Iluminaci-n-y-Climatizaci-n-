package com.app.tddt4iots.service.impl;

import com.app.tddt4iots.service.*;
import com.app.tddt4iots.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.app.tddt4iots.entities.*;
import java.util.*;
import java.lang.*;
import java.io.*;

@Service
public class AdminServiceImpl implements AdminService {     
    @Autowired
    AdminRepository adminRepository;
    
	@Override 
	public void setConfiguration(int configurationId, Boolean state, Boolean autoState, int autoTime) { 
	 	// Inside this block you can enter your code implementing the business logic you need. 
	} 
	@Override 
	public String authenticate(String name, String password) { 
	 	// Inside this block you can enter your code implementing the business logic you need. 
	 	String response = null; 
	 	return response; 
	 } 
    
}
