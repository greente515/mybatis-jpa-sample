## Sample Project

* 스펙  
  * AdoptOpenJDK 11  
  * Spring Data JPA  
  * mybatis (cf.https://m.blog.naver.com/kim_jin_sol/221789017884)
  * QueryDsl (cf.https://jaime-note.tistory.com/79)
  * liquibase : DB 형상 관리를 위해서 (cf.https://docs.liquibase.com/concepts/basic/changelog.html)  
  (cf.https://otrodevym.tistory.com/entry/spring-boot-%EC%8B%9C%EC%9E%91%ED%95%98%EA%B8%B0-5-liquibase-%EC%84%A4%EC%A0%95-%EB%B0%8F-%EC%97%B0%EB%8F%99?category=815039)  
  * Spring RestDocs


* 구조

      src
      ┣ main
      ┃ ┣ java
      ┃ ┃ ┗ com
      ┃ ┃ ┃ ┗ example
      ┃ ┃ ┃ ┃ ┗ sample
      ┃ ┃ ┃ ┃ ┃ ┣ basic
      ┃ ┃ ┃ ┃ ┃ ┃ ┣ controller
      ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ SampleController.java
      ┃ ┃ ┃ ┃ ┃ ┃ ┣ dto
      ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ SampleResponse.java
      ┃ ┃ ┃ ┃ ┃ ┃ ┣ entity
      ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ Sample.java
      ┃ ┃ ┃ ┃ ┃ ┃ ┣ persistence
      ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ mapper
      ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ SampleMapper.java
      ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ repository
      ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ SampleCustomRepository.java
      ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ SampleCustomRepositoryImpl.java
      ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ SampleJpaRepository.java
      ┃ ┃ ┃ ┃ ┃ ┃ ┗ service
      ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ impl
      ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ SampleServiceImpl.java
      ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ SampleService.java
      ┃ ┃ ┃ ┃ ┃ ┣ common
      ┃ ┃ ┃ ┃ ┃ ┃ ┣ config
      ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ JpaDataSourceConfig.java
      ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ MybatisDataSourceConfig.java
      ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ PrimaryDataSourceConfig.java
      ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ QueryDslConfig.java
      ┃ ┃ ┃ ┃ ┃ ┃ ┗ exception
      ┃ ┃ ┃ ┃ ┃ ┗ SampleApplication.java
      ┃ ┗ resources
      ┃ ┃ ┣ database : liquibase
      ┃ ┃ ┃ ┗ changelog
      ┃ ┃ ┃ ┃ ┣ db.changelog-1.0.xml
      ┃ ┃ ┃ ┃ ┗ db.changelog-master.xml
      ┃ ┃ ┣ mybatis
      ┃ ┃ ┃ ┣ mappers
      ┃ ┃ ┃ ┃ ┗ sample-mapper.xml
      ┃ ┃ ┃ ┗ mybatis-config.xml
      ┃ ┃ ┣ static
      ┃ ┃ ┣ templates
      ┃ ┃ ┣ application.yml
      ┃ ┃ ┗ schema.sql
      ┗ test
      ┃ ┣ java
      ┃ ┃ ┗ com
      ┃ ┃ ┃ ┗ example
      ┃ ┃ ┃ ┃ ┗ sample
      ┃ ┃ ┃ ┃ ┃ ┣ basic
      ┃ ┃ ┃ ┃ ┃ ┃ ┣ controller
      ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ SampleControllerTest.java
      ┃ ┃ ┃ ┃ ┃ ┃ ┣ persistence
      ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ mapper
      ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ SampleMapperTest.java
      ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ repository
      ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ SampleJpaRepositoryTest.java
      ┃ ┃ ┃ ┃ ┃ ┃ ┗ service
      ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ SampleServiceTest.java
      ┃ ┃ ┃ ┃ ┃ ┣ common
      ┃ ┃ ┃ ┃ ┃ ┃ ┗ config
      ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ TestQueryDslConfig.java
      ┃ ┃ ┃ ┃ ┃ ┗ SampleApplicationTests.java
      ┃ ┣ resources
      ┃ ┃ ┗ application-test.yml
      ┃ ┗ rest
      ┃ ┃ ┣ http-client.env.json
      ┃ ┃ ┗ Sample.http