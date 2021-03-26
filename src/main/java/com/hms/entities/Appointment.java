package com.hms.entities;

import com.hms.entities.Enum.AppointmentStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "appointment")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appointment_id")
    private Long appointmentId;

    private LocalDateTime date;

    @Enumerated(EnumType.STRING)
    @Column(length = 15)
    private AppointmentStatus status;

    @Column(length = 30)
    private String disease;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    User doctor;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    User patient;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "bill_id")
    private Bill bill;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "appointment_id", referencedColumnName = "appointment_id")
    List<Test> tests = new ArrayList<>();
}
