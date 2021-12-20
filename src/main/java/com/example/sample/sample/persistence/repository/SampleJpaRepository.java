package com.example.sample.sample.persistence.repository;

import com.example.sample.sample.entity.Sample;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Sample JpaRepository interface
 */

public interface SampleJpaRepository extends JpaRepository<Sample, Long> {
}
