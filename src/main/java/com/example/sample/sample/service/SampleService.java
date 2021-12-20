package com.example.sample.sample.service;

import com.example.sample.sample.dto.SampleResponse;

import java.util.List;

/**
 * Sample Service interface
 */

public interface SampleService {

    /**
     * JpaRepository 를 사용한 전체 리스트 테스트
     *
     * @return SampleResponse 리스트
     */
    public List<SampleResponse> findAll();

    /**
     * JpaRepository 를 사용한 1개 리스트 테스트
     *
     * @param id
     * @return SampleResponse
     */
    public SampleResponse findOne(Long id);

    /**
     * mybatis mapper 를 사용한 1개 리스트 테스트
     *
     * @param id
     * @return SampleResponse
     */
    public SampleResponse findOneByMapper(Long id);
}
