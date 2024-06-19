package com.example.hospital.dto.response;

import com.example.hospital.entity.Log;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class LogListResponse {
    private Long logDate;
    private String logHistory;

    public LogListResponse(Log log){
        this.logDate = log.getLogDate();
        this.logHistory = log.getLogHistory();
    }
}
