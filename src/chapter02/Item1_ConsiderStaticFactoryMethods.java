package chapter02;

public class Item1_ConsiderStaticFactoryMethods {
    // 정적 팩터리 메서드를 사용하는 클래스
    public static class Person {
        protected String name;
        protected int age;

        // private 생성자
        private Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // from - 특정 데이터 타입에서 변환할 때 사용
        public static Person from(String name) {
            return new Person(name, 0);
        }

        // of - 여러 매개변수로 객체를 생성할 때 사용
        public static Person of(String name, int age) {
            return new Person(name, age);
        }

        // valueOf - 문자열 등의 값에서 객체를 생성할 때 사용
        public static Person valueOf(String name) {
            return new Person(name, 0);
        }

        // getInstance - 싱글톤 패턴 또는 인스턴스를 반환할 때 사용
        public static Person getInstance(String name, int age) {
            return new Person(name, age);
        }

        // create - 새 인스턴스를 생성할 때 사용
        public static Person create(String name, int age) {
            return new Person(name, age);
        }

        // getType - 특정 타입의 인스턴스를 반환할 때 사용
        public static Person getType(String name, int age) {
            return new Person(name, age);
        }

        // newType - 새 타입의 인스턴스를 생성할 때 사용
        public static Person newType(String name, int age) {
            return new Person(name, age);
        }

        // type - 인스턴스를 반환할 때 사용
        public static Person type(String name, int age) {
            return new Person(name, age);
        }

        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + "}";
        }
    }

    // 하위 클래스
    public static class Employee extends Person {
        private String company;

        private Employee(String name, int age, String company) {
            super(name, age);
            this.company = company;
        }

        // 하위 타입 객체를 반환하는 정적 팩터리 메서드
        public static Employee of(String name, int age, String company) {
            return new Employee(name, age, company);
        }

        @Override
        public String toString() {
            return "Employee{name='" + name + "', age=" + age + "', company='" + company + "'}";
        }
    }

    // 현재는 비어 있지만 정적 팩터리 메서드를 통해 나중에 반환할 클래스
    public static class DynamicPerson {
        private String name;
        private int age;

        // private 생성자
        private DynamicPerson(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "DynamicPerson{name='" + name + "', age=" + age + "}";
        }
    }

    // 팩터리 메서드 제공자
    public static class PersonFactory {
        public static Person createPerson(String name, int age) {
            return new Person(name, age);
        }

        // 정적 팩터리 메서드를 작성하는 시점에는 반환할 객체의 클래스가 존재하지 않아도 됨
        public static Object createDynamicPerson(String name, int age) {
            return new DynamicPerson(name, age); // DynamicPerson 클래스가 나중에 정의됨
        }
    }

    // 생성자 방식 사용하는 클래스
    public static class PersonViaConstructor {
        private String name;
        private int age;

        // public 생성자
        public PersonViaConstructor(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "PersonViaConstructor{name='" + name + "', age=" + age + "}";
        }
    }

    public static void main(String[] args) {

        // 생성자 방식
        PersonViaConstructor person1 = new PersonViaConstructor("Eve", 35);
        System.out.println(person1);
        System.out.println("==============================================");

        // 정적 팩터리 메서드
        // 이름을 가질 수 있음
        Person person2 = Person.of("Alice", 30);
        System.out.println(person2);

        // 호출될 때마다 인스턴스를 새로 생성하지 않아도 됨 (예: 싱글톤)
        Person person3 = Person.getInstance("Bob", 25);
        System.out.println(person3);

        // 반환 타입의 하위 타입 객체를 반환할 수 있는 능력이 있음
        Employee employee1 = Employee.of("Charlie", 40, "Tech Corp");
        System.out.println(employee1);

        // 입력 매개변수에 따라 매번 다른 클래스의 객체를 반환할 수 있음
        Person person4 = Person.valueOf("Charlie");
        System.out.println(person4);

        // 정적 팩터리 메서드를 작성하는 시점에는 반환할 객체의 클래스가 존재하지 않아도 됨
        Object dynamicPerson = PersonFactory.createDynamicPerson("Frank", 45);
        System.out.println(dynamicPerson);
    }

}
