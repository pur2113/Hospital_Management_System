package com.hms.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Bill")
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bill_id")
    private Long billId;

    private String description;

    @Column(name = "total_amount")
    private int totalAmount;

    @OneToOne(fetch = FetchType.LAZY , cascade = CascadeType.ALL, mappedBy = "bill")
    private Appointment appointment;
}
