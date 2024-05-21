# Effective Java

- Effective Java를 보고 정리한 자료입니다.
- 예제 코드는 Claude3 Opus 및 GPT 4o를 이용해서 만들었습니다.

## 목차

- 1장 들어가기

- 2장 객체 생성과 파괴

  > - [아이템 1. 생성자 대신 정적 팩터리 메서드를 고려하라](#아이템-1-생성자-대신-정적-팩터리-메서드를-고려하라)
  > - [아이템 2. 생성자에 매개변수가 많다면 빌더를 고려하라](#아이템-2-생성자에-매개변수가-많다면-빌더를-고려하라)
  > - [아이템 3. private 생성자나 열거 타입으로 싱글턴임을 보증하라](#아이템-3-private-생성자나-열거-타입으로-싱글턴임을-보증하라)
  > - [아이템 4. 인스턴스화를 막으려거든 private 생성자를 사용하라](#아이템-4-인스턴스화를-막으려거든-private-생성자를-사용하라)
  > - [아이템 5. 자원을 직접 명시하지 말고 의존 객체 주입을 사용하라](#아이템-5-자원을-직접-명시하지-말고-의존-객체-주입을-사용하라)
  > - [아이템 6. 불필요한 객체 생성을 피하라](#아이템-6-불필요한-객체-생성을-피하라)
  > - [아이템 7. 다 쓴 객체 참조를 해제하라](#아이템-7-다-쓴-객체-참조를-해제하라)
  > - [아이템 8. finalizer와 cleaner 사용을 피하라](#아이템-8-finalizer와-cleaner-사용을-피하라)
  > - [아이템 9. try-finally보다는 try-with-resources를 사용하라](#아이템-9-try-finally보다는-try-with-resources를-사용하라)

- 3장 모든 객체의 공통 메서드

  > - [아이템 10. equals는 일반 규약을 지켜 재정의하라](#아이템-10-equals는-일반-규약을-지켜-재정의하라)
  > - [아이템 11. equals를 재정의하려거든 hashCode도 재정의하라](#아이템-11-equals를-재정의하려거든-hashcode도-재정의하라)
  > - [아이템 12. toString을 항상 재정의하라](#아이템-12-tostring을-항상-재정의하라)
  > - [아이템 13. clone 재정의는 주의해서 진행하라](#아이템-13-clone-재정의는-주의해서-진행하라)
  > - [아이템 14. Comparable을 구현할지 고려하라](#아이템-14-comparable을-구현할지-고려하라)

- 4장 클래스와 인터페이스

  > - [아이템 15. 클래스와 멤버의 접근 권한을 최소화하라](#아이템-15-클래스와-멤버의-접근-권한을-최소화하라)
  > - [아이템 16. public 클래스에서는 public 필드가 아닌 접근자 메서드를 사용하라](#아이템-16-public-클래스에서는-public-필드가-아닌-접근자-메서드를-사용하라)
  > - [아이템 17. 변경 가능성을 최소화하라](#아이템-17-변경-가능성을-최소화하라)
  > - [아이템 18. 상속보다는 컴포지션을 사용하라](#아이템-18-상속보다는-컴포지션을-사용하라)
  > - [아이템 19. 상속을 고려해 설계하고 문서화하라. 그러지 않았다면 상속을 금지하라](#아이템-19-상속을-고려해-설계하고-문서화하라-그러지-않았다면-상속을-금지하라)
  > - [아이템 20. 추상 클래스보다는 인터페이스를 우선하라](#아이템-20-추상-클래스보다는-인터페이스를-우선하라)
  > - [아이템 21. 인터페이스는 구현하는 쪽을 생각해 설계하라](#아이템-21-인터페이스는-구현하는-쪽을-생각해-설계하라)
  > - [아이템 22. 인터페이스는 타입을 정의하는 용도로만 사용하라](#아이템-22-인터페이스는-타입을-정의하는-용도로만-사용하라)
  > - [아이템 23. 태그 달린 클래스보다는 클래스 계층구조를 활용하라](#아이템-23-태그-달린-클래스보다는-클래스-계층구조를-활용하라)
  > - [아이템 24. 멤버 클래스는 되도록 static으로 만들라](#아이템-24-멤버-클래스는-되도록-static으로-만들라)
  > - [아이템 25. 톱레벨 클래스는 한 파일에 하나만 담으라](#아이템-25-톱레벨-클래스는-한-파일에-하나만-담으라)

- 5장 제네릭

  > - [아이템 26. 로 타입은 사용하지 말라](#아이템-26-로-타입은-사용하지-말라)
  > - [아이템 27. 비검사 경고를 제거하라](#아이템-27-비검사-경고를-제거하라)
  > - [아이템 28. 배열보다는 리스트를 사용하라](#아이템-28-배열보다는-리스트를-사용하라)
  > - [아이템 29. 이왕이면 제네릭 타입으로 만들라](#아이템-29-이왕이면-제네릭-타입으로-만들라)
  > - [아이템 30. 이왕이면 제네릭 메서드로 만들라](#아이템-30-이왕이면-제네릭-메서드로-만들라)
  > - [아이템 31. 한정적 와일드카드를 사용해 API 유연성을 높이라](#아이템-31-한정적-와일드카드를-사용해-api-유연성을-높이라)
  > - [아이템 32. 제네릭과 가변인수를 함께 쓸 때는 신중하라](#아이템-32-제네릭과-가변인수를-함께-쓸-때는-신중하라)
  > - [아이템 33. 타입 안전 이종 컨테이너를 고려하라](#아이템-33-타입-안전-이종-컨테이너를-고려하라)

- 6장 열거 타입과 애너테이션

  > - [아이템 34. int 상수 대신 열거 타입을 사용하라](#아이템-34-int-상수-대신-열거-타입을-사용하라)
  > - [아이템 35. ordinal 메서드 대신 인스턴스 필드를 사용하라](#아이템-35-ordinal-메서드-대신-인스턴스-필드를-사용하라)
  > - [아이템 36. 비트 필드 대신 EnumSet을 사용하라](#아이템-36-비트-필드-대신-enumset을-사용하라)
  > - [아이템 37. ordinal 인덱싱 대신 EnumMap을 사용하라](#아이템-37-ordinal-인덱싱-대신-enummap을-사용하라)
  > - [아이템 38. 확장할 수 있는 열거 타입이 필요하면 인터페이스를 사용하라](#아이템-38-확장할-수-있는-열거-타입이-필요하면-인터페이스를-사용하라)
  > - [아이템 39. 명명 패턴보다 애너테이션을 사용하라](#아이템-39-명명-패턴보다-애너테이션을-사용하라)
  > - [아이템 40. @Override 애너테이션을 일관되게 사용하라](#아이템-40-override-애너테이션을-일관되게-사용하라)
  > - [아이템 41. 정의하려는 것이 타입이라면 마커 인터페이스를 사용하라](#아이템-41-정의하려는-것이-타입이라면-마커-인터페이스를-사용하라)

- 7장 람다와 스트림

  > - [아이템 42. 익명 클래스보다는 람다를 사용하라](#아이템-42-익명-클래스보다는-람다를-사용하라)
  > - [아이템 43. 람다보다는 메서드 참조를 사용하라](#아이템-43-람다보다는-메서드-참조를-사용하라)
  > - [아이템 44. 표준 함수형 인터페이스를 사용하라](#아이템-44-표준-함수형-인터페이스를-사용하라)
  > - [아이템 45. 스트림은 주의해서 사용하라](#아이템-45-스트림은-주의해서-사용하라)
  > - [아이템 46. 스트림에서는 부작용 없는 함수를 사용하라](#아이템-46-스트림에서는-부작용-없는-함수를-사용하라)
  > - [아이템 47. 반환 타입으로는 스트림보다 컬렉션이 낫다](#아이템-47-반환-타입으로는-스트림보다-컬렉션이-낫다)
  > - [아이템 48. 스트림 병렬화는 주의해서 적용하라](#아이템-48-스트림-병렬화는-주의해서-적용하라)

- 8장 메서드

  > - [아이템 49. 매개변수가 유효한지 검사하라]
  > - [아이템 50. 적시에 방어적 복사본을 만들라]
  > - [아이템 51. 메서드 시그니처를 신중히 설계하라]
  > - [아이템 52. 다중정의는 신중히 사용하라]
  > - [아이템 53. 가변인수는 신중히 사용하라]
  > - [아이템 54. null이 아닌, 빈 컬렉션이나 배열을 반환하라]
  > - [아이템 55. 옵셔널 반환은 신중히 하라]
  > - [아이템 56. 공개된 API 요소에는 항상 문서화 주석을 작성하라]

- 9장 일반적인 프로그래밍 원칙

  > - [아이템 57. 지역변수의 범위를 최소화하라]
  > - [아이템 58. 전통적인 for 문보다는 for-each 문을 사용하라]
  > - [아이템 59. 라이브러리를 익히고 사용하라]
  > - [아이템 60. 정확한 답이 필요하다면 float와 double은 피하라]
  > - [아이템 61. 박싱된 기본 타입보다는 기본 타입을 사용하라]
  > - [아이템 62. 다른 타입이 적절하다면 문자열 사용을 피하라]
  > - [아이템 63. 문자열 연결은 느리니 주의하라]
  > - [아이템 64. 객체는 인터페이스를 사용해 참조하라]
  > - [아이템 65. 리플렉션보다는 인터페이스를 사용하라]
  > - [아이템 66. 네이티브 메서드는 신중히 사용하라]
  > - [아이템 67. 최적화는 신중히 하라]
  > - [아이템 68. 일반적으로 통용되는 명명 규칙을 따르라]

- 10장 예외

  > - [아이템 69. 예외는 진짜 예외 상황에만 사용하라]
  > - [아이템 70. 복구할 수 있는 상황에는 검사 예외를, 프로그래밍 오류에는 런타임 예외를 사용하라]
  > - [아이템 71. 필요 없는 검사 예외 사용은 피하라]
  > - [아이템 72. 표준 예외를 사용하라]
  > - [아이템 73. 추상화 수준에 맞는 예외를 던지라]
  > - [아이템 74. 메서드가 던지는 모든 예외를 문서화하라]
  > - [아이템 75. 예외의 상세 메시지에 실패 관련 정보를 담으라]
  > - [아이템 76. 가능한 한 실패 원자적으로 만들라]
  > - [아이템 77. 예외를 무시하지 말라]

- 11장 동시성

  > - [아이템 78. 공유 중인 가변 데이터는 동기화해 사용하라]
  > - [아이템 79. 과도한 동기화는 피하라]
  > - [아이템 80. 스레드보다는 실행자, 태스크, 스트림을 애용하라]
  > - [아이템 81. wait와 notify보다는 동시성 유틸리티를 애용하라]
  > - [아이템 82. 스레드 안전성 수준을 문서화하라]
  > - [아이템 83. 지연 초기화는 신중히 사용하라]
  > - [아이템 84. 프로그램의 동작을 스레드 스케줄러에 기대지 말라]

- 12장 직렬화
  > - [아이템 85. 자바 직렬화의 대안을 찾으라]
  > - [아이템 86. Serializable을 구현할지는 신중히 결정하라]
  > - [아이템 87. 커스텀 직렬화 형태를 고려해보라]
  > - [아이템 88. readObject 메서드는 방어적으로 작성하라]
  > - [아이템 89. 인스턴스 수를 통제해야 한다면 readResolve보다는 열거 타입을 사용하라]
  > - [아이템 90. 직렬화된 인스턴스 대신 직렬화 프록시 사용을 검토하라]

## 아이템 1. 생성자 대신 정적 팩터리 메서드를 고려하라

## 아이템 2. 생성자에 매개변수가 많다면 빌더를 고려하라

## 아이템 3. private 생성자나 열거 타입으로 싱글턴임을 보증하라

## 아이템 4. 인스턴스화를 막으려거든 private 생성자를 사용하라

## 아이템 5. 자원을 직접 명시하지 말고 의존 객체 주입을 사용하라

## 아이템 6. 불필요한 객체 생성을 피하라

## 아이템 7. 다 쓴 객체 참조를 해제하라

## 아이템 8. finalizer와 cleaner 사용을 피하라

## 아이템 9. try-finally보다는 try-with-resources를 사용하라

## 아이템 10. equals는 일반 규약을 지켜 재정의하라

## 아이템 11. equals를 재정의하려거든 hashCode도 재정의하라

## 아이템 12. toString을 항상 재정의하라

## 아이템 13. clone 재정의는 주의해서 진행하라

## 아이템 14. Comparable을 구현할지 고려하라

## 아이템 15. 클래스와 멤버의 접근 권한을 최소화하라

## 아이템 16. public 클래스에서는 public 필드가 아닌 접근자 메서드를 사용하라

## 아이템 17. 변경 가능성을 최소화하라

## 아이템 18. 상속보다는 컴포지션을 사용하라

## 아이템 19. 상속을 고려해 설계하고 문서화하라. 그러지 않았다면 상속을 금지하라

## 아이템 20. 추상 클래스보다는 인터페이스를 우선하라

## 아이템 21. 인터페이스는 구현하는 쪽을 생각해 설계하라

## 아이템 22. 인터페이스는 타입을 정의하는 용도로만 사용하라

## 아이템 23. 태그 달린 클래스보다는 클래스 계층구조를 활용하라

## 아이템 24. 멤버 클래스는 되도록 static으로 만들라

## 아이템 25. 톱레벨 클래스는 한 파일에 하나만 담으라

## 아이템 26. 로 타입은 사용하지 말라

### 제네릭 클래스 / 제네릭 인터페이스

- 제네릭 클래스와 인터페이스는 클래스나 인터페이스를 정의할 때 타입 파라미터를 사용하는 것을 의미함. 이를 통해 코드의 재사용성을 높이고 타입 안전성을 보장할 수 있음.

```java
public class GenericClass<T> {
    private T value;

    public GenericClass(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public interface GenericInterface<T> {
    void doSomething(T t);
}
```

### 매개변수화 타입

- 매개변수화 타입은 제네릭 클래스나 인터페이스를 인스턴스화할 때 구체적인 타입을 지정하는 것을 의미함. 이를 통해 제네릭 타입을 사용할 때 타입 안전성을 제공받을 수 있음.

```java
GenericClass<String> stringInstance = new GenericClass<>("Hello");
GenericClass<Integer> integerInstance = new GenericClass<>(123);
```

### 로 타입

- 로 타입(raw type)은 제네릭 타입에서 타입 매개변수를 지정하지 않은 경우를 의미함. 로 타입을 사용하면 제네릭이 제공하는 타입 안전성 검사가 무력화됨.

```java
GenericClass rawInstance = new GenericClass("Raw Type");
```

### 제네릭 타입과 instanceof

- 제네릭 타입에 대해 `instanceof`를 사용할 때는 로 타입을 사용해야 함. 이를 통해 제네릭 타입의 인스턴스를 안전하게 검사할 수 있음.

```java
if (o instanceof GenericClass) {
    GenericClass<?> genericInstance = (GenericClass<?>) o;
}
```

### 와일드카드

- 와일드카드는 제네릭 타입을 사용할 때 다양한 타입을 처리할 수 있도록 유연성을 제공하는 기법. 주로 ?를 사용하여 상위 또는 하위 타입 경계를 지정함.

```java
public void printList(List<?> list) {
    for (Object elem : list) {
        System.out.println(elem);
    }
}
```

### 요약

- **로 타입을 사용하면 런타입에 예외가 일어날 수 있으니 사용하면 안됨. 로 타입은 제네릭이 도입되기 이전 코드와의 호환성을 위해 제공될 뿐임.**
- 로 타입을 쓰면 제네릭이 안겨주는 안전성과 표현력을 모두 잃게 됨.
- `List<Object>`와 같은 매개변수화 타입을 사용할 때와 달리 `List`같은 로 타입을 사용하면 타입 안전성을 잃게 됨.
- `class` 리터럴에는 로 타입을 써야함.
- `다음은 제네릭 타입에 instanceof`를 사용하는 올바른 예제.

```java
if (o instanceof Set) {
  Set<?> s= Set<?> o
}
```

## 아이템 27. 비검사 경고를 제거하라

### 공변성과 실체화

#### 공변성 (Covariance)

- **배열의 공변성**: 배열은 공변(covariant). 즉, 배열의 타입 간에 상속 관계가 있으면, 배열 타입 간에도 같은 상속 관계가 있음. 예를 들어, `Integer`는 `Number`의 서브타입이기 때문에 `Integer[]`는 `Number[]`의 서브타입. 이는 유연하게 보일 수 있지만, 타입 안전성 문제를 일으킬 수 있음.

```java
public class CovariantExample {
    public static void main(String[] args) {
        Number[] numbers = new Integer[10]; // Integer[] is a subtype of Number[]
        numbers[0] = 1; // Valid
        numbers[1] = 1.5; // ArrayStoreException at runtime, because 1.5 is not an Integer
    }
}
```

#### 실체화 (Reification)

- **배열의 실체화**: 배열은 런타임 시 실제 타입 정보를 유지함. 즉, 배열의 타입이 런타임에도 유지됨. 따라서 배열에 잘못된 타입의 요소를 저장하려고 하면 런타임에 예외가 발생할 수 있음.
- **제네릭 타입의 타입 소거**: 반면, 제네릭 타입은 컴파일 시 타입 검사를 수행하지만, 런타임에는 타입 정보가 지워짐. 이를 타입 소거(type erasure)라고 함. 따라서 제네릭 타입의 인스턴스는 런타임에 타입 정보를 유지하지 않음.

```java
import java.util.ArrayList;
import java.util.List;

public class ReificationExample {
    public static void main(String[] args) {
        // 배열은 실체화됨
        Object[] objectArray = new Integer[1];
        objectArray[0] = "Hello"; // ArrayStoreException at runtime

        // 제네릭 타입은 실체화되지 않음 (타입 소거)
        List<Integer> integerList = new ArrayList<>();
        List rawList = integerList; // Raw type, no generic type information
        rawList.add("Hello"); // No compile-time error, but introduces type-safety issue
        Integer integer = integerList.get(0); // ClassCastException at runtime
    }
}
```

### 요약

- **비검사 경고는 중요하니 무시하지 말 것. 모든 비검사 경고는 런타임에 `ClassCastException`을 일으킬 수 있는 잠재적 가능성을 뜻하니 최선을 다해서 제거할 것.**
- 할 수 있는 모든 비검사 경고를 제거할 것.
- 경고를 제거할 수는 없지만 타입 안전하다고 확신할 수 있다면 `@SupressWarnings("unchecked")` 애너테이션을 달아 숨길 것.
- `@SupressWarnings`은 항상 가능한 좁은 범위에 적용할 것.
- `SupressWarnings("unchecked")` 애너테이션을 사용할 때면 그 경고를 무시해도 안전한 이유를 항상 주석으로 남겨야 함.

## 아이템 28. 배열보다는 리스트를 사용하라

### 요약

- 배열과 제네릭에는 매우 다른 타입 규칙이 적용됨. 배열은 공변이고 실체화되는 반면, 제네릭은 불공변이고 타입 정보가 소거됨. 그 결과 배열은 런타입에는 타입 안전하지만 컴파일 타임에는 그렇지 않음. 제네릭은 반대임. 그래서 둘을 섞어 쓰기른 쉽지 않음. 둘을 섞어 쓰다가 컴파일 오류나 경고를 만나면, 가장 먼저 배열을 리스트로 대체하는 방법을 생각해야 함.

## 아이템 29. 이왕이면 제네릭 타입으로 만들라

## 아이템 30. 이왕이면 제네릭 메서드로 만들라

## 아이템 31. 한정적 와일드카드를 사용해 API 유연성을 높이라

## 아이템 32. 제네릭과 가변인수를 함께 쓸 때는 신중하라

## 아이템 33. 타입 안전 이종 컨테이너를 고려하라

## 아이템 34. int 상수 대신 열거 타입을 사용하라

## 아이템 35. ordinal 메서드 대신 인스턴스 필드를 사용하라

## 아이템 36. 비트 필드 대신 EnumSet을 사용하라

## 아이템 37. ordinal 인덱싱 대신 EnumMap을 사용하라

## 아이템 38. 확장할 수 있는 열거 타입이 필요하면 인터페이스를 사용하라

## 아이템 39. 명명 패턴보다 애너테이션을 사용하라

## 아이템 40. @Override 애너테이션을 일관되게 사용하라

## 아이템 41. 정의하려는 것이 타입이라면 마커 인터페이스를 사용하라

## 아이템 42. 익명 클래스보다는 람다를 사용하라

### 요약

- **타입을 명시해야 코드가 더 명확할 때만 제외하고는, 람다의 모든 매개변수 타입은 생략할 것.**
- 람다는 이름이 없고 문서화도 못함. 따라서 코드 자체로 동작이 명확히 설명되지 않거나 코드 줄 수가 많아지면 람다를 쓰지 말아야 함.
- 람다를 직렬화하는 일은 극히 삼가야 함.
- 익명 클래스는 (함수형 인터페이스가 아닌) 타입의 인스턴스를 만들 때만 사용할 것.

## 아이템 43. 람다보다는 메서드 참조를 사용하라

### 메서드 참조 유형

- 정적 메서드 참조 (Static Method Reference)
  > - **형식**: `ClassName::staticMethodName`
  > - **설명**: 클래스의 정적 메서드를 참조함.
- 한정적 인스턴스 메서드 참조 (Bound Instance Method Reference)
  > - **형식**: `instanceRef::instanceMethodName`
  > - **설명**: 특정 객체의 인스턴스 메서드를 참조함.
- 비한정적 인스턴스 메서드 참조 (Unbound Instance Method Reference)
  > - **형식**: `ClassName::instanceMethodName`
  > - **설명**: 클래스의 인스턴스 메서드를 참조하지만, 객체 인스턴스는 람다 표현식의 첫 번째 매개변수로 전달됨.
- 클래스 생성자 메서드 참조 (Class Constructor Reference)
  > - **형식**: `ClassName::new`
  > - **설명**: 클래스의 생성자를 참조함.
- 배열 생성자 메서드 참조 (Array Constructor Reference)
  > - **형식**: `TypeName[]::new`
  > - **설명**: 배열의 생성자를 참조함.

### 요약

- 메서드 참조 쪽이 짧고 명확하다면 메서드 참조를 쓰고, 그렇지 않을때만 람다를 활용할 것.

## 아이템 44. 표준 함수형 인터페이스를 사용하라

### 기본 함수형 인터페이스

- `UnaryOperator<T>`
  > - **개념**: 같은 타입의 인수와 반환값을 가지는 함수형 인터페이스. 입력값을 연산하여 동일한 타입의 결과를 반환함.
  > - **메서드**: `T apply(T t)`
- `BinaryOperator<T>`
  > - **개념**: 두 개의 같은 타입 인수를 받아 동일한 타입의 결과를 반환하는 함수형 인터페이스. 주로 두 값을 연산하는 데 사용됨.
  > - **메서드**: `T apply(T t1, T t2)`
- `Predicate<T>`
  > - **개념**: 인수를 받아 `boolean` 값을 반환하는 함수형 인터페이스. 주로 조건 검사에 사용됨.
  > - **메서드**: `boolean test(T t)`
- `Function<T, R>`
  > - **개념**: 인수를 받아 다른 타입의 결과를 반환하는 함수형 인터페이스. 주로 값을 변환하는 데 사용됨.
  > - **메서드**: `R apply(T t)`
- `Supplier<T>`
  > - **개념**: 인수 없이 결과만 반환하는 함수형 인터페이스. 주로 값을 생성하는 데 사용됨.
  > - **메서드**: `T get()`
- `Consumer<T>`
  > - **개념**: 인수를 받지만 결과를 반환하지 않는 함수형 인터페이스. 주로 값을 소비하는 데 사용됨.
  > - **메서드**: `void accept(T t)`

### 요약

- **입력값과 반환값에 함수형 인터페이스 타입을 활용할 것. 보통은 `java.util.function` 패키지의 표준 함수형 인터페이스를 사용하는 것이 가장 좋은 선택.**
- 필요한 용도에 맞는 게 있다면, 직접 구현하지 말고 표준 함수형 인터페이스를 활용할 것.
- 기본 함수형 인터페이스에 박싱된 기본 타입을 넣어 사용하지 말 것.
- 직접 만든 함수형 인터페이스에는 항상 `@FunctionalInterface`를 활용할 것.

## 아이템 45. 스트림은 주의해서 사용하라

## 아이템 46. 스트림에서는 부작용 없는 함수를 사용하라

## 아이템 47. 반환 타입으로는 스트림보다 컬렉션이 낫다

## 아이템 48. 스트림 병렬화는 주의해서 적용하라

## 아이템 49. 매개변수가 유효한지 검사하라

## 아이템 50. 적시에 방어적 복사본을 만들라

## 아이템 51. 메서드 시그니처를 신중히 설계하라

## 아이템 52. 다중정의는 신중히 사용하라

## 아이템 53. 가변인수는 신중히 사용하라

## 아이템 54. null이 아닌, 빈 컬렉션이나 배열을 반환하라

## 아이템 55. 옵셔널 반환은 신중히 하라

## 아이템 56. 공개된 API 요소에는 항상 문서화 주석을 작성하라

## 아이템 57. 지역변수의 범위를 최소화하라

## 아이템 58. 전통적인 for 문보다는 for-each 문을 사용하라

## 아이템 59. 라이브러리를 익히고 사용하라

## 아이템 60. 정확한 답이 필요하다면 float와 double은 피하라

## 아이템 61. 박싱된 기본 타입보다는 기본 타입을 사용하라

## 아이템 62. 다른 타입이 적절하다면 문자열 사용을 피하라

## 아이템 63. 문자열 연결은 느리니 주의하라

## 아이템 64. 객체는 인터페이스를 사용해 참조하라

## 아이템 65. 리플렉션보다는 인터페이스를 사용하라

## 아이템 66. 네이티브 메서드는 신중히 사용하라

## 아이템 67. 최적화는 신중히 하라

## 아이템 68. 일반적으로 통용되는 명명 규칙을 따르라

## 아이템 69. 예외는 진짜 예외 상황에만 사용하라

## 아이템 70. 복구할 수 있는 상황에는 검사 예외를, 프로그래밍 오류에는 런타임 예외를 사용하라

## 아이템 71. 필요 없는 검사 예외 사용은 피하라

## 아이템 72. 표준 예외를 사용하라

## 아이템 73. 추상화 수준에 맞는 예외를 던지라

## 아이템 74. 메서드가 던지는 모든 예외를 문서화하라

## 아이템 75. 예외의 상세 메시지에 실패 관련 정보를 담으라

## 아이템 76. 가능한 한 실패 원자적으로 만들라

## 아이템 77. 예외를 무시하지 말라

## 아이템 78. 공유 중인 가변 데이터는 동기화해 사용하라

## 아이템 79. 과도한 동기화는 피하라

## 아이템 80. 스레드보다는 실행자, 태스크, 스트림을 애용하라

## 아이템 81. wait와 notify보다는 동시성 유틸리티를 애용하라

## 아이템 82. 스레드 안전성 수준을 문서화하라

## 아이템 83. 지연 초기화는 신중히 사용하라

## 아이템 84. 프로그램의 동작을 스레드 스케줄러에 기대지 말라

## 아이템 85. 자바 직렬화의 대안을 찾으라

## 아이템 86. Serializable을 구현할지는 신중히 결정하라

## 아이템 87. 커스텀 직렬화 형태를 고려해보라

## 아이템 88. readObject 메서드는 방어적으로 작성하라

## 아이템 89. 인스턴스 수를 통제해야 한다면 readResolve보다는 열거 타입을 사용하라

## 아이템 90. 직렬화된 인스턴스 대신 직렬화 프록시 사용을 검토하라

## 클래스명

Chapter 1: Introduction

Chapter 2: Creating and Destroying Objects

public class Item1_ConsiderStaticFactoryMethods {}
public class Item2_ConsiderBuilderWhenFacedWithManyConstructorParameters {}
public class Item3_EnforceSingletonPropertyWithPrivateConstructorOrEnum {}
public class Item4_EnforceNoninstantiabilityWithPrivateConstructor {}
public class Item5_PreferDependencyInjectionToHardwiringResources {}
public class Item6_AvoidCreatingUnnecessaryObjects {}
public class Item7_EliminateObsoleteObjectReferences {}
public class Item8_AvoidFinalizersAndCleaners {}
public class Item9_PreferTryWithResourcesToTryFinally {}

Chapter 3: Methods Common to All Objects

public class Item10_OverrideEqualsConsistently {}
public class Item11_OverrideHashCodeWhenOverridingEquals {}
public class Item12_AlwaysOverrideToString {}
public class Item13_OverrideCloneJudiciously {}
public class Item14_ConsiderImplementingComparable {}

Chapter 4: Classes and Interfaces

public class Item15_MinimizeAccessibilitiesOfClassesAndMembers {}
public class Item16_InsteadOfPublicFieldsUseAccessorMethods {}
public class Item17_MinimizeMutability {}
public class Item18_PreferCompositionOverInheritance {}
public class Item19_DesignAndDocumentForInheritanceOrElseProhibitIt {}
public class Item20_PreferInterfacesToAbstractClasses {}
public class Item21_DesignInterfacesForImplementation {}
public class Item22_UseInterfacesOnlyToDefineTypes {}
public class Item23_PreferClassHierarchiesToTaggedClasses {}
public class Item24_FavorStaticMemberClassesOverNonStatic {}
public class Item25_LimitSourceFilesToASingleTopLevelClass {}

Chapter 5: Generics

Chapter 6: Enums and Annotations

public class Item34_UseEnumsInsteadOfIntConstants {}
public class Item35_UseInstanceFieldsInsteadOfOrdinals {}
public class Item36_UseEnumSetInsteadOfBitFields {}
public class Item37_UseEnumMapInsteadOfOrdinalIndexing {}
public class Item38_ExtensibleEnumsViaInterfaces {}
public class Item39_PreferAnnotationsToNamingPatterns {}
public class Item40_ConsistentlyUseOverrideAnnotation {}
public class Item41_UseMarkerInterfacesToDefineTypes {}

Chapter 7: Lambdas and Streams

Chapter 8: Methods

public class Item49_CheckParametersForValidity {}
public class Item50_DefensiveCopiesForMutableFields {}
public class Item51_DesignMethodSignaturesCarefully {}
public class Item52_UseOverloadingJudiciously {}
public class Item53_CarefullyUseVarargs {}
public class Item54_ReturnEmptyCollectionsOrArraysNotNulls {}
public class Item55_ReturnOptionalsJudiciously {}
public class Item56_AlwaysDocumentAPIElems {}

Chapter 9: General Programming

public class Item57_MinimizeLocalVariableScope {}
public class Item58_PreferForEachLoopsToTraditionalForLoops {}
public class Item59_KnowAndUseLibraries {}
public class Item60_AvoidFloatAndDoubleForExactAnswers {}
public class Item61_PreferPrimitiveTypesToBoxedPrimitives {}
public class Item62_AvoidStringsWhereOtherTypesAreMoreAppropriate {}
public class Item63_BeWaryOfStringConcatenation {}
public class Item64_ReferToObjectsByTheirInterfaces {}
public class Item65_PreferInterfacesToReflection {}
public class Item66_UseNativeMethodsJudiciously {}
public class Item67_AvoidUnnecessaryOptimizations {}
public class Item68_AdhereToGeneralNamingConventions {}

Chapter 10: Exceptions

public class Item69_UseExceptionsOnlyForExceptionalConditions {}
public class Item70_UseCheckedExceptionsForRecoverableConditions {}
public class Item71_AvoidUnnecessaryUseOfCheckedExceptions {}
public class Item72_FavorStandardExceptions {}
public class Item73_ThrowExceptionsAppropriateToAbstractionLevel {}
public class Item74_DocumentAllThrownExceptions {}
public class Item75_IncludeFailureCaptureInformationInExceptionMessages {}
public class Item76_StriveForFailureAtomicity {}
public class Item77_DoNotIgnoreExceptions {}

Chapter 11: Concurrency

public class Item78_SynchronizeAccessToSharedMutableData {}
public class Item79_AvoidExcessiveSynchronization {}
public class Item80_PreferExecutorsTasksAndStreamsToThreads {}
public class Item81_PreferConcurrencyUtilitiesToWaitAndNotify {}
public class Item82_DocumentThreadSafety {}
public class Item83_UseLazyInitializationJudiciously {}
public class Item84_DoNotRelyOnThreadSchedulers {}

Chapter 12: Serialization

public class Item85_FindAlternativesToJavaSerialization {}
public class Item86_CarefullyDecideWhetherToImplementSerializable {}
public class Item87_ConsiderCustomSerializedForms {}
public class Item88_WriteReadObjectMethodsDefensively {}
public class Item89_ForInstanceControlUseEnumOrReadResolve {}
public class Item90_ConsiderSerializationProxies {}
