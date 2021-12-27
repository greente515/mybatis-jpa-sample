package com.example.sample.basic.persistence.repository;

import com.example.sample.basic.entity.QSample;
import com.example.sample.basic.entity.Sample;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * QueryDsl
 */
@RequiredArgsConstructor
public class SampleCustomRepositoryImpl implements SampleCustomRepository {

    private final JPAQueryFactory jpaQueryFactory;

    private final QSample qSample = QSample.sample;

    @Override
    public List<Sample> findAllWithDistinct() {
        return jpaQueryFactory.selectFrom(qSample)
                .distinct()
                .fetch();
    }
}
