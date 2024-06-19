package com.example.hospital.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Builder
@AllArgsConstructor
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long patientId;

    private String patientName;
    private Long patientBirth;

    public Patient(String patientName, Long patientBirth){
        this.patientName = patientName;
        this.patientBirth = patientBirth;
    }

    public void updatePatientName(String patientName){
        this.patientName = patientName;
    }
    public void updatePatientBirth(Long patientBirth){
        this.patientBirth = patientBirth;
    }
}
