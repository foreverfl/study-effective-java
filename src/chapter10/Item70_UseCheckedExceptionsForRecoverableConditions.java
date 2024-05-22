package chapter10;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Item70_UseCheckedExceptionsForRecoverableConditions {
    // 검사 예외를 던지는 메서드
    public static void checkedExceptionMethod() throws FileNotFoundException {
        @SuppressWarnings({ "unused", "resource" })
        FileReader file = new FileReader("file.txt");
    }

    // 비검사 예외를 던지는 메서드
    public static void uncheckedExceptionMethod() {
        int[] numbers = { 1, 2, 3 };
        @SuppressWarnings("unused")
        int result = numbers[5]; // ArrayIndexOutOfBoundsException 발생
    }

    public static void main(String[] args) {
        // 검사 예외를 처리하지 않으면 컴파일 에러 발생
        // checkedExceptionMethod();

        // 검사 예외를 처리하는 코드
        try {
            checkedExceptionMethod();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

        // 비검사 예외는 컴파일 시점에 처리 여부를 검사하지 않음
        uncheckedExceptionMethod();
    }
}
