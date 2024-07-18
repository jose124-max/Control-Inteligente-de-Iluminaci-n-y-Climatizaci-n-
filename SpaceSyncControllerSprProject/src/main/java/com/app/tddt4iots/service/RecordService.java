package com.app.tddt4iots.service;

import org.springframework.stereotype.Service;
import com.app.tddt4iots.entities.*;
import java.util.Date;
import java.time.LocalTime;
import java.math.BigDecimal;

@Service
public interface RecordService {     
    public void registerOnOff(int deviceId, Date date, LocalTime timeOn, LocalTime timeOff, BigDecimal electricConsumption); 
}
