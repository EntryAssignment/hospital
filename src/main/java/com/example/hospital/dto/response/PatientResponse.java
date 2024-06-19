package com.example.hospital.dto.response;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class PatientResponse{
    private long patientId;

    private static List<PatientResponse> responseList;
}
