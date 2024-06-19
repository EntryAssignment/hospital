package com.example.hospital.controller;

import com.example.hospital.dto.request.PatientRequest;
import com.example.hospital.dto.response.PatientListResponse;
import com.example.hospital.service.PatientCreateService;
import com.example.hospital.service.PatientDeleteService;
import com.example.hospital.service.PatientQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
@RequiredArgsConstructor
public class PatientController {

    private final PatientCreateService patientCreateService;
    private final PatientDeleteService patientDeleteService;
    private final PatientQueryService patientQueryService;

    @PostMapping
    public void createPatient(
            @RequestBody PatientRequest patientRequest) {
        patientCreateService.createPatient(patientRequest);
    }

    @DeleteMapping("{id}")
    public void deletePatient(
            @PathVariable Long id, @RequestBody PatientRequest patientRequest) {
        patientDeleteService.deletePatient(id, patientRequest);
    }

    @GetMapping()
    public List<PatientListResponse> queryPatient(){
        return patientQueryService.queryPatient();
    }
}
