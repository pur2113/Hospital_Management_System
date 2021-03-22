package com.hms.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Test")
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "test_id")
    private int testID;

    @Column(name = "test_name")
    private String testName;

    private int cost;

    public Test(String testName, int cost) {
        this.testName = testName;
        this.cost = cost;
    }
}
