package chapter10;

import java.util.Optional;

public class Item71_AvoidUnnecessaryUseOfCheckedExceptions {

    private static class AuthenticationException extends Exception {
        public AuthenticationException(String message) {
            super(message);
        }
    }

    private static class UserService {
        // 검사 예외를 사용하는 메서드
        public static boolean authenticateWithCheckedException(String username, String password)
                throws AuthenticationException {
            if (username == null || password == null) {
                throw new AuthenticationException("Username or password is null");
            }
            // 인증 로직 (예시로 간단히 처리)
            if (username.equals("user") && password.equals("password")) {
                return true;
            } else {
                throw new AuthenticationException("Authentication failed");
            }
        }

        // 옵셔널을 사용하는 메서드
        public static Optional<String> authenticateWithOptional(String username, String password) {
            if (username == null || password == null) {
                return Optional.empty();
            }
            // 인증 로직 (예시로 간단히 처리)
            if (username.equals("user") && password.equals("password")) {
                return Optional.of("User authenticated successfully.");
            } else {
                return Optional.empty();
            }
        }
    }

    public static void main(String[] args) {
        // 검사 예외를 사용하는 방법
        try {
            if (UserService.authenticateWithCheckedException("user", "password")) {
                System.out.println("User authenticated successfully with checked exception.");
            }
        } catch (AuthenticationException e) {
            System.out.println("Failed to authenticate user with checked exception: " + e.getMessage());
        }

        System.out.println("=================================================");

        // 옵셔널을 사용하는 방법
        Optional<String> result = UserService.authenticateWithOptional("user", "password");
        // ifPresentOrElse는 Java 9에서 도입된 Optional 클래스의 메서드로, Optional 객체가 값을 가지고 있을 때와
        // 그렇지 않을 때의 동작을 정의할 수 있음
        result.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("Failed to authenticate user with optional."));
    }

}
