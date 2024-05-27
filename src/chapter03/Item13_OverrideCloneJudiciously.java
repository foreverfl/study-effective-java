package chapter03;

public class Item13_OverrideCloneJudiciously {
    // Cloneable을 구현한 클래스
    public static class CloneableClass implements Cloneable {
        private int value;
        private int[] data;

        public CloneableClass(int value, int[] data) {
            this.value = value;
            this.data = data.clone(); // 깊은 복사를 위해 clone 사용
        }

        // 복사 생성자
        public CloneableClass(CloneableClass original) {
            this.value = original.value;
            this.data = original.data.clone(); // 깊은 복사를 위해 clone 사용
        }

        // 복사 팩토리 메서드
        public static CloneableClass newInstance(CloneableClass original) {
            return new CloneableClass(original);
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            CloneableClass cloned = (CloneableClass) super.clone();
            cloned.data = this.data.clone(); // 깊은 복사를 위해 clone 사용
            return cloned;
        }

        @Override
        public String toString() {
            return "CloneableClass [value=" + value + ", data=" + java.util.Arrays.toString(data) + "]";
        }
    }

    public static void main(String[] args) {
        try {
            // 원본 객체 생성
            int[] data = { 1, 2, 3 };
            CloneableClass original = new CloneableClass(10, data);

            // clone 메서드 사용
            CloneableClass cloned = (CloneableClass) original.clone();
            System.out.println("Original: " + original);
            System.out.println("Cloned: " + cloned);

            // 복사 생성자 사용
            CloneableClass copiedWithConstructor = new CloneableClass(original);
            System.out.println("Copied with Constructor: " + copiedWithConstructor);

            // 복사 팩토리 메서드 사용
            CloneableClass copiedWithFactory = CloneableClass.newInstance(original);
            System.out.println("Copied with Factory: " + copiedWithFactory);

            // 원본 데이터 변경 후 확인 (깊은 복사가 되었는지 확인)
            data[0] = 99;
            System.out.println("Original after modification: " + original);
            System.out.println("Cloned after modification: " + cloned);
            System.out.println("Copied with Constructor after modification: " + copiedWithConstructor);
            System.out.println("Copied with Factory after modification: " + copiedWithFactory);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
