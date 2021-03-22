package com.hms.entities;

import com.hms.entities.Enum.DoctorStatus;
import com.hms.entities.Enum.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_profile")
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "phone_number", nullable = false)
    private Long phoneNo;

    @Enumerated(EnumType.STRING)
    @Column(name = "gender", nullable = false)
    private Gender gender;

    @Column(name = "address", nullable = false)
    private String address;

    private String education;

    private int experience;

    private String specialisation;

    @Enumerated(EnumType.STRING)
    private DoctorStatus status;

    @OneToOne(fetch = FetchType.LAZY , cascade = CascadeType.ALL, mappedBy = "userProfile")
    private User user;


}