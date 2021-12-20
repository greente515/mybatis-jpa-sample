package com.example.sample.common.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(
        basePackages = "com.example.sample.basic.persistence.repository",
        entityManagerFactoryRef = "entityManagerFactory",
        transactionManagerRef = "transactionManager"
)
public class JpaDataSourceConfig extends PrimaryDataSourceConfig {

    private static final String SAMPLE_PACKAGES = "com.example.sample.basic.entity";

    private static final String PERSISTENCE_UNIT = "primary";

    /**
     * DataSource 와 mapper 를 스캔할 .xml 경로를 지정 하듯이 dataSource 와 entity 가 저장된 폴더 경로를 매핑
     *
     * @param builder
     * @param dataSource
     * @return EntityManager 를 생성 하는 factory
     */
    @Bean(name = "entityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder, @Qualifier("dataSource") DataSource dataSource) {
        return builder
                .dataSource(dataSource)
                .packages(SAMPLE_PACKAGES)
                .persistenceUnit(PERSISTENCE_UNIT)
                .build();
    }

    /**
     * EntityManagerFactory 를 전달 받아 JPA 에서 transaction 을 관리
     *
     * @param managerFactoryBean
     * @return JpaTransactionManager
     */
    @Bean(name = "transactionManager")
    public JpaTransactionManager transactionManager(@Qualifier("entityManagerFactory") EntityManagerFactory managerFactoryBean) {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(managerFactoryBean);

        return transactionManager;
    }
}
