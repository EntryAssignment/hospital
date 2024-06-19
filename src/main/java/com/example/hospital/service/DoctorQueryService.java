package com.example.hospital.service;

import com.example.hospital.dto.response.DoctorListResponse;
import com.example.hospital.repository.DoctorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DoctorQueryService {
    private final DoctorRepository doctorRepository;

    public List<DoctorListResponse> queryDoctor(){
        return doctorRepository.findAll()
                .stream()
                .map(DoctorListResponse::new)
                .toList();
    }
}
