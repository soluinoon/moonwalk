package com.project.moonwalk.service;

import com.project.moonwalk.dto.WalkingRecordRequestDto;
import com.project.moonwalk.dto.WalkingRecordResponseDto;
import com.project.moonwalk.repository.WalkingRecordRepository;
import org.springframework.stereotype.Service;

@Service
public class WalkingRecordService {
    private final WalkingRecordRepository walkingRecordRepository;

    public WalkingRecordService(WalkingRecordRepository walkingRecordRepository) {
        this.walkingRecordRepository = walkingRecordRepository;
    }

    public void save(WalkingRecordRequestDto walkingRecordRequestDto) {

    }
}
