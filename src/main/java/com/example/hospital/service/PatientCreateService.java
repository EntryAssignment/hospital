package com.example.hospital.service;

import com.example.hospital.dto.request.PatientRequest;
import com.example.hospital.entity.Patient;
import com.example.hospital.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientCreateService {
    private final PatientRepository patientRepository;

    public void createPatient(PatientRequest request){
        patientRepository.save(
                Patient.builder()
                        .patientName(request.getPatientName())
                        .patientBirth(request.getPatientBirth())
                        .build()
        );
    }
}