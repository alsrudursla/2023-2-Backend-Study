### JAVA
##### < Java 란 >
* 객체지향 프로그래밍 언어

##### < Java 의 특징 >
###### 1. 운영체제에 독립적
    1.1 WORA - Write Once, Run Anywhere
    자바로 작성된 프로그램은 운영체제와 하드웨어에 관계없이 실행 가능

    1.2 JVM - Java Virtual Machine
    JVM 이란? : 자바 애플리케이션을 실행하는 데 사용되는 가상 머신

    -> OS 에 종속받지 않고 실행되기 위해선 OS 위에서 Java 를 실행시킬 무언가가 필요 === JVM

###### 2. 객체 지향 언어
    2.1 상속, 캡슐화, 다형성이 잘 적용된 순수한 객체 지향 언어
    
    2.2 재사용성과 유지 보수의 용이성

###### 3. 자동 메모리 관리
    3.1 Garbage Collection (GC)
    JVM 의 Heap 영역에서 동적으로 할당했던 메모리 영역 중 필요 없게 된 메모리 영역을 주기적으로 삭제하는 프로세스

###### 4. 네트워크와 분산 처리 지원

###### 5. 멀티 스레드 지원
    5.1 멀티 스레드 (multi thread)
    하나의 프로세스 내에서 둘 이상의 스레드가 동시에 작업 수행

###### 6. 동적 로딩 지원
    6.1 동적 로딩 (Dynamic Loading)
    JVM 은 ClassLoader 를 이용해 필요한 Class 를 loading

        6.1.1 Load-Time Dynamic Loading
        6.1.2 Run-Time Dynamic Loading

---
### 객체 지향 프로그래밍
##### < 객체 지향 프로그래밍이란 >
* **객체 지향** : 실세계를 직접적이고 직관적으로 모델링 할 수 있는 패러다임
* **객체 지향 프로그래밍** : 상태와 행위를 가진 객체 간의 상호작용을 통해 로직을 구성하는 프로그래밍 방법

##### < 객체 지향 프로그래밍 장점과 단점 >
* 장점
  * 코드의 재사용성
  * 유지보수에 용이
  * 대형 프로젝트에 적합 (클래스 단위로 모듈화)
* 단점
  * 상대적으로 느린 처리 속도
  * 객체가 많으면 용량이 커질 수 있음
  * 설계 시 많은 노력과 시간 필요

##### < 객체 지향 프로그래밍 특징 >
###### 1. 추상화
    1.1 객체에서 공통된 속성과 행위를 추출하는 것

    1.2 공통된 속성과 행위를 찾아 타입을 정의하는 과정

    1.3 불필요한 정보는 숨기고 필요한 정보만을 표현함으로써 프로그램을 간단하게 만드는 것

###### 2. 캡슐화
    2.1 변수와 함수를 하나로 묶는 것

    2.2 낮은 결합도를 유지할 수 있도록 설계하는 것

    2.3 변수와 메소드를 클래스에 넣어 분류하는 것
      - 재사용이 원활
      - 정보은닉 가능 (접근 제어자 활용)

###### 3. 상속
    3.1 클래스의 속성과 행위를 하위 클래스에 물려주거나 하위 클래스가 상위 클래스의 속성과 행위를 물려받는 것

    3.2 새로운 클래스가 기존 클래스의 데이터와 연산을 이용할 수 있게 하는 기능

    3.3 장점
      - 코드 재사용성
      - 범용적 사용
      - 자료와 메서드의 자유로운 사용 및 추가

###### 4. 다형성
    4.1 오버라이딩 (Overriding)
    상위 클래스가 가지고 있는 메소드를 하위 클래스가 재정의해서 사용

    4.2 오버로딩 (Overloading)
    같은 이름의 메서드가 인자의 개수나 자료형에 따라 다른 기능을 함

##### < 객체 지향 설계 원칙 (SOLID) >
1. 단일 책임 원칙 (SRP, Single Responsibility Principle)
* 하나의 클래스는 하나의 책임만 가지기

2. 개방-폐쇄 원칙 (OCP, Open/Closed Principle)
* 기능 변경/확장은 가능하지만, 기능 코드 수정은 하지 않기

3. 리스코프 치환 원칙 (LSP, Liskov Substitution Principle)
* 상위 타입의 객체를 하위 타입으로 치환해도, 상위 타입을 사용하는 프로그램이 정상적으로 동작하게 하기

4. 인터페이스 분리 원칙 (ISP, Interface Segregation Principle)
* 하나의 범용 인터페이스보다 클라이언트를 위한 인터페이스를 여러 개로 구성하기

5. 의존 관계 역전 원칙 (DIP, Dependency Inversion Principle)
* 추상화에 의존하기

---
### 자바의 객체 지향
##### < 클래스 >
* Product 클래스
```java
public class Product {
  // 멤버 변수 (상태) : 객체가 가질 수 있는 속성
  private String name;
  private int price;

  // 생성자 : 객체를 초기화 & 객체 상태 설정
  public Product(String name, int price) {
    this.name = name;
    this.price = price;
  }

  // Getter & Setter : 멤버 변수 접근 제어 및 데이터 무결성 유지
  public String getName() {
    return this.name;
  }
  public int getPrice() {
    return this.price;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setPrice(int price) {
    this.price = price;
  }
  
  // method : 객체의 행동 정의
  public void buy() {
    System.out.println("Purchase Completed");
  }
}
```

* Main 클래스
```java
public class Main {
    public static void main(String[] args) {
        // 객체 생성
        Product product = new Product("laptop", 200);
        
        // 객체 메서드 호출
        product.buy();
        
        // 멤버 변수 조회
        System.out.println("이름: "+ product.getName());
        System.out.println("가격: "+ product.getPrice());
        
        // 멤버 변수 수정 및 출력
        product.setName("computer");
        product.setPrice(100);

        System.out.println("이름: " + product.getName());
        System.out.println("가격: " + product.getPrice());
    }
}
```

##### < 캡슐화 >
* Product 클래스의 멤버 변수 name, price 를 private 으로 선언하여 외부 접근 방지
* getName, getPrice : 데이터 조회
* setName, setPrice : 데이터 설정

##### < 상속 >
```java
// Product 클래스를 상속받는 하위 클래스 Fruit 클래스
class Fruit extends Product {
    public Fruit(String name, int price) {
        // 상위 클래스 생성자 호출
        super(name, price);
    }
    
    // 하위 클래스메서 새로운 메서드 추가
    public void soldOut() {
        System.out.println("Sold Out");
    }
    
    @Override
    public void buy() {
        // 상위 클래스의 모든 멤버 변수와 메서드 상속 받아 호출 가능
        System.out.println("Purchase " + this.getName());
    }
}
```

##### < 다형성 >
* Device 클래스
```java
// Product 클래스(상위)를 상속받는 하위 클래스 Device 클래스
class Device extends Product {
    public Device(String name, int price) {
        super(name, price);
    }
    
    @Override
    public void buy() {
        System.out.println("Purchase "+ this.getName());
    }
}
```

* Main 클래스
```java
public class Main {
    public static void main(String[] args) {
        // 다형성을 이용하여 객체 생성
        Fruit fruit = new Fruit("apple", 10);
        Device device = new Device("phone", 100);
        
        // 다형성을 통한 메서드 호출 (오버라이딩) : 다양한 동작 구현 가능
        fruit.buy();
        device.buy();
  }
}
```

##### < 추상화 >
```java
abstract class Shape {
    // 추상 메서드
    public abstract double areaSize();
}

class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    
    // 원 넓이 계산
    @Override
    public double areaSize() {
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape {
    private double width;
    private double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    // 삼각형 넓이 계산
    @Override
    public double areaSize() {
        return 0.5 * width * height;
    }
}

public class Main {
    public static void main(String[] args) {
        // 객체 생성
        Circle circle = new Circle(1.0);
        Triangle triangle = new Triangle(3.0, 4.0);
        
        Shape[] shapes = {circle, triangle};
        
        // 모든 도형 넓이 계산
        for (Shape shape : shapes) {
            System.out.println("넓이: "+ shape.areaSize());
        }
    }
}
```

---
## 1주차 과제

###### 1. Calculator.java
```java
public interface Calculator {
    int plus(int a, int b);
    int minus(int a, int b);
    int mul(int a, int b);
    int div(int a, int b);
}
```

###### 2. CalculatorImpl.java
```java
public class CalculatorImpl implements Calculator{

    @Override
    public int plus(int A, int B) {
        return A + B;
    }

    @Override
    public int minus(int A, int B) {
        return A - B;
    }

    @Override
    public int mul(int A, int B) {
        return A * B;
    }

    @Override
    public int div(int A, int B) {
        return A / B;
    }
}
```

###### 3. Animal.java
```java
public abstract class Animal {
    public abstract void speak();
}
```

###### 4. Cat.java
```java
public class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("cat says Meow!");
    }
}
```

###### 5. Dog.java
```java
public class Dog extends Animal{
    @Override
    public void speak() {
        System.out.println("dog says Woof!");
    }
}
```

###### 6. Main.java
```java
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new CalculatorImpl();

        System.out.println("1234 + 4321 = " + calculator.plus(1234, 4321));
        System.out.println("911 - 170 = " + calculator.minus(911, 170));
        System.out.println("2 * 3 = " + calculator.mul(2, 3));
        System.out.println("33 / 11 = " + calculator.div(33, 11));

        System.out.println("\n");

        Cat cat = new Cat();
        Dog dog = new Dog();
        Animal[] animals = {cat, dog};
        for (Animal animal : animals) {
            animal.speak();
        }
    }
}
```