package chapter08;

import java.util.function.Function;

public class Item52_UseOverloadingJudiciously {
    static class Printer {
        public void print(String message) {
            System.out.println("String message: " + message);
        }

        public void print(int number) {
            System.out.println("int number: " + number);
        }

        public void print(Object obj) {
            System.out.println("Object: " + obj);
        }
    }

    // 혼동을 일으킬 수 있는 오버로딩 메서드들
    static class Calculator {
        // 매개변수 수가 같은 오버로딩 피하기
        public void calculate(int a, int b) {
            System.out.println("int, int: " + (a + b));
        }

        public void calculate(double a, double b) {
            System.out.println("double, double: " + (a + b));
        }

        // 함수형 인터페이스의 오버로딩 피하기
        public void process(Function<Integer, String> func) {
            System.out.println("Function<Integer, String> processed");
        }

        // public void process(Function<Double, String> func) {
        // System.out.println("Function<Double, String> processed");
        // }
    }

    public static void main(String[] args) {

        Printer printer = new Printer();

        // 컴파일 타임에 메서드 결정
        printer.print("Hello"); // String message: Hello
        printer.print(123); // int number: 123
        printer.print(new Object()); // Object: java.lang.Object@xxxxxx

        // 기대와 다른 출력
        printer.print(null); // String message: null
        // Object 타입의 오버로드된 메서드를 호출할 것 같지만, String 타입 메서드를 호출
        // null이 출력되는 이유는 null 리터럴을 넘길 때, 자바 컴파일러가 가장 구체적인 타입의 메서드를 선택하기 때문임
        System.out.println();

        Calculator calculator = new Calculator();

        // 혼동을 일으키는 오버로딩 예제
        calculator.calculate(2, 3); // int, int: 5
        calculator.calculate(2.0, 3.0); // double, double: 5.0
        // calculator.calculate(2, 3.0); // 컴파일 오류: 모호한 호출

        // 함수형 인터페이스의 오버로딩 예제
        calculator.process((Integer x) -> x.toString()); // Function<Integer, String> processed
        // calculator.process((Double x) -> x.toString()); // 컴파일 오류: 모호한 호출
    }

}
