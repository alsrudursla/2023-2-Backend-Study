### HTTP
##### < HTTP 란 >
* HyperText Transfer Protocol
* 서로 다른 시스템들이 통신하게 해주는 application 계층의 protocol
* 웹에서만 사용

##### < HTTP 특징 >
###### 1. Transfer Layer
    - TCP/IP 기반으로 서버와 클라이언트 간 요청&응답 전송
    
    1.1 TCP - Transmission Control Protocol
    - 연결형 : 패킷 교환
    - 흐름 제어 및 혼잡 제어
    - 높은 신뢰성
    - 3-way handshaking (수신 여부 확인)
    - 1:1 통신
    - UDP 보다 느린 속도

    1.2 UDP - User Datagram Protocol
    - 비연결형 : 데이터그램
    - 헤더의 Checksum 필드로 최소한의 오류만 검출
    - 낮은 신뢰성
    - 수신 여부 확인하지 않음
    - 1:1 / 1:N / N:N 통신
    - TCP 보다 빠른 속도

###### 2. 비 연결형 (Connectionless)
    - 클라이언트&서버 연결 후 서버 응답 종료 시 연결 해제

###### 3. 무상태성 (Stateless)
    - 데이터 유지 X
    - 연결 정보 저장 X

##### < HTTP 연결 >
1. TCP 연결
2. 메세지 전송
3. 응답 확인
4. 연결 해제 or 재사용

##### < HTTP Message >
* 요청 (request)
  * headers + method + path + version
* 응답 (response)

##### < HTTP Method >
* GET : 데이터 조회
* POST : 요청 데이터 처리, 등록
* PUT : 데이터 대체 or 생성
* PATCH : 데이터 변경
* DELETE : 데이터 삭제

##### < HTTP 상태 코드 >
* 1xx : 요청 처리 중
* 2xx : 요청 정상 처리
* 3xx : 요청 완료까지 추가 행동 필요
* 4xx : 클라이언트 오류 (ex. 잘못된 문법)
* 5xx : 서버 오류

---
### HTTPS
* HyperText Transfer Protocol Secure
* HTTP + SSL/TLS
* 암호화된 연결 설정

---
### HTTP vs. HTTPS
    1. 기본 포트
    HTTP : 80
    HTTPS : 443

    2. 장점
    HTTP : 인터넷 통신
    HTTPS : 보안 + 검색 엔진 최적화

    3. 용도
    HTTP : 단순한 정보 조회
    HTTPS : 개인 정보 (민감한 데이터)

---
### RESTful API 의 URI 설계하기
* 이벤트 목록 조회
  * GET /events/list
* 이벤트 조회
  * GET /events/{eventId}
* 이벤트 등록
  * POST /events
* 이벤트 수정
  * PUT /events/{eventId}
* 이벤트 삭제
  * DELETE /events/{eventId}
* 이벤트 상태 변경
  * PATCH /events/{eventId}
* 특정 이벤트의 주문 목록 조회
  * GET /events/{eventId}/list
* 멤버 목록 조회
  * GET /members/list
* 특정 멤버 권한 변경
  * PATCH /members/{memberId}
* 특정 멤버 정보 조회
  * GET /members/{memberId}
* 특정 멤버 정보 변경
  * PUT /members/{memberId}
* 멤버 등록
  * POST /members
