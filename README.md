# Tesla webpage clone

## 소개

테슬라 웹 사이트를 Vue.js와 Spring boot 로 클론 코딩하는 프로젝트입니다.


## 개발 정보

- Front-end : Vue.js (upper 3.x)

- Back-end : SpringBoot (JAVA 11 - Azul Zulu Open JDK ARM )

- Database : (Operation) MySQL 5.7 , (Develop) H2 1.4.199

- Dependencies : Spring Web, Spring Security, DATA JPA, Lombok

  그 외 명시하지 않은 의존성들은 gradle에 명시되었거나 Spring의 자동 설정을 따릅니다.

- Other : node version (16.x.x)

## 실행

```bash
1. intelliJ에서 build.gradle 파일을 프로젝트로 열고 서버 실행 (Test는 H2, Application은 Mysql 연결 설정 별도 필요)
   (Open the build.gradle file as a project in intelliJ and run the server. (Test is H2, Application requires Mysql connection setup separately))
2. client 에서 npm install 후 npm run serve
   (Go to client, then npm install & npm run serve)
```

