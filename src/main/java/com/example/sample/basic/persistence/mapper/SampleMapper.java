package com.example.sample.basic.persistence.mapper;

import com.example.sample.basic.entity.Sample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * Sample Mybatis Mapper interface
 */

@Mapper
@Component
public interface SampleMapper {

    /**
     * Sample 1개 리스트
     *
     * @param id
     * @return
     */
    Sample findById1(Long id);

    /**
     * Sample DB insert
     *
     * @param sample
     * @return
     */
    int insert(Sample sample);
}
