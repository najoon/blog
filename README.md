# 블로그 프로젝트
* base-package : com.tandu.blog

## DB 연결
* MySQL 의 DB name 정하기

## table
* name 아직 안정했음

## DB 연결을 위한 Dependency 설정
* Spring-jdbc
* commons-dbcp2
* mybatis
* mybatis-spring
* mysq-connector/J
* spring-framework : 5.2.22.REL
* lombok
* logback-classic

## package 생성
* model package, persistance package 

## mapper folder 생성
* /WEB-INF/spring/mapper

## VO 클래스
* tbl_name를 참조하여 각각 VO 를 model package 에 생성

## Dao 인터페이스
* persistance.GenericDao interface  
selectAll(), findById(), insert(), update(), delete() method 선언