package com.example.hospital.dto.response;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class DoctorResponse {
    private long doctorId;

    private static List<DoctorResponse> responseList;
}
