package com.example.sample.common.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class PrimaryDataSourceConfig {

    @Bean
    @Primary
    @ConfigurationProperties("spring.datasource.primary")
    public DataSourceProperties getDataSourceProperties() {
        return new DataSourceProperties();
    }

    /**
     * connection pool 을 지원 하는 interface
     *
     * @return HikariDataSource
     */
    @Bean(name = "dataSource")
    @Primary
    @ConfigurationProperties("spring.datasource.primary.configuration")
    public HikariDataSource dataSource(DataSourceProperties properties) {
        return properties.initializeDataSourceBuilder().type(HikariDataSource.class).build();
    }
}
