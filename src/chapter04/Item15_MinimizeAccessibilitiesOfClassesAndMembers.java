package chapter04;

public class Item15_MinimizeAccessibilitiesOfClassesAndMembers {
    // 클래스 멤버 변수와 메서드의 접근 권한을 테스트하기 위한 예제 클래스
    public static class ExampleClass {
        private String privateMember = "Private Member";
        String defaultMember = "Default Member"; // package-private
        protected String protectedMember = "Protected Member";
        public String publicMember = "Public Member";

        private void privateMethod() {
            System.out.println("Private Method");
        }

        void defaultMethod() {
            System.out.println("Default Method"); // package-private
        }

        protected void protectedMethod() {
            System.out.println("Protected Method");
        }

        public void publicMethod() {
            System.out.println("Public Method");
        }
    }

    // 같은 패키지 내의 접근 테스트 클래스
    public static class SamePackageClass {
        public void accessTest() {
            ExampleClass example = new ExampleClass();
            // private 접근 불가
            // System.out.println(example.privateMember);
            // example.privateMethod();

            // default 접근 가능 (같은 패키지)
            System.out.println(example.defaultMember);
            example.defaultMethod();

            // protected 접근 가능 (같은 패키지)
            System.out.println(example.protectedMember);
            example.protectedMethod();

            // public 접근 가능
            System.out.println(example.publicMember);
            example.publicMethod();
        }
    }

    // 다른 패키지 내의 접근 테스트 클래스
    public static class SubClassInDifferentPackage extends ExampleClass {
        public void accessTest() {
            // private 접근 불가
            // System.out.println(privateMember);
            // privateMethod();

            // default 접근 불가 (다른 패키지)
            // System.out.println(defaultMember);
            // defaultMethod();

            // protected 접근 가능 (상속 관계)
            System.out.println(protectedMember);
            protectedMethod();

            // public 접근 가능
            System.out.println(publicMember);
            publicMethod();
        }
    }

    public static void main(String[] args) {
        SamePackageClass samePackage = new SamePackageClass();
        samePackage.accessTest();

        SubClassInDifferentPackage differentPackage = new SubClassInDifferentPackage();
        differentPackage.accessTest();
    }
}
