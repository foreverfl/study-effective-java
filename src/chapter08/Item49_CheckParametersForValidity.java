package chapter08;

import java.util.Objects;

public class Item49_CheckParametersForValidity {
    // Objects.requireNonNull을 사용한 매개변수 유효성 검사 클래스
    static class MyClass1 {
        private String name;

        public MyClass1(String name) {
            this.name = Objects.requireNonNull(name, "name cannot be null");
        }

        public String getName() {
            return name;
        }
    }

    // checkFromIndexSize를 사용한 매개변수 유효성 검사 클래스
    static class MyClass2 {
        private int[] array;

        public MyClass2() {
            this.array = new int[10];
        }

        public void setRange(int from, int size, int length) {
            Objects.checkFromIndexSize(from, size, length);
            for (int i = from; i < from + size; i++) {
                array[i] = i;
            }
        }

        public int[] getArray() {
            return array;
        }
    }

    // assert를 사용한 매개변수 유효성 검사 클래스
    static class MyClass3 {
        private int positiveNumber;

        public void setPositiveNumber(int number) {
            assert number > 0 : "Number must be positive"; // 숫자는 양수여야 합니다
            this.positiveNumber = number;
        }

        public int getPositiveNumber() {
            return positiveNumber;
        }
    }

    public static void main(String[] args) {
        // requireNonNull을 사용한 MyClass1 테스트
        try {
            @SuppressWarnings("unused")
            MyClass1 myClass1 = new MyClass1(null); // NullPointerException 발생
        } catch (NullPointerException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        // checkFromIndexSize를 사용한 MyClass2 테스트
        try {
            MyClass2 myClass2 = new MyClass2();
            myClass2.setRange(10, 5, 20); // IndexOutOfBoundsException 발생
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        // assert를 사용한 MyClass3 테스트
        MyClass3 myClass3 = new MyClass3();
        try {
            myClass3.setPositiveNumber(-5); // AssertionError 발생
        } catch (AssertionError e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
