package com.app.tddt4iots.service.impl;
import java.math.BigDecimal;
import com.app.tddt4iots.service.*;
import com.app.tddt4iots.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.app.tddt4iots.entities.*;
import java.time.LocalTime;
import java.util.*;
import java.lang.*;
import java.math.BigDecimal;
import java.sql.Time;
import java.io.*;

@Service
public class RecordServiceImpl implements RecordService {     
    @Autowired
    RecordRepository recordRepository;

	@Override
	public void registerOnOff(int deviceId, Date date, LocalTime timeOn, LocalTime timeOff,
			BigDecimal electricConsumption) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'registerOnOff'");
	} 
    
}
