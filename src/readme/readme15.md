# 디자인 패턴과 프레임워크

### 디자인 패턴
- 설계를 재사용하기 위한 것
- 특정한 변경을 일관성 있게 다룰 수 있는 협력 템플릿을 제공
- 협력을 일관성 있게 만들기 위해 재사용할 수 있는 설계의 묶음

### 프레임워크
- 설계와 코드를 함께 재사용하기 위한 것
- 특정한 변경을 일관성 있게 다룰 수 있는 확장 가능한 코드 템플릿을 제공
- 일관성 있는 협력을 제공하는 확장 가능한 코드

### 패턴 분류

#### 디자인 패턴

- 특정 정황 내에서 일반적인 설게 문제를 해결하며, 협력하는 컴포넌트들 사이에서 반복적으로 발생하는 구조를 서술한다.
- 프로그래밍 언어나 프로그래밍 패러다임에 독립적이다.

#### 아키텍처 패턴

- 미리 정의된 서브시스템들을 제공하고, 각 서브시스템들의 책임을 정의하며, 서브시스템들 사이의 관계를 조직화하는 규칙과 가이드라인을 포함한다.
- 프로그래밍 언어나 프로그래밍 패러다임에 독립적이다.

#### 이디엄

- 특정 프로그래밍 언어에만 국한된 하위 레벨 패턴으로, 주어진 언어의 기능을 사용해 컴포넌트, 혹은 컴포넌트 간의 특정 측면을 구현하는 방법을 서술한다.

#### 분석 패턴

- 업무 모델링 시에 발견되는 공통적인 구조를 표현하는 개념들의 집합이다. 분석 패턴은 단 하나의 도메인에 대해서만 적절할 수도 있고 여러 도메인에 걸쳐 적용할 수도 있다.

> 전략 패턴은 합성을 이용해 알고리즘을 캡슐화 하는 것이고 템플릿 메소드 패턴은 상속을 이용해 알고리즘을 캡슐화 하는 것이라고 할 수 있다.

- 디자인 패턴에서 중요한 것은 디자인 패턴의 구현 방법이나 구조가 아니다. 어떤 디자인 패턴이 어떤 변경을 캠슐화하는지를 이해하는 것이 중요하다. 그리고 각 디자인 패턴이 변경을 캡슐화하기 위해 어떤 방법을 사용하는지를 이해하는 것이 더 중요하다.

### 패턴은 출발점이다.

> p 523 조슈아 케리에브스키가 말한 내용이 무슨 의미 일까?


## 02 프레임워크와 코드 재사용

- 설계를 재사용하면서도 유사한 코드를 반복적으로 구현하는 문제를 피할 수 있는 방법이 바로 프레임워크다.
- 프레임워크란 '추상 클래스나 인터페이스를 정의하고 인스턴스 사이의 상호작용을 통해 시스템 전체 혹은 일부를 구현해 놓은 재사용 가능한 설계', 또는 '에플리케이션 개발자가 현재의 요구사항에 맞게 커스터마이징할 수 있는 애플리케이션의 골격'을 의미한다.










