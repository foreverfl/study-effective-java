package chapter08;

import java.util.Optional;

public class Item55_ReturnOptionalsJudiciously {

    public static Optional<String> getOptionalValue(String email) {
        return Optional.ofNullable(email);
    }

    public static void main(String[] args) {
        // 기본값 정하기
        String value1 = getOptionalValue("john@example.com").orElse("No email provided");
        System.out.println("Value 1: " + value1);

        // 원하는 예외 던지기
        // String value2 =
        // getOptionalValue(null).orElseThrow(IllegalArgumentException::new);
        // System.out.println("Value 2: " + value2);

        // 항상 값이 채워져 있다고 가정하기
        Optional<String> optionalValue = getOptionalValue("jane@example.com");
        if (optionalValue.isPresent()) {
            String email = optionalValue.get();
            System.out.println("Value 3: " + email);
        }

        // Supplier를 활용한 초기 설정 비용 낮추기
        String value4 = getOptionalValue(null).orElseGet(() -> "Default email");// Optional 객체가 비어있을 때만 기본값을 생성하는 로직이므로
                                                                                // 초기 설정 비용이 낮아짐
        System.out.println("Value 4: " + value4);
    }

}
