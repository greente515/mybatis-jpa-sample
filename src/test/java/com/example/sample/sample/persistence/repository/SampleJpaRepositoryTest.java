package com.example.sample.sample.persistence.repository;

import com.example.sample.sample.entity.Sample;
import com.example.sample.common.config.JpaDataSourceConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("SampleJpaRepository 테스트")
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Import(JpaDataSourceConfig.class)
class SampleJpaRepositoryTest {

//    @Autowired
//    TestEntityManager testEntityManager;

    @Autowired
    SampleJpaRepository sampleJpaRepository;

//    @BeforeEach
//    void setUp() {
//        Sample build = Sample.builder()
//                .name("test111")
//                .build();
//
//        testEntityManager.persist(build);
//    }

    @DisplayName("1. 저장 테스트")
    @Test
    void save() {
        //given
        String name = "testCode1";

        Sample build = Sample.builder()
                .name(name)
                .build();

        //when
        Sample save = sampleJpaRepository.save(build);

        //then
        assertEquals(name, save.getName());
    }

    @DisplayName("2. id를 이용 해서 1개 데이터 조회 테스트")
    @Test
    void findOne() {
        //given
        Long id = 1L;

        //when
        Optional<Sample> one = sampleJpaRepository.findById(id);

        //then
        assertEquals(id, one.get().getId());
    }
}