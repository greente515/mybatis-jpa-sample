package com.example.sample.basic.controller;

import com.example.sample.basic.service.impl.SampleServiceImpl;
import com.example.sample.basic.dto.SampleResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@DisplayName("SampleController 단위 테스트")
@ExtendWith(SpringExtension.class)
@WebMvcTest(SampleController.class)
class SampleControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    SampleServiceImpl sampleService;

    @DisplayName("1. 샘플 전체 조회 테스트")
    @Test
    void findAll() throws Exception {
        //given
        List<SampleResponse> list = Arrays.asList(sampleResponse1(), sampleResponse2());

        given(sampleService.findAll()).willReturn(list);

        //when
        ResultActions resultActions = mockMvc.perform(get("/test/findAll"))
                .andDo(print());

        //then
        resultActions.andExpect(status().isOk())
                .andExpect(content().string(containsString("test1")));
    }

    private SampleResponse sampleResponse1() {
        return SampleResponse.builder()
                .id(1L)
                .name("test1")
                .build();
    }

    private SampleResponse sampleResponse2() {
        return SampleResponse.builder()
                .id(1L)
                .name("test1")
                .build();
    }

}