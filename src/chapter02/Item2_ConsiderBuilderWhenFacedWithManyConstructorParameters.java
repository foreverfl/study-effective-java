package chapter02;

public class Item2_ConsiderBuilderWhenFacedWithManyConstructorParameters {
    // 점층적 생성자 패턴
    public static class TelescopingConstructor {
        private final int x;
        private final int y;
        private final int z;

        public TelescopingConstructor(int x) {
            this(x, 0);
        }

        public TelescopingConstructor(int x, int y) {
            this(x, y, 0);
        }

        public TelescopingConstructor(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        @Override
        public String toString() {
            return "TelescopingConstructor{" +
                    "x=" + x +
                    ", y=" + y +
                    ", z=" + z +
                    '}';
        }
    }

    // 자바빈즈 패턴
    public static class JavaBeans {
        private int x;
        private int y;
        private int z;

        public JavaBeans() {
            // 기본 생성자
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }

        public void setZ(int z) {
            this.z = z;
        }

        @Override
        public String toString() {
            return "JavaBeans{" +
                    "x=" + x +
                    ", y=" + y +
                    ", z=" + z +
                    '}';
        }
    }

    // 빌더 패턴
    public static class BuilderPattern {
        private final int x;
        private final int y;
        private final int z;

        public static class Builder {
            private int x;
            private int y;
            private int z;

            public Builder() {
                // 기본 값 설정 가능
            }

            public Builder x(int x) {
                this.x = x;
                return this; // this는 Builder 객체 자신을 가리킴
            }

            public Builder y(int y) {
                this.y = y;
                return this;
            }

            public Builder z(int z) {
                this.z = z;
                return this;
            }

            public BuilderPattern build() {
                return new BuilderPattern(this); // 최종적으로 BuilderPattern 객체 생성
            }
        }

        private BuilderPattern(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
            this.z = builder.z;
        }

        @Override
        public String toString() {
            return "BuilderPattern{" +
                    "x=" + x +
                    ", y=" + y +
                    ", z=" + z +
                    '}';
        }
    }

    public static void main(String[] args) {
        // 점층적 생성자 패턴 사용
        TelescopingConstructor tc = new TelescopingConstructor(1, 2, 3);
        System.out.println(tc);

        // 자바빈즈 패턴 사용
        JavaBeans jb = new JavaBeans();
        jb.setX(1);
        jb.setY(2);
        jb.setZ(3);
        System.out.println(jb);

        // 빌더 패턴 사용
        BuilderPattern bp = new BuilderPattern.Builder()
                .z(1)
                .y(2)
                .x(3)
                .build();
        System.out.println(bp);
    }
}
