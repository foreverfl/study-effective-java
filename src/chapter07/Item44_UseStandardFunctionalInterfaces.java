package chapter07;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Item44_UseStandardFunctionalInterfaces {
    public static void main(String[] args) {
        // 1. UnaryOperator<T>
        UnaryOperator<Integer> square = x -> x * x;
        System.out.println(square.apply(5)); // 출력: 25

        // 2. BinaryOperator<T>
        BinaryOperator<Integer> sum = (a, b) -> a + b;
        System.out.println(sum.apply(3, 4)); // 출력: 7

        // 3. Predicate<T>
        Predicate<String> isLongerThan5 = str -> str.length() > 5;
        System.out.println(isLongerThan5.test("Hello")); // 출력: false
        System.out.println(isLongerThan5.test("Hello, World!")); // 출력: true

        // 4. Function<T, R>
        Function<String, Integer> strLength = str -> str.length();
        System.out.println(strLength.apply("Hello")); // 출력: 5

        // 5. Supplier<T>
        Supplier<String> greetingSupplier = () -> "Hello, World!";
        System.out.println(greetingSupplier.get()); // 출력: Hello, World!

        // 6. Consumer<T>
        Consumer<String> printString = str -> System.out.println(str);
        printString.accept("Hello, Consumer!"); // 출력: Hello, Consumer!
    }
}
