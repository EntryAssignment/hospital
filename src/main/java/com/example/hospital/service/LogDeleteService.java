package com.example.hospital.service;

import com.example.hospital.dto.request.LogRequest;
import com.example.hospital.entity.Log;
import com.example.hospital.repository.LogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogDeleteService {
    private final LogRepository logRepository;

    public void deleteLog(Long id, LogRequest logRequest){
        Log log = logRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(""));
        logRepository.delete(log);
    }
}
