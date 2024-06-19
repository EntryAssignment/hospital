package com.example.hospital.service;

import com.example.hospital.dto.request.DoctorRequest;
import com.example.hospital.entity.Doctor;
import com.example.hospital.repository.DoctorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DoctorDeleteService {
    private final DoctorRepository doctorRepository;

    public void deleteDoctor(Long id, DoctorRequest request){
        Doctor doctor = doctorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(""));
        if(!doctor.getDoctorName().equals(request.getDoctorName())){
            throw new RuntimeException("");
        }
        doctorRepository.delete(doctor);
    }
}
