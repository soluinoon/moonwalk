package com.project.moonwalk.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class WalkingRecordRequestDto {
    private String nickname;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private BigDecimal distance;
    private BigDecimal maxSpeed;
    private BigDecimal averageSpeed;
}
