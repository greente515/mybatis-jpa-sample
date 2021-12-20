package com.example.sample.basic.controller;

import com.example.sample.basic.dto.SampleResponse;
import com.example.sample.basic.service.SampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Sample RestController
 */

@RequiredArgsConstructor
@RestController
public class SampleController {

    private final SampleService sampleService;

    /**
     * JpaRepository 를 사용한 전체 리스트
     * @return
     */
    @GetMapping("/test/findAll")
    public List<SampleResponse> findAll() {
        return sampleService.findAll();
    }

    /**
     * JpaRepository 를 사용한 1개 리스트
     * @return
     */
    @GetMapping("/test/findOne/{id}")
    public SampleResponse findOne(@PathVariable Long id) {
        return sampleService.findOne(id);
    }

    /**
     * MybatisMapper 를 사용한 1개 리스트
     * @return
     */
    @GetMapping("/test/findOne2/{id}")
    public SampleResponse findOne2(@PathVariable Long id) {
        return sampleService.findOneByMapper(id);
    }

    /**
     * QueryDsl 을 사용한 전체 리스트
     * @return
     */
    @GetMapping("/test/findAll2")
    public List<SampleResponse> findAllByQueryDsl() {
        return sampleService.findAllByQueryDsl();
    }
}
