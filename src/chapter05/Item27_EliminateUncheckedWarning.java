package chapter05;

import java.util.Arrays;

public class Item27_EliminateUncheckedWarning {

    public static class GenericArrayExample {
        private static Object[] elements;
        private static int size;

        public GenericArrayExample(Object[] elements, int size) {
            GenericArrayExample.elements = elements;
            GenericArrayExample.size = size;
        }

        // 이 메서드는 주어진 배열의 크기를 확인하고, 만약 배열의 크기가 저장된 요소의 크기보다 작다면 새로운 배열을 생성하여 반환
        // 그렇지 않으면 주어진 배열에 저장된 요소들을 복사
        public static <T> T[] toArray(T[] a) {
            if (a.length < size) {
                @SuppressWarnings("unchecked")
                T[] result = (T[]) Arrays.copyOf(elements, size, a.getClass());
                return result;
            }

            System.arraycopy(elements, 0, a, 0, size);
            if (a.length > size) {
                a[size] = null;
            }
            return a;
        }
    }

    public static void main(String[] args) {
        Object[] initialElements = { 1, 2, 3, 4, 5 };
        int initialSize = initialElements.length;
        @SuppressWarnings("unused")
        GenericArrayExample example = new GenericArrayExample(initialElements, initialSize);

        Integer[] array = new Integer[0];
        Integer[] resultArray = GenericArrayExample.toArray(array);

        System.out.println("Resulting Array: " + Arrays.toString(resultArray));

        // Using a larger array
        Integer[] largerArray = new Integer[10];
        Integer[] resultArray2 = GenericArrayExample.toArray(largerArray);

        System.out.println("Resulting Array with larger array: " + Arrays.toString(resultArray2));
    }
}
