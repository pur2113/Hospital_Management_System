package com.hms.services;

import com.hms.entities.Appointment;
import com.hms.entities.Testimonial;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public interface PatientService {
    public void cancelAppointment(Long appointmentId);
  
//    public List<Slots> fetchSlots(Long doctorId, LocalDateTime from, LocalDateTime to);
}
