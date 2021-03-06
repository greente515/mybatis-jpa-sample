package com.example.sample.sample.controller;

import com.example.sample.sample.dto.SampleResponse;
import com.example.sample.sample.service.SampleService;
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
     * JpaRepository 를 이용한 전체 리스트
     * @return
     */
    @GetMapping("/test/findAll")
    public List<SampleResponse> findAll() {
        return sampleService.findAll();
    }

    /**
     * JpaRepository 를 이용한 1개 리스트
     * @return
     */
    @GetMapping("/test/findOne/{id}")
    public SampleResponse findOne(@PathVariable Long id) {
        return sampleService.findOne(id);
    }

    /**
     * MybatisMapper 를 이용한 1개 리스트
     * @return
     */
    @GetMapping("/test/findOne2/{id}")
    public SampleResponse findOne2(@PathVariable Long id) {
        return sampleService.findOneByMapper(id);
    }
}
