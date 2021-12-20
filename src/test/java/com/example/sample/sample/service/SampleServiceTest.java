package com.example.sample.sample.service;

import com.example.sample.sample.entity.Sample;
import com.example.sample.sample.persistence.repository.SampleJpaRepository;
import com.example.sample.sample.service.impl.SampleServiceImpl;
import com.example.sample.sample.dto.SampleResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.BDDMockito.given;

@DisplayName("SampleService 테스트")
@ExtendWith(MockitoExtension.class)
class SampleServiceTest {

    @InjectMocks
    SampleServiceImpl sampleService;

    @Mock
    SampleJpaRepository sampleJpaRepository;

    @DisplayName("1. id를 이용 해서 1개 데이터 조회 테스트")
    @Test
    void findOne() {
        //given
        Long id = 1L;
        String name = "test1";

        Optional<Sample> test1 = Optional.ofNullable(Sample.builder()
                .id(1L)
                .name("test1")
                .build());

//        Sample sample = sampleEntity();
//        SampleResponse response = sampleResponse(sample);

        given(sampleJpaRepository.findById(anyLong())).willReturn(test1);

        //when
        SampleResponse one = sampleService.findOne(id);

        //then
        assertEquals(id, one.getId());
        assertEquals(name, one.getName());
    }

//    private Sample sampleEntity() {
//        return Sample.builder()
//                .id(1L)
//                .name("test1")
//                .build();
//    }

//    private SampleResponse sampleResponse(Sample sample) {
//        return SampleResponse.builder()
//                .id(sample.getId())
//                .name(sample.getName())
//                .build();
//    }
}