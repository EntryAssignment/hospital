package com.example.hospital.service;

import com.example.hospital.dto.request.LogRequest;
import com.example.hospital.entity.Log;
import com.example.hospital.repository.LogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogCreateService {
    private final LogRepository logRepository;

    public void createLog(LogRequest request){
        logRepository.save(
                Log.builder()
                        .logId(request.getLogId())
                        .logHistory(request.getLogHistory())
                        .logDate(request.getLogDate())
                        .build()
        );
    }
}
