package com.example.sample.basic.persistence.repository;

import com.example.sample.basic.entity.Sample;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Sample JpaRepository interface
 */

public interface SampleJpaRepository extends JpaRepository<Sample, Long>, SampleCustomRepository {
}
