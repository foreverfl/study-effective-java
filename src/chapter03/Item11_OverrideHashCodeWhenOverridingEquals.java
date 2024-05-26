package chapter03;

import java.util.HashSet;
import java.util.Objects;

public class Item11_OverrideHashCodeWhenOverridingEquals {
    public static class DefaultHashCodePerson {
        private String name;
        private int age;

        public DefaultHashCodePerson(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "DefaultHashCodePerson{name='" + name + "', age=" + age + "}";
        }
    }

    public static class CustomHashCodePerson {
        private String name;
        private int age;

        public CustomHashCodePerson(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null || getClass() != obj.getClass())
                return false;
            CustomHashCodePerson person = (CustomHashCodePerson) obj;
            return age == person.age && (name != null ? name.equals(person.name) : person.name == null);
        }

        @Override
        public int hashCode() {
            int result = 17; // 임의의 비-zero 정수로 시작
            result = 31 * result + (name != null ? name.hashCode() : 0); // name 필드의 해시코드 포함
            result = 31 * result + age; // age 필드의 해시코드 포함
            return result;
        }

        @Override
        public String toString() {
            return "CustomHashCodePerson{name='" + name + "', age=" + age + "}";
        }
    }

    public static class SimplifiedHashCodePerson {
        private String name;
        private int age;

        public SimplifiedHashCodePerson(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null || getClass() != obj.getClass())
                return false;
            SimplifiedHashCodePerson person = (SimplifiedHashCodePerson) obj;
            return age == person.age && (name != null ? name.equals(person.name) : person.name == null);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        @Override
        public String toString() {
            return "SimplifiedHashCodePerson{name='" + name + "', age=" + age + "}";
        }
    }

    public static void main(String[] args) {
        DefaultHashCodePerson person1 = new DefaultHashCodePerson("Alice", 30);
        DefaultHashCodePerson person2 = new DefaultHashCodePerson("Alice", 30);
        CustomHashCodePerson person3 = new CustomHashCodePerson("Alice", 30);
        CustomHashCodePerson person4 = new CustomHashCodePerson("Alice", 30);
        SimplifiedHashCodePerson person5 = new SimplifiedHashCodePerson("Alice", 30);
        SimplifiedHashCodePerson person6 = new SimplifiedHashCodePerson("Alice", 30);

        // DefaultHashCodePerson: 내장 hashCode 사용
        System.out.println("DefaultHashCodePerson:");
        System.out.println("person1.hashCode(): " + person1.hashCode());
        System.out.println("person2.hashCode(): " + person2.hashCode());
        System.out.println("person1.equals(person2): " + person1.equals(person2));

        // CustomHashCodePerson: 재정의된 hashCode 사용
        System.out.println("\nCustomHashCodePerson:");
        System.out.println("person3.hashCode(): " + person3.hashCode());
        System.out.println("person4.hashCode(): " + person4.hashCode());
        System.out.println("person3.equals(person4): " + person3.equals(person4));

        // SimplifiedHashCodePerson: Objects.hash 사용
        System.out.println("\nSimplifiedHashCodePerson:");
        System.out.println("person5.hashCode(): " + person5.hashCode());
        System.out.println("person6.hashCode(): " + person6.hashCode());
        System.out.println("person5.equals(person6): " + person5.equals(person6));

        // HashSet 테스트
        HashSet<DefaultHashCodePerson> defaultSet = new HashSet<>();
        defaultSet.add(person1);
        System.out.println("\ndefaultSet contains person2: " + defaultSet.contains(person2)); // false

        HashSet<CustomHashCodePerson> customSet = new HashSet<>();
        customSet.add(person3);
        System.out.println("customSet contains person4: " + customSet.contains(person4)); // true

        HashSet<SimplifiedHashCodePerson> simplifiedSet = new HashSet<>();
        simplifiedSet.add(person5);
        System.out.println("simplifiedSet contains person6: " + simplifiedSet.contains(person6)); // true
    }
}
