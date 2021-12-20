package com.example.sample.common.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@Configuration
@MapperScan(
        basePackages = "com.stagex.api.sample.persistence.mapper",
        sqlSessionFactoryRef = "sqlSessionFactory"
)
public class MybatisDataSourceConfig extends PrimaryDataSourceConfig {

    private static final String CONFIG_LOCATION = "classpath:mybatis/mybatis-config.xml";

    private static final String MAPPER_LOCATIONS = "classpath:mybatis/**/*-mapper.xml";

    /**
     * mybatis
     * DataSource 를 참조 하여 Mybatis 와 Mysql 서버를 연동, SqlSession 을 사용하 기 위해 사용
     *
     * @param dataSource
     * @return SqlSession 을 찍어 내는 역할
     *
     * @throws Exception
     */
    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("dataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);

        sqlSessionFactoryBean.setConfigLocation(new PathMatchingResourcePatternResolver().getResource(CONFIG_LOCATION));
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(MAPPER_LOCATIONS));

        return sqlSessionFactoryBean.getObject();
    }

    /**
     * mybatis
     * mybatis 예외 처리나 session 의 생명 주기 관리
     *
     * @param sqlSessionFactory
     * @return SqlSession 을 구현 하고 코드 에서 SqlSession 을 대체 하는 역할
     */
    @Bean(name = "sqlSession")
    public SqlSessionTemplate sqlSessionTemplate(@Qualifier("sqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
