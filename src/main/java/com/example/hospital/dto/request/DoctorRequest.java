package com.example.hospital.dto.request;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class DoctorRequest{
    private Long doctorId;
    private String doctorName;
    private String doctorMajor;
    private String doctorDay;
}
