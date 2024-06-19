package com.example.hospital.dto.response;

import com.example.hospital.entity.Patient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class PatientListResponse {
    private String patientName;
    private Long patientBirth;

    public PatientListResponse(Patient patient){
        this.patientName = patient.getPatientName();
        this.patientBirth = patient.getPatientBirth();
    }
}
