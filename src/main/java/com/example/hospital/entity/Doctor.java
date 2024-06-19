package com.example.hospital.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
@Builder
@AllArgsConstructor
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long doctorId;
    private String doctorName;
    private String doctorMajor;
    private String doctorDay;

    public Doctor(String doctorName, String doctorMajor, String doctorDay){
        this.doctorName = doctorName;
        this.doctorDay = doctorDay;
        this.doctorMajor = doctorMajor;
    }
}
