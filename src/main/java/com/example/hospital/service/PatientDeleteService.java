package com.example.hospital.service;

import com.example.hospital.dto.request.PatientRequest;
import com.example.hospital.entity.Patient;
import com.example.hospital.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientDeleteService {
    private final PatientRepository patientRepository;

    public void deletePatient(Long id,PatientRequest request){
        Patient patient = patientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(""));
        if(!patient.getPatientName().equals(request.getPatientName())){
            throw new RuntimeException("");
        }
        patientRepository.delete(patient);
    }
}