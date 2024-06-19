package com.example.hospital.service;

import com.example.hospital.dto.request.DoctorRequest;
import com.example.hospital.entity.Doctor;
import com.example.hospital.repository.DoctorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DoctorCreateService {
    private final DoctorRepository doctorRepository;

    public void createDoctor(DoctorRequest request){
        doctorRepository.save(
                Doctor.builder()
                        .doctorId(request.getDoctorId())
                        .doctorName(request.getDoctorName())
                        .doctorMajor(request.getDoctorMajor())
                        .doctorDay(String.valueOf(request.getDoctorDay()))
                        .build()
        );
    }
}