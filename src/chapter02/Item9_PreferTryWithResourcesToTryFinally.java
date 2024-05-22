package chapter02;

public class Item9_PreferTryWithResourcesToTryFinally {
    static class MyResource implements AutoCloseable {
        private String name;

        public MyResource(String name) {
            this.name = name;
            System.out.println("MyResource " + name + " created.");
        }

        public void use() {
            System.out.println("Using MyResource " + name);
        }

        @Override
        public void close() {
            System.out.println("Closing MyResource " + name);
        }
    }

    public static void main(String[] args) {
        // try-with-resources를 사용한 예제
        try (MyResource resource1 = new MyResource("Resource 1")) {
            resource1.use();
        }

        System.out.println("============================");

        // try-finally를 사용한 예제
        MyResource resource2 = null;
        try {
            resource2 = new MyResource("Resource 2");
            resource2.use();
        } finally {
            if (resource2 != null) {
                resource2.close();
            }
        }
    }
}
