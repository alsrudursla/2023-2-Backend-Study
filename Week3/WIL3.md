### Spring Bean 이란 무엇인가?
- Spring IoC 컨테이너에 의해 관리되는 자바 객체
    - Spring IoC 컨테이너 : 빈을 관리하는 객체 (ex. ApplicationContext)

#### Spring IoC 컨테이너가 빈을 관리하는 방법
1. Spring IoC 컨테이너 생성
2. 빈 스코프가 싱글톤인 객체 생성


    2.1 빈 스코프
    - 빈은 생성되고 존재하고 적용되는 범위를 지정할 수 있다
    - 종류 : 싱글톤(기본), 프로토타입, 웹 관련(request/session/application)
    - @Scope 어노테이션으로 지정

    2.2 싱글톤
    - 기본 스코프
    - 스프링 컨테이너 시작과 종료까지 유지되는 가장 넓은 범위의 스코프
    - 생성자의 접근 지정자 : private
    - 단점 : (1) 다형성 이용 불가 (상속 불가)
            (2) 단위 테스트 시행 어려움
            (3) 클라이언트가 구체 클래스에 의존(DIP,OCP 위반)
            (4) 내부 속성 변경, 초기화 어려움
            (5) 자식 클래스 만들기 어려움

    2.3 스프링의 싱글톤
    - 애플리케이션 시작 시, 메모리에 하나의 인스턴스 할당 후, 호출 시 해당 인스턴스를 반환하는 디자인 패턴
    - 이미 만들어진 객체를 공유하여 효율적인 사용 가능
    - IoC 컨테이너 : 싱글톤의 단점을 해결하면서 객체를 싱글톤으로 유지


3. 빈 생성 (자바 클래스, 싱글톤X)
4. IoC 컨테이너 의존 설정 (의존성 자동 주입)
    

    4.1 빈과 의존성 주입
    - new 키워드 사용하여 객체 생성
    - 의존성 주입 순서 파악


5. 객체 초기화
6. 빈 사용
7. 객체 소멸 (스프링 컨테이너 종료 시)

#### 빈 설정 방법
```java
@Configuration
public class Appconfig {
    @Bean
    public BeanA beanA() {
        return new BeanA();
    }

    @Bean
    public BeanB beanB() {
        return new BeanB(beanA());
    }

    @Bean
    public BeanC beanC() {
        return new BeanC(beanA());
    }
}
```
- @Configuration 어노테이션 사용
- @Bean 어노테이션 이용
- 주의사항
  - 싱클톤 스코프의 빈이 상태를 가지지 말 것
  - 의존성을 자동 주입 할 인터페이스의 구현체가 두 개 이상이라면 어노테이션을 이용해 우선 순위를 정할 것

<!------------------------------------------------>
<!------------------------------------------------>

### Spring Bean 을 등록하는 방법
#### Component Scan
- 스프링이 애플리케이션의 클래스를 검색하고, 자동으로 스프링 빈을 등록하는 방법
- @Component
  - 스프링 빈으로 등록하려는 클래스에 붙이는 어노테이션
- @ComponentScan
  - 스프링이 검색할 패키지 범위 설정
- 컴포넌트 스캔 대상
  - @Configuration
  - @Service
  - @Controller
  - @Repository

<!------------------------------------------------>
<!------------------------------------------------>
### 3주차 과제
1. 빈 등록

![componentscan](GDSC_3rd_HW/componentscan.png)


2. ClassA 싱글톤

![singleton](GDSC_3rd_HW/singleton.png)
