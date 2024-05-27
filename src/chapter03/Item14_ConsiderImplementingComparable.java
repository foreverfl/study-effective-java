package chapter03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Item14_ConsiderImplementingComparable {
    public static class Person implements Comparable<Person> {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public int compareTo(Person other) {
            // 기본적으로 나이순으로 비교
            return Integer.compare(this.age, other.age);
        }

        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + "}";
        }
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        // 기본 나이 순서로 정렬
        Collections.sort(people);
        System.out.println("Sorted by age (natural order): " + people);

        // 이름의 해시코드 순서로 정렬
        Collections.sort(people, (o1, o2) -> Integer.compare(o1.hashCode(), o2.hashCode()));
        System.out.println("Sorted by hashCode: " + people);

        // 이름의 길이 순서로 정렬
        people.sort(Comparator.comparingInt(o -> o.getName().length()));
        System.out.println("Sorted by name length: " + people);
    }
}
