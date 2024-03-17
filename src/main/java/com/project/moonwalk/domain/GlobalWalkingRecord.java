package com.project.moonwalk.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
public class GlobalWalkingRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long globalWalkingCount; // 전체 유저 기록 수
    private BigDecimal globalWalkingDistance; // 전체 유저 달린거리
}
