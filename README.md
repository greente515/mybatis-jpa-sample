## Sample Project

* 스펙  
  * AdoptOpenJDK 11  
  * Spring Data JPA  
  * mybatis


* 구조

      src
      ┣ main
      ┃ ┣ java
      ┃ ┃ ┗ com
      ┃ ┃ ┃ ┗ example
      ┃ ┃ ┃ ┃ ┗ sample
      ┃ ┃ ┃ ┃ ┃ ┣ common
      ┃ ┃ ┃ ┃ ┃ ┃ ┣ config
      ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ JpaDataSourceConfig.java
      ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ MybatisDataSourceConfig.java
      ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ PrimaryDataSourceConfig.java
      ┃ ┃ ┃ ┃ ┃ ┃ ┗ exception
      ┃ ┃ ┃ ┃ ┃ ┣ sample
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
      ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ SampleJpaRepository.java
      ┃ ┃ ┃ ┃ ┃ ┃ ┗ service
      ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ impl
      ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ SampleServiceImpl.java
      ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ SampleService.java
      ┃ ┃ ┃ ┃ ┃ ┗ SampleApplication.java
      ┃ ┗ resources
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
      ┃ ┃ ┃ ┃ ┣ database
      ┃ ┃ ┃ ┃ ┃ ┗ DatabaseApplicationTests.java
      ┃ ┃ ┃ ┃ ┗ sample
      ┃ ┃ ┃ ┃ ┃ ┣ sample
      ┃ ┃ ┃ ┃ ┃ ┃ ┣ controller
      ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ SampleControllerTest.java
      ┃ ┃ ┃ ┃ ┃ ┃ ┣ persistence
      ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ mapper
      ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ SampleMapperTest.java
      ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ repository
      ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ SampleJpaRepositoryTest.java
      ┃ ┃ ┃ ┃ ┃ ┃ ┗ service
      ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ SampleServiceTest.java
      ┃ ┃ ┃ ┃ ┃ ┗ SampleApplicationTests.java
      ┃ ┣ resources
      ┃ ┃ ┗ application-test.yml
      ┃ ┗ rest
      ┃ ┃ ┣ http-client.env.json
      ┃ ┃ ┗ Sample.http  

 
