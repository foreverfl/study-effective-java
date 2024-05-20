package chapter07;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;

public class Item43_PreferMethodReferencesToLambdas {
    public static void main(String[] args) {
        // 1. 정적 메서드 참조
        // Function<T, R> 인터페이스는 입력 타입 T를 받아 출력 타입 R로 변환하는 함수
        Function<Integer, String> intToString = String::valueOf;
        String result1 = intToString.apply(10);
        System.out.println(result1); // 출력: "10"

        // 2. 한정적 인스턴스 메서드 참조
        String str = "Hello";
        // Supplier<T> 인터페이스는 입력 없이 출력 타입 T를 반환하는 함수
        Supplier<Integer> strLength = str::length;
        int result2 = strLength.get();
        System.out.println(result2); // 출력: 5

        // 3. 비한정적 인스턴스 메서드 참조
        // BiFunction<T, U, R> 인터페이스는 두 개의 입력 타입 T와 U를 받아 출력 타입 R로 변환하는 함수를 나타냄
        BiFunction<String, String, String> strConcat = String::concat;
        String result3 = strConcat.apply("Hello, ", "World!");
        System.out.println(result3); // 출력: "Hello, World!"

        // 4. 클래스 생성자 메서드 참조
        Supplier<StringBuilder> sbSupplier = StringBuilder::new;
        StringBuilder result4 = sbSupplier.get();
        System.out.println(result4); // 출력: ""

        // 5. 배열 생성자 메서드 참조
        IntFunction<String[]> arrayCreator = String[]::new;
        String[] result5 = arrayCreator.apply(5);
        System.out.println(Arrays.toString(result5)); // 출력: "[null, null, null, null, null]"
    }
}
