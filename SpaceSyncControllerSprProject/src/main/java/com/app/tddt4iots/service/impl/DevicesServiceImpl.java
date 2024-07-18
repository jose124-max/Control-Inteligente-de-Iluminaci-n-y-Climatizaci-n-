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
public class DevicesServiceImpl implements DevicesService {     
    @Autowired
    DevicesRepository devicesRepository;
    
	@Override 
	public void activateDevice(int deviceid) { 
	 	// Inside this block you can enter your code implementing the business logic you need. 
	} 
	@Override 
	public void deactivateDevice(int deviceid) { 
	 	// Inside this block you can enter your code implementing the business logic you need. 
	} 
    
}
