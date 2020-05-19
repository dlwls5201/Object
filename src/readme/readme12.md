# 다형성

### 임시

#### 오버로딩 다형성 
- 하나의 클래스 안에 동일한 이름의 메서드가 존재하는 경우

```java
public class Money {
    public Money plus(Money amount) { ... }
    public Money plus(BigDecimal amount) { ... }
    public Money plus(long amount) { ... }
}
```

#### 강제 다형성 
- 언어가 지원하는 자동적인 타입 변환이나 사용자가 직접 구현한 타입 변환을 이용해 동일한 연산자를 다양한 타입에 사용할 수 있는 방식

```java
int temp1 = 1 + 1; //이항 연산자
System.out.println("temp1 : " + temp1);

String temp2 = "1" + 1; //연결 연산자
System.out.println("temp2 : " + temp2);

//결과 : 테스트 코드
```

> 일반적으로 오버로딩 다형성과 강제 다형성을 함께 사용하면 모호해질 수 있는데 실제로 어떤 메서드가 호출될지를 판단하기 어려워지기 떄문이다.

### 유니버설

#### 매개변수 다형성

- 제네릭 프로그래밍과 관련이 높은데 클래스의 인스턴스 변수나 메서드의 매개변수 타입을 임의의 타입으로 선언한 수 사용하는 시점에 구체적인 타입으로 지정하는 방식을 가리킨다.

```java
public interface List<E> extends Collection<E> { ... }
```

#### 포함 다형성 
- 메시지가 동일하더라도 수신한 객체의 타입에 따라 실제로 수행되는 행동이 달라지는 능력을 의미한다. 
- 서브타입 다형성
- 객체지향 프로그래밍에서 가장 널리 알려진 형태의 다형성

```java
public class Movie {
    private String title;
    private Duration runningTime;
    private Money fee;
    private DiscountPolicy discountPolicy; //abstract class

    public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public Money getFee() {
        return fee;
    }

    public Money calculateMovieFee(Screening screening) {
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
}
```

- discountPolicy 에게 calculateDiscountAmount 메시지를 전송하지만 실제로 실행되는 메서드는 메시지를 수신한 객체의 타입에 따라 달라진다.
- 객체가 메시지를 수신하면 객체지향 시스템은 메시지를 처리할 적절한 메서드를 상속 계층 안에서 탐색한다.


## 02 상속의 양면성

- 업캐스팅
- 동적 메서드 탐색
- 동적 바인딩
- self 참조
- super 참조

### 데이터 관점의 상속

### 행동 관점의 상속

- 데이터 관점의 상속이 자식 클래스의 인스턴스 안에 부모 클래스의 인스턴스를 포함하는 개념이라면 행동 관점의 상속은 부모 클래스가 정의한 일부 메서드를 자식 클래스의 메서드로 포함시키는 것을 의미 한다.

```java
public class GradeLecture extends Lecture {
    private List<Grade> grades;

    public GradeLecture(String name, int pass, List<Grade> grades, List<Integer> scores) {
        super(name, pass, scores);
        this.grades = grades;
    }

    @Override
    public String evaluate() {
        return super.evaluate() + ", " + gradesStatistics();
    }
    
    ...
}
```

## 03 업캐스팅과 동적 바인딩

- 업캐스팅 : 부모 클래스 타입으로 선언된 변수에 자식 클래스의 인스턴스를 할당하는 것이 가능하다.
- 동적 바인딩 : 선언된 변수의 타입이 아니라 메시지를 수신하는 객체의 타입에 따라 실행되는 메서드가 결정된다. 이것은 객체지향 시스템이 메시지를 처리할 적절한 메서드를 컴파일 시점이 아니라 실행 시점에 결정하기 때문에 가능하다.

## 04 동적 메서드 탐색과 다형

## 상속 대 위임










