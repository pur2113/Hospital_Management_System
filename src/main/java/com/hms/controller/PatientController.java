package com.hms.controller;

import com.hms.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

    @Autowired
    private PatientService patientService;

    @DeleteMapping("/patients/{appointmentId}")
    public void cancelAppointment(@PathVariable Long appointmentId){
        patientService.cancelAppointment(appointmentId);
        return;
    }

}
