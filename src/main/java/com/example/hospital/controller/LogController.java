package com.example.hospital.controller;

import com.example.hospital.dto.request.LogRequest;
import com.example.hospital.dto.response.LogListResponse;
import com.example.hospital.service.LogCreateService;
import com.example.hospital.service.LogDeleteService;
import com.example.hospital.service.LogQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/log")
@RequiredArgsConstructor
public class LogController {
    private final LogCreateService logCreateService;
    private final LogDeleteService logDeleteService;
    private final LogQueryService logQueryService;

    @PostMapping
    @RequestMapping("/log")
    public void createLog(
            @RequestBody LogRequest logRequest) {
        logCreateService.createLog(logRequest);
    }

    @DeleteMapping("{id}")
    public void deleteLog(
            @PathVariable Long id, @RequestBody LogRequest logRequest) {
        logDeleteService.deleteLog(id, logRequest);
    }

    @GetMapping()
    public List<LogListResponse> queryLog(){
        return logQueryService.queryLog();
    }
}
