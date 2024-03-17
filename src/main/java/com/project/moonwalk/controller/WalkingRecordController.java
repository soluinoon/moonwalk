package com.project.moonwalk.controller;

import com.project.moonwalk.dto.WalkingRecordRequestDto;
import com.project.moonwalk.dto.WalkingRecordResponseDto;
import com.project.moonwalk.service.WalkingRecordService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/walking")
public class WalkingRecordController {
    private final WalkingRecordService walkingRecordService;

    public WalkingRecordController(WalkingRecordService walkingRecordService) {
        this.walkingRecordService = walkingRecordService;
    }

    @GetMapping("/{id}")
    public WalkingRecordResponseDto getWalkingRecord(@PathVariable Long id) {

    }

    @GetMapping
    public WalkingRecordResponseDto getWalkingRecordByNickname(@RequestParam String nickname) {

    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void walk(@RequestBody WalkingRecordRequestDto walkingRecordRequestDto) {
        walkingRecordService.save(walkingRecordRequestDto);
    }
}
