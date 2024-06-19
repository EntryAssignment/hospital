package com.example.hospital.dto.response;

import com.example.hospital.entity.Log;
import lombok.Getter;

@Getter
public class LogResponse {
    private final long id;

    private final long date;

    private String history;

    public LogResponse(Log log){
        this.id = log.getLogId();
        this.date = log.getLogDate();
    }
}
