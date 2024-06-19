package com.example.hospital.dto.response;

import com.example.hospital.entity.Doctor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class DoctorListResponse {
    private String doctorName;
    private String doctorDay;
    private String doctorMajor;

    public DoctorListResponse(Doctor doctor){
        this.doctorName = doctor.getDoctorName();
        this.doctorDay = doctor.getDoctorDay();
        this.doctorMajor = doctor.getDoctorMajor();
    }
}