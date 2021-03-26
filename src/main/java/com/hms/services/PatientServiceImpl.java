package com.hms.services;

import com.hms.dao.AppointmentRepository;
import com.hms.entities.Appointment;
import com.hms.entities.Testimonial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService{

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Override
    public void cancelAppointment(Long appointmentId) {

        appointmentRepository.deleteById(appointmentId);
    }

    
}
