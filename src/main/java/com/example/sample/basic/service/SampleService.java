package com.example.sample.basic.service;

import com.example.sample.basic.dto.SampleResponse;

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

    /**
     * QueryDsl 을 사용한 전체 리스트 테스트
     * @return
     */
    public List<SampleResponse> findAllByQueryDsl();
}
