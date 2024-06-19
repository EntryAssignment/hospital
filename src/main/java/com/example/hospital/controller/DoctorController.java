package com.example.hospital.controller;

import com.example.hospital.dto.request.DoctorRequest;
import com.example.hospital.dto.response.DoctorListResponse;
import com.example.hospital.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
@RequiredArgsConstructor
public class DoctorController {
    private final DoctorCreateService doctorCreateService;
    private final DoctorDeleteService doctorDeleteService;
    private final DoctorQueryService doctorQueryService;

    @PostMapping
    public void createDoctor(
            @RequestBody DoctorRequest doctorRequest){
        doctorCreateService.createDoctor(doctorRequest);
    }

    @DeleteMapping("/{id}")
    public void deleteDoctor(
            @PathVariable Long id, @RequestBody DoctorRequest doctorRequest){
        doctorDeleteService.deleteDoctor(id, doctorRequest);
    }
    @GetMapping()
    public List<DoctorListResponse> queryDoctor(){
        return doctorQueryService.queryDoctor();
    }
}
