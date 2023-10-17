# MVC
## MVC 란?
**Model-View-Controller**

- 주로 웹 어플리케이션과 그 외 사용자 인터페이스를 가진 어플리케이션 설계 시 사용하는 디자인 패턴
- 어플리케이션의 데이터 처리 & 사용자 인터페이스 & 제어 로직 → 분리

### 1. Model (모델)
- 데이터와 비즈니스 로직 처리
- 데이터베이스와의 상호 작용 (쿼리 실행, 데이터 저장 및 조회)
- 변경 발생 시, View 에 알림

### 2. View (뷰)
- 화면에 표시되는 UI (User Interface) 부분
- 데이터 표시 / 인터페이스 표시

### 3. Controller (컨트롤러)
- Model & View 사이 중개자 역할
- 클라이언트 요청 → Model 컴포넌트 호출 (실제 업무 수행) → View 에 결과 전달

## MVC 의 장점
- **분리 및 재사용** : 각 컴포넌트는 독립적
- **유지 보수** : 해당 컴포넌트만 수정 가능
- **확장성** : 새로운 기능 or 로직 추가 용이

## Spring MVC
### Spring 의 클라이언트 요청 처리 방식
1. 클라이언트가 url 요청
2. 웹 브라우저에서 스프링으로 request 보냄
3. Dispatcher Servlet 이 request 를 받은 후, Handler Mapping 을 통해 해당 url 담당 Controller 로 request 보냄 
4. Model 구성 : 쿼리문을 통해 DB에 접근
5. 얻은 Model 정보를 Controller 에 response
6. Controller 는 모델을 완성하여 Dispatcher Servlet 에 전달
7. Dispatcher Servlet 은 View Resolver 를 통해 request 에 해당하는 view 파일 탐색
8. 찾은 View 페이지 파일에 Model 을 보낸 후 클라이언트에 보낼 페이지 받음
9. 완성된 View 파일을 클라이언트에 response
10. 화면에 출력
