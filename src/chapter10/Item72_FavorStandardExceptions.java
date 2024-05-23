package chapter10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.List;

public class Item72_FavorStandardExceptions {
    private static class ExceptionDemo {
        // IllegalArgumentException 예제
        public static void demoIllegalArgumentException(int value) {
            if (value < 0) {
                throw new IllegalArgumentException("Value must be non-negative");
            }
            System.out.println("Value is valid: " + value);
        }

        // IllegalStateException 예제
        public static void demoIllegalStateException(boolean isInitialized) {
            if (!isInitialized) {
                throw new IllegalStateException("Object is not initialized");
            }
            System.out.println("Object is properly initialized");
        }

        // NullPointerException 예제
        public static void demoNullPointerException(String str) {
            if (str == null) {
                throw new NullPointerException("String cannot be null");
            }
            System.out.println("String length: " + str.length());
        }

        // IndexOutOfBoundsException 예제
        public static void demoIndexOutOfBoundsException(int[] array, int index) {
            if (index < 0 || index >= array.length) {
                throw new IndexOutOfBoundsException("Index is out of bounds");
            }
            System.out.println("Array element at index " + index + ": " + array[index]);
        }

        // ConcurrentModificationException 예제
        public static void demoConcurrentModificationException() {
            List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));
            for (String item : list) {
                if ("b".equals(item)) {
                    list.remove(item);
                }
            }
        }

        // UnsupportedOperationException 예제
        public static void demoUnsupportedOperationException() {
            List<String> list = Arrays.asList("a", "b", "c");
            list.add("d"); // UnsupportedOperationException 발생
        }
    }

    public static void main(String[] args) {
        try {
            ExceptionDemo.demoIllegalArgumentException(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }

        try {
            ExceptionDemo.demoIllegalStateException(false);
        } catch (IllegalStateException e) {
            System.out.println("Caught IllegalStateException: " + e.getMessage());
        }

        try {
            ExceptionDemo.demoNullPointerException(null);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }

        try {
            int[] array = { 1, 2, 3 };
            ExceptionDemo.demoIndexOutOfBoundsException(array, 3);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught IndexOutOfBoundsException: " + e.getMessage());
        }

        try {
            ExceptionDemo.demoConcurrentModificationException();
        } catch (ConcurrentModificationException e) {
            System.out.println("Caught ConcurrentModificationException: " + e.getMessage());
        }

        try {
            ExceptionDemo.demoUnsupportedOperationException();
        } catch (UnsupportedOperationException e) {
            System.out.println("Caught UnsupportedOperationException: " + e.getMessage());
        }
    }
}
