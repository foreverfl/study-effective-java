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

  > - [아이템 49. 매개변수가 유효한지 검사하라](#아이템-49-매개변수가-유효한지-검사하라)
  > - [아이템 50. 적시에 방어적 복사본을 만들라](#아이템-50-적시에-방어적-복사본을-만들라)
  > - [아이템 51. 메서드 시그니처를 신중히 설계하라](#아이템-51-메서드-시그니처를-신중히-설계하라)
  > - [아이템 52. 다중정의는 신중히 사용하라](#아이템-52-다중정의는-신중히-사용하라)
  > - [아이템 53. 가변인수는 신중히 사용하라](#아이템-53-가변인수는-신중히-사용하라)
  > - [아이템 54. null이 아닌, 빈 컬렉션이나 배열을 반환하라](#아이템-54-null이-아닌-빈-컬렉션이나-배열을-반환하라)
  > - [아이템 55. 옵셔널 반환은 신중히 하라](#아이템-55-옵셔널-반환은-신중히-하라)
  > - [아이템 56. 공개된 API 요소에는 항상 문서화 주석을 작성하라](#아이템-56-공개된-api-요소에는-항상-문서화-주석을-작성하라)

- 9장 일반적인 프로그래밍 원칙

  > - [아이템 57. 지역변수의 범위를 최소화하라](#아이템-57-지역변수의-범위를-최소화하라)
  > - [아이템 58. 전통적인 for 문보다는 for-each 문을 사용하라](#아이템-58-전통적인-for-문보다는-for-each-문을-사용하라)
  > - [아이템 59. 라이브러리를 익히고 사용하라](#아이템-59-라이브러리를-익히고-사용하라)
  > - [아이템 60. 정확한 답이 필요하다면 float와 double은 피하라](#아이템-60-정확한-답이-필요하다면-float와-double은-피하라)
  > - [아이템 61. 박싱된 기본 타입보다는 기본 타입을 사용하라](#아이템-61-박싱된-기본-타입보다는-기본-타입을-사용하라)
  > - [아이템 62. 다른 타입이 적절하다면 문자열 사용을 피하라](#아이템-62-다른-타입이-적절하다면-문자열-사용을-피하라)
  > - [아이템 63. 문자열 연결은 느리니 주의하라](#아이템-63-문자열-연결은-느리니-주의하라)
  > - [아이템 64. 객체는 인터페이스를 사용해 참조하라](#아이템-64-객체는-인터페이스를-사용해-참조하라)
  > - [아이템 65. 리플렉션보다는 인터페이스를 사용하라](#아이템-65-리플렉션보다는-인터페이스를-사용하라)
  > - [아이템 66. 네이티브 메서드는 신중히 사용하라](#아이템-66-네이티브-메서드는-신중히-사용하라)
  > - [아이템 67. 최적화는 신중히 하라](#아이템-67-최적화는-신중히-하라)
  > - [아이템 68. 일반적으로 통용되는 명명 규칙을 따르라](#아이템-68-일반적으로-통용되는-명명-규칙을-따르라)

- 10장 예외

  > - [아이템 69. 예외는 진짜 예외 상황에만 사용하라](#아이템-69-예외는-진짜-예외-상황에만-사용하라)
  > - [아이템 70. 복구할 수 있는 상황에는 검사 예외를, 프로그래밍 오류에는 런타임 예외를 사용하라](#아이템-70-복구할-수-있는-상황에는-검사-예외를-프로그래밍-오류에는-런타임-예외를-사용하라)
  > - [아이템 71. 필요 없는 검사 예외 사용은 피하라](#아이템-71-필요-없는-검사-예외-사용은-피하라)
  > - [아이템 72. 표준 예외를 사용하라](#아이템-72-표준-예외를-사용하라)
  > - [아이템 73. 추상화 수준에 맞는 예외를 던지라](#아이템-73-추상화-수준에-맞는-예외를-던지라)
  > - [아이템 74. 메서드가 던지는 모든 예외를 문서화하라](#아이템-74-메서드가-던지는-모든-예외를-문서화하라)
  > - [아이템 75. 예외의 상세 메시지에 실패 관련 정보를 담으라](#아이템-75-예외의-상세-메시지에-실패-관련-정보를-담으라)
  > - [아이템 76. 가능한 한 실패 원자적으로 만들라](#아이템-76-가능한-한-실패-원자적으로-만들라)
  > - [아이템 77. 예외를 무시하지 말라](#아이템-77-예외를-무시하지-말라)

- 11장 동시성

  > - [아이템 78. 공유 중인 가변 데이터는 동기화해 사용하라](#아이템-78-공유-중인-가변-데이터는-동기화해-사용하라)
  > - [아이템 79. 과도한 동기화는 피하라](#아이템-79-과도한-동기화는-피하라)
  > - [아이템 80. 스레드보다는 실행자, 태스크, 스트림을 애용하라](#아이템-80-스레드보다는-실행자-태스크-스트림을-애용하라)
  > - [아이템 81. wait와 notify보다는 동시성 유틸리티를 애용하라](#아이템-81-wait와-notify보다는-동시성-유틸리티를-애용하라)
  > - [아이템 82. 스레드 안전성 수준을 문서화하라](#아이템-82-스레드-안전성-수준을-문서화하라)
  > - [아이템 83. 지연 초기화는 신중히 사용하라](#아이템-83-지연-초기화는-신중히-사용하라)
  > - [아이템 84. 프로그램의 동작을 스레드 스케줄러에 기대지 말라](#아이템-84-프로그램의-동작을-스레드-스케줄러에-기대지-말라)

- 12장 직렬화
  > - [아이템 85. 자바 직렬화의 대안을 찾으라](#아이템-85-자바-직렬화의-대안을-찾으라)
  > - [아이템 86. Serializable을 구현할지는 신중히 결정하라](#아이템-86-serializable을-구현할지는-신중히-결정하라)
  > - [아이템 87. 커스텀 직렬화 형태를 고려해보라](#아이템-87-커스텀-직렬화-형태를-고려해보라)
  > - [아이템 88. readObject 메서드는 방어적으로 작성하라](#아이템-88-readobject-메서드는-방어적으로-작성하라)
  > - [아이템 89. 인스턴스 수를 통제해야 한다면 readResolve보다는 열거 타입을 사용하라](#아이템-89-인스턴스-수를-통제해야-한다면-readresolve보다는-열거-타입을-사용하라)
  > - [아이템 90. 직렬화된 인스턴스 대신 직렬화 프록시 사용을 검토하라](#아이템-90-직렬화된-인스턴스-대신-직렬화-프록시-사용을-검토하라)

## 아이템 1. 생성자 대신 정적 팩터리 메서드를 고려하라

## 아이템 2. 생성자에 매개변수가 많다면 빌더를 고려하라

## 아이템 3. private 생성자나 열거 타입으로 싱글턴임을 보증하라

## 아이템 4. 인스턴스화를 막으려거든 private 생성자를 사용하라

## 아이템 5. 자원을 직접 명시하지 말고 의존 객체 주입을 사용하라

## 아이템 6. 불필요한 객체 생성을 피하라

## 아이템 7. 다 쓴 객체 참조를 해제하라

## 아이템 8. finalizer와 cleaner 사용을 피하라

### finalizer

- Java 9 이전에는 객체가 가비지 컬렉션 대상이 될 때 정리 작업을 수행하는 방법으로 `finalize` 메서드를 사용했음.
- `finalize` 메서드는 객체가 더 이상 참조되지 않을 때 가비지 컬렉터에 의해 호출되지만, 호출 시점이 명확하지 않으며 성능에 큰 영향을 미칠 수 있음.

### Cleaner

- Java 9에서 도입된 `Cleaner`는 `finalize` 메서드를 대체하는 더 안전하고 성능이 좋은 방법.
- `Cleaner`는 백그라운드 스레드를 사용하여 등록된 객체가 가비지 컬렉션 대상이 될 때 정리 작업을 수행함.
- `Cleaner`는 명시적으로 객체를 정리할 수 있는 방법을 제공하여, 정리 작업의 타이밍을 좀 더 제어할 수 있음.

### finalizer와 Cleaner 사용을 피해야 하는 이유

- **Unpredictable Timing**: `finalize` 메서드는 가비지 컬렉터에 의해 호출되므로, 호출 시점이 예측할 수 없음. 이는 리소스 해제 작업이 지연되어 리소스 누수 문제를 일으킬 수 있음.
- **Performance Overhead**: `finalize` 메서드는 성능에 큰 영향을 줄 수 있음. 가비지 컬렉션 과정에서 추가적인 오버헤드가 발생하기 때문임.
- **Unreliability**: `finalize` 메서드가 실행되지 않을 수도 있음. 가비지 컬렉터가 객체를 수집하기 전에 프로그램이 종료될 수 있기 때문임.
- **Security Risks**: `finalize` 메서드를 잘못 사용하면 보안 문제가 발생할 수 있음. 특히, `finalize` 메서드를 오버라이드하여 객체를 재생성하면 예기치 않은 동작을 유발할 수 있음.

### 요약

- **`cleaner`(자바 8까지는 `finalizer`)는 안전망 역할이나 중요하지 않은 네이티브 자원 회수로용으로만 사용할 것.**
- `finalizer`는 예측할 수 없고, 상황에 따라 위험할 수 있어 일반적으로 불필요함.
- `cleaner`는 `finalizer`보다는 덜 위험하지만, 여전히 예측할 수 없고, 느리고, 일반적으로 불필요함.
- `finalizer`와 `cleaner`로는 제때 실행되어야 하는 작업은 절대 할 수 없음.
- 상태를 영구적으로 수정하는 작업에서는 절대 `finalizer`나 `cleaner`에 의존해서는 안됨.
- `finalizer`와 `cleaner`는 심각한 성능 문제도 동반함.
- `finalizer`를 사용한 클래스는 `finalizer` 공격에 노출되어 심각한 보안 문제를 일으킬 수도 있음.
- `final`이 아닌 클래스를 `finalizer` 공격으로부터 방어하려면 아무일도 하지 않는 `finalizer`를 만들고 `final`로 선언할 것.
- `finalizer`나 `cleaner`를 대신해서 `AutoClosable`을 쓸 것.

## 아이템 9. try-finally보다는 try-with-resources를 사용하라

### try-finally

- `try` 블록에서 리소스를 사용하고, `finally` 블록에서 리소스를 명시적으로 해제해야 함.
- 코드가 길어지고 가독성이 떨어질 수 있음.
- 리소스 해제 로직을 개발자가 직접 작성해야 함.
- 예외 발생 시 리소스 해제 로직이 실행되지 않을 수 있음.

### try-with-resources

- Java 7부터 도입된 기능으로, 리소스를 자동으로 해제해주는 구문.
- `try` 블록에서 사용할 리소스를 소괄호 안에 선언함.
- 리소스 객체는 `AutoCloseable` 인터페이스를 구현해야 함.
- `try` 블록이 종료되면 자동으로 리소스의 `close()` 메서드가 호출되어 리소스가 해제됨.
- 코드가 간결해지고 가독성이 좋아짐.
- 예외 발생 여부와 관계없이 항상 리소스가 해제됨.

### 요약

- 꼭 회수해야 하는 자원을 다룰 때는 try-finally가 아닌 try-with-resources를 사용할 것.

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

### 요약

- **예외는 예외 상황에서 쓸 의도로 설계됨. 정상적인 제어 흐름에서는 사용해서는 안되며, 이를 프로그래머에게 강요하는 API를 만들어서도 안 됨**.
- 예외는 오직 예외 상황에서만 써야함. 절대로 일상적인 제어 흐름용으로 쓰여선 안 됨.
- 잘 설계된 API라면 클라이언트가 정상적인 제어 흐름에서 예외를 사용할 일이 없게 해야 함.

## 아이템 70. 복구할 수 있는 상황에는 검사 예외를, 프로그래밍 오류에는 런타임 예외를 사용하라

### 검사 예외(Checked Exception)

- 검사 예외는 `Exception` 클래스의 서브 클래스 중 `RuntimeException`을 상속하지 않는 예외.
- 컴파일러가 프로그램의 컴파일 시점에 검사 예외 처리 여부를 검사함.
- 검사 예외가 발생할 수 있는 메서드를 호출할 때는 반드시 `try-catch` 블록으로 예외를 처리하거나 `throws` 키워드로 예외를 선언해야 함.
- 대표적인 검사 예외로는 `IOException`, `SQLException` 등이 있음.
- 검사 예외는 일반적으로 복구 가능한 예외 상황을 나타내며, 예외 처리를 강제함으로써 안정성을 높임.
- 컴파일 시점에 예외 처리 여부를 검사함.
- 예외 처리를 강제함으로써 안정성을 높일 수 있음.

### 비검사 예외(Unchecked Exception)

- 비검사 예외는 `RuntimeException` 클래스의 서브 클래스.
- 컴파일러가 프로그램의 컴파일 시점에 비검사 예외 처리 여부를 검사하지 않음.
- 비검사 예외는 `try-catch` 블록으로 예외를 처리하거나 `throws` 키워드로 예외를 선언하지 않아도 됨.
- 대표적인 비검사 예외로는 `NullPointerException`, `ArrayIndexOutOfBoundsException` 등이 있음.
- 비검사 예외는 일반적으로 프로그램의 오류나 잘못된 사용으로 인한 예외 상황을 나타내며, 개발자가 예외 처리를 선택적으로 할 수 있음.
- 컴파일 시점에 예외 처리 여부를 검사하지 않음.
- 예외 처리를 선택적으로 할 수 있어 유연성을 제공함.

### Throwable

- `Throwable`은 Java에서 모든 예외와 오류의 최상위 클래스.
- `Throwable`은 크게 두 가지 하위 클래스로 나뉨
  > - `Exception`: 일반적인 예외를 나타내는 클래스. 프로그램 실행 중에 발생할 수 있는 예외 상황을 나타냄.
  > - `Error`: 심각한 오류를 나타내는 클래스. 일반적으로 프로그램으로 처리할 수 없는 시스템 레벨의 오류를 나타냄.
- `Throwable`을 직접 사용하는 경우는 드뭄. 대부분의 경우 `Exception`이나 `Error` 클래스 또는 그 하위 클래스를 사용하여 예외와 오류를 처리함.
- 하지만 `Throwable`은 예외와 오류의 공통적인 기능을 제공하며, 다음과 같은 상황에서 사용될 수 있음.
  > - 모든 예외와 오류를 한 번에 처리해야 할 때
  > - 예외와 오류에 대한 공통적인 로깅이나 보고 기능을 구현할 때
  > - 사용자 정의 예외 클래스를 만들 때 (예: `extends Exception` 또는 `extends Throwable`)

### 요약

- 복구할 수 있는 상황이면 검사 예외를, 프로그래밍 오류라면 비검사 예외를 던질 것. 확실하지 않다면 비검사 예외를 던질 것. 검사 예외도 아니고 런타임 에외도 아닌 `throwable`은 정의하지도 말 것.
- 호출하는 쪽에서 복구하리라 여겨지는 상황이라면 검사 예외를 사용할 것.
- 프로그래밍 오류를 나타낼 때는 런타임 예외를 사용할 것.
- 구현하는 비검사 `throwable`은 모두 `RuntimeException`의 하위 클래스여야 함.

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

Chapter 6: Enums and Annotations

public class Item34_UseEnumsInsteadOfIntConstants {}
public class Item35_UseInstanceFieldsInsteadOfOrdinals {}
public class Item36_UseEnumSetInsteadOfBitFields {}
public class Item37_UseEnumMapInsteadOfOrdinalIndexing {}
public class Item38_ExtensibleEnumsViaInterfaces {}
public class Item39_PreferAnnotationsToNamingPatterns {}
public class Item40_ConsistentlyUseOverrideAnnotation {}
public class Item41_UseMarkerInterfacesToDefineTypes {}

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
