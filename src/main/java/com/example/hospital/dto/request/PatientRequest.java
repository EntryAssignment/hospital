package com.example.hospital.dto.request;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PatientRequest {
    private String patientName;
    private Long patientBirth;
}
