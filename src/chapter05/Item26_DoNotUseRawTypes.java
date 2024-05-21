package chapter05;

import java.util.Arrays;
import java.util.List;

public class Item26_DoNotUseRawTypes {

    private static class GenericClass<T> {
        private T value;

        public GenericClass(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        // 제네릭 클래스 및 인터페이스 사용
        GenericClass<String> stringInstance = new GenericClass<>("Hello");
        System.out.println("GenericClass with String: " + stringInstance.getValue());

        GenericClass<Integer> integerInstance = new GenericClass<>(123);
        System.out.println("GenericClass with Integer: " + integerInstance.getValue());

        // 로 타입 사용 (권장되지 않음)
        @SuppressWarnings({ "rawtypes", "unchecked" })
        GenericClass rawInstance = new GenericClass("Raw Type");
        System.out.println("Raw type: " + rawInstance.getValue());

        // 제네릭 타입과 instanceof
        Object o = new GenericClass<>("Instanceof Test");
        if (o instanceof GenericClass) {
            GenericClass<?> genericInstance = (GenericClass<?>) o;
            System.out.println("Instanceof test passed: " + genericInstance.getValue());
        }

        // 와일드카드 사용
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        printList(intList);

        List<String> strList = Arrays.asList("A", "B", "C");
        printList(strList);
    }

    public static void printList(List<?> list) {
        for (Object elem : list) {
            System.out.println("Element: " + elem);
        }
    }
}