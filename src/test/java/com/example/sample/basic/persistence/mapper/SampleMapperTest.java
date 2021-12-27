package com.example.sample.basic.persistence.mapper;

import com.example.sample.basic.entity.Sample;
import com.example.sample.common.config.MybatisDataSourceConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("SampleMapper 단위 테스트")
@DataJdbcTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Import(MybatisDataSourceConfig.class)
class SampleMapperTest {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    SampleMapper sampleMapper;

    @DisplayName("1. mybatis 이용 1개 데이터 조회 테스트")
    @Test
    void findById() {
        //given
        Long id = 1L;

        //when
        Sample byId1 = sampleMapper.findById1(id);

        //then
        assertEquals(id, byId1.getId());
    }
}