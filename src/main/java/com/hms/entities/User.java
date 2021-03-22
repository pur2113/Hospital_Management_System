package com.hms.entities;

import com.hms.entities.Enum.RoleType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Table(name = "users",
        uniqueConstraints = {
        @UniqueConstraint(name = "user_email_unique",columnNames = "email")
        }
)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "role",nullable = false)
    private RoleType role;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "email", nullable = false)
    private String email;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "up_id")
    private UserProfile userProfile;

    @OneToMany(mappedBy = "doctor")
    List<Appointment> doctorsAppointment;

    @OneToMany(mappedBy = "patient")
    List<Appointment> patientsAppointment;

    @OneToMany(mappedBy = "doctor")
    List<Testimonial>  doctorTestimonials;

    @OneToMany(mappedBy = "patient")
    List<Testimonial> patientTestimonials;
}
