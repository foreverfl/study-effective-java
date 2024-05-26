package chapter03;

public class Item12_AlwaysOverrideToString {
    // 기본 클래스 - toString을 재정의하지 않음
    public static class DefaultToStringPerson {
        @SuppressWarnings("unused")
        private String name;
        @SuppressWarnings("unused")
        private int age;

        public DefaultToStringPerson(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    // Custom toString 메서드를 재정의한 클래스
    public static class CustomToStringPerson {
        private String name;
        private int age;

        public CustomToStringPerson(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "CustomToStringPerson{name='" + name + "', age=" + age + "}";
        }
    }

    // 다른 예제 클래스 - toString 메서드를 재정의하여 더 많은 정보를 제공
    public static class DetailedToStringPerson {
        private String name;
        private int age;
        private String address;

        public DetailedToStringPerson(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            return "DetailedToStringPerson{name='" + name + "', age=" + age + ", address='" + address + "'}";
        }
    }

    public static void main(String[] args) {
        DefaultToStringPerson defaultPerson = new DefaultToStringPerson("Alice", 30);
        CustomToStringPerson customPerson = new CustomToStringPerson("Alice", 30);
        DetailedToStringPerson detailedPerson = new DetailedToStringPerson("Alice", 30, "123 Main St");

        // DefaultToStringPerson: 기본 toString 사용 (Object의 toString 메서드)
        System.out.println("DefaultToStringPerson:");
        System.out.println(defaultPerson.toString());

        // CustomToStringPerson: 재정의된 toString 사용
        System.out.println("\nCustomToStringPerson:");
        System.out.println(customPerson.toString());

        // DetailedToStringPerson: 재정의된 toString 사용
        System.out.println("\nDetailedToStringPerson:");
        System.out.println(detailedPerson.toString());
    }
}
