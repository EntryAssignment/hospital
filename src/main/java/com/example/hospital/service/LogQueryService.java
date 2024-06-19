package com.example.hospital.service;

import com.example.hospital.dto.response.LogListResponse;
import com.example.hospital.repository.LogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LogQueryService {
    private final LogRepository logRepository;

    public List<LogListResponse> queryLog(){
        return logRepository.findAll()
                .stream()
                .map(LogListResponse::new)
                .toList();
    }
}
