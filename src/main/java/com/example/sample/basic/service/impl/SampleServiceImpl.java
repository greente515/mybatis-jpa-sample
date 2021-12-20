package com.example.sample.basic.service.impl;

import com.example.sample.basic.entity.Sample;
import com.example.sample.basic.persistence.mapper.SampleMapper;
import com.example.sample.basic.persistence.repository.SampleJpaRepository;
import com.example.sample.basic.service.SampleService;
import com.example.sample.basic.dto.SampleResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
@Service
public class SampleServiceImpl implements SampleService {

    private final SampleJpaRepository sampleJpaRepository;
    private final SampleMapper sampleMapper;

    public List<SampleResponse> findAll() {
        List<Sample> all = sampleJpaRepository.findAll();

        return all.stream()
                .map(response -> {
                    return SampleResponse.builder()
                            .id(response.getId())
                            .name(response.getName())
                            .build();
                })
                .collect(Collectors.toList());
    }

    public SampleResponse findOne(Long id) {
        Sample sample = sampleJpaRepository.findById(id).orElse(null);

        return SampleResponse.builder()
                .id(sample.getId())
                .name(sample.getName())
                .build();
    }

    public SampleResponse findOneByMapper(Long id) {
        Sample byId1 = sampleMapper.findById1(id);

        log.debug(byId1.toString());

        return SampleResponse.builder()
                .id(byId1.getId())
                .name(byId1.getName())
                .build();
    }

    @Override
    public List<SampleResponse> findAllByQueryDsl() {
        List<Sample> all = sampleJpaRepository.findAllWithDistinct();

        return all.stream()
                .map(response -> {
                    return SampleResponse.builder()
                            .id(response.getId())
                            .name(response.getName())
                            .build();
                })
                .collect(Collectors.toList());
    }
}
