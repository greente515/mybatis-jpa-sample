package com.example.sample.basic.persistence.repository;

import com.example.sample.basic.entity.Sample;

import java.util.List;

/**
 * QueryDsl interface
 */
public interface SampleCustomRepository {

    /**
     * QueryDsl 사용한 전체 리스트
     * @return
     */
    List<Sample> findAllWithDistinct();
}
