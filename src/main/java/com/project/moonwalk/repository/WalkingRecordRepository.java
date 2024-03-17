package com.project.moonwalk.repository;

import com.project.moonwalk.domain.WalkingRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WalkingRecordRepository extends JpaRepository<WalkingRecord, Long> {
}
