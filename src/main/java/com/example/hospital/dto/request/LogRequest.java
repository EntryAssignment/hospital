package com.example.hospital.dto.request;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class LogRequest{
    private Long logId;
    private Long logDate;
    private String logHistory;
    private Long patientId;
    private Long doctorId;
}
