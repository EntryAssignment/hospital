package com.example.hospital.service;

import com.example.hospital.dto.response.PatientListResponse;
import com.example.hospital.repository.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PatientQueryService {
    private final PatientRepository patientRepository;

    public List<PatientListResponse> queryPatient(){
        return patientRepository.findAll()
                .stream()
                .map(PatientListResponse::new)
                .toList();
    }
}
