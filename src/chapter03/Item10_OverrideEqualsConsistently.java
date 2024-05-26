package chapter03;

public class Item10_OverrideEqualsConsistently {
    public static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true; // 반사성
            if (obj == null || getClass() != obj.getClass())
                return false;
            Person person = (Person) obj;
            return age == person.age && name.equals(person.name);
        }

        /**
         * 31은 소수(prime number). 소수를 사용하면 해시 충돌을 줄이는 데 도움이 됨. 이는 수학적으로 입증된 방법으로,
         * 대부분의 해시 함수 구현에서 소수를 사용하는 이유. 31은 계산 속도 면에서도 효율적임. 31 * i는 i << 5 - i로
         * 최적화할 수 있어 빠르게 계산할 수 있음.
         */
        @Override
        public int hashCode() {
            int result = name.hashCode();
            result = 31 * result + age;
            return result;
        }

        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + "}";
        }
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Alice", 30);
        Person person3 = new Person("Bob", 25);
        Person person4 = null;

        // 반사성
        System.out.println("Reflexivity:");
        System.out.println("person1.equals(person1): " + person1.equals(person1)); // true

        // 대칭성
        System.out.println("\nSymmetry:");
        System.out.println("person1.equals(person2): " + person1.equals(person2)); // true
        System.out.println("person2.equals(person1): " + person2.equals(person1)); // true

        // 추이성
        Person person5 = new Person("Alice", 30);
        System.out.println("\nTransitivity:");
        System.out.println("person1.equals(person2): " + person1.equals(person2)); // true
        System.out.println("person2.equals(person5): " + person2.equals(person5)); // true
        System.out.println("person1.equals(person5): " + person1.equals(person5)); // true

        // 일관성
        System.out.println("\nConsistency:");
        System.out.println("person1.equals(person2): " + person1.equals(person2)); // true
        System.out.println("person1.equals(person2): " + person1.equals(person2)); // true

        // null 아님
        System.out.println("\nNon-nullity:");
        System.out.println("person1.equals(null): " + person1.equals(person4)); // false

        // 다른 객체
        System.out.println("\nDifferent Objects:");
        System.out.println("person1.equals(person3): " + person1.equals(person3)); // false
    }
}
