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
      ┃ ┃ ┃ ┗ stagex  
      ┃ ┃ ┃ ┃ ┗ api  
      ┃ ┃ ┃ ┃ ┃ ┣ common  
      ┃ ┃ ┃ ┃ ┃ ┃ ┣ config  
      ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ JpaDataSourceConfig.java  
      ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ MybatisDataSourceConfig.java  
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
      ┃ ┃ ┃ ┃ ┃ ┗ ApiApplication.java  
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
      ┃ ┃ ┃ ┗ stagex  
      ┃ ┃ ┃ ┃ ┗ api  
      ┃ ┃ ┃ ┃ ┃ ┣ sample  
      ┃ ┃ ┃ ┃ ┃ ┃ ┗ persistence  
      ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ repository  
      ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ SampleJpaRepositoryTest.java  
      ┃ ┃ ┃ ┃ ┃ ┗ ApiApplicationTests.java  
      ┃ ┗ rest  
      ┃ ┃ ┗ Sample.http  

 