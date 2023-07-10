### 노션 포트폴리오(세부 구현 내용은 링크를 통해 확인하실 수 있습니다)
[프로젝트 Review](https://www.notion.so/Review-1218362e0d224755ad1b31a0ff66f79f?pvs=21) <br><br>
[프로젝트 구현](https://www.notion.so/V1-91311bb6c9314334b87db061c58ca204?pvs=21) <br><br>
[프로젝트 Review](https://www.notion.so/Review-1218362e0d224755ad1b31a0ff66f79f?pvs=21) <br><br>






## 포트폴리오 목차

- 방향성
- 아키텍처
- 프로젝트 설명
- 프로젝트 소개
- 프로젝트 주요 목표
- 프로젝트 세부 설명<br><br>
    
    





## **프로젝트 방향성**

### 1. 사용한 코드는 완벽하게 이해

구글링을 하되 외부 정보는 참고로만 사용하고 제가 사용할 코드는 완벽하게 이해하고 직접 하나하나 타이핑했습니다. 

제가 이해하지 못하는 코드를 마주치면 우회해야할 장벽이 아니라 성장 할 수 있는 기회라 생각하고 분석하였습니다.

### 2. 필수적이고 기본적인 기술(CRUD & API 설계)

본 프로젝트에서는 백엔드 개발자로서 필수적이고 기본이라 여겨지는 CRUD 작업과 REST API에 초점을 맞추었습니다.

필수적인 기술인만큼 하나하나 원리를 이해하며 수행하였습니다.


### 3. 타인이 보기 편한 구성 - 클린 코드

다른 사람이 봐도 한눈에 프로젝트를 이해할 수 있게 단순명확한 변수명과 효율적인 로직을 구성했습니다.

코드는 저만 이해하면 되는 것이 아닌 타인이 이해할 수 있어야 합니다.

본 프로젝트를 실제 프로젝트라 생각하고 추가 설명없이 코드만 봐도 이해할 수 있도록 구성하였습니다.<br><br>




![image](https://github.com/MoonJaeSeung/Shopping/assets/108584477/2ec90963-7eb4-4eab-974c-9fd65b854d46)




# **E R D**

![image](https://github.com/MoonJaeSeung/shopping/assets/108584477/fc1a9f84-6a12-41ff-ba6c-f33b8a8b7d0a)


# Spring Security
![image](https://github.com/MoonJaeSeung/Shopping/assets/108584477/c507bea1-c04b-40c4-9887-66ee7ebe84c7)

SpringSecurity를 활용하여 인증 및 인가 절차를 간편하게 처리하였습니다.
SecurityConfig를 통해 보안규칙이 정의 된 필터체인을 구축하고 DB에서 가져온 값과 비교하여 인증 절차를 진행합니다. 이때 Bcrypt 기반으로 암호화를 진행하여 보안을 강화하고. Authenticaion 객체에 인증 정보를 저장하며 권한을 부여합니다.  

이를 통해 보안에 대한 신뢰성과 안정성을 높일 수 있었습니다.






# 쿼리 최적화
![image](https://github.com/MoonJaeSeung/Shopping/assets/108584477/34f02be5-1858-4b99-a04d-22e143d690f8)


Query의 성능을 향상시켜 응답시간을 빠르게 개선하고 효율적인 자원 사용 환경을 구축했습니다. FetchType을 Lazy로 전환하고 불필요한 조인이나 서브쿼리를 제거하는 등의 지속적인 쿼리 리팩터링과 캐싱 작업을 수행하였습니다.

이를 통해 사용자들에게 빠른 응답 및 원활한 서비스를 제공할 수 있는 환경을 구축했습니다.









# **Deep Dive**



[회원가입시 Member Entity가 아닌 MemberForm DTO를 활용하는 이유](https://iwin.tistory.com/86)



[Binding Result의 사용법](https://iwin.tistory.com/87)



[예외 처리 기능](https://iwin.tistory.com/88)



[Security Config를 활용한 로그인 및 권한 부여](https://iwin.tistory.com/89)



[사진 리스트 업로드](https://iwin.tistory.com/90)



[Ajax 통신](https://iwin.tistory.com/91)



[페이징 기능](https://iwin.tistory.com/101)



[FetchType.LAZY](https://iwin.tistory.com/99)



[JPA Repository & QueryDSL](https://iwin.tistory.com/100)

# 



# **Trouble Shooting**



[Named parameter not bound : email 파라미터 인바운드 에러](https://iwin.tistory.com/78)



[권한 문제](https://iwin.tistory.com/79)



[순환 참조 문제 발생](https://iwin.tistory.com/82)



[GIT 커밋 히스토리 내역만 지우기](https://iwin.tistory.com/75)


# 프로젝트 회고

[프로젝트 회고](https://www.notion.so/Review-1218362e0d224755ad1b31a0ff66f79f?pvs=21) 


## **C O N T A C T**

- Email | wotmdskfk32@naver.com
- Phone | 📞 010.5766.8843

- Github | https://github.com/MoonJaeSeung
- Blog | https://iwin.tistory.com/
 
