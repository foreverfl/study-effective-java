package chapter08;

import java.util.Arrays;
import java.util.List;

public class Item51_DesignMethodSignaturesCarefully {
    // 1. 편의 메서드를 너무 많이 만들지 말 것
    static class ConvenienceMethods {
        public void addElement(int[] array, int index, int element) {
            if (index < 0 || index >= array.length) {
                throw new IndexOutOfBoundsException("Invalid index");
            }
            array[index] = element;
        }

        // 확신이 없으면 만들지 말 것 - 불필요한 편의 메서드의 예
        // public void addElement(int index, int element) { ... }
    }

    // 2. 매개변수 목록은 짧게 유지할 것
    static class ParameterList {
        // 여러 메서드로 쪼개기
        public void setPosition(int x, int y) {
            // 설정 코드
        }

        public void setSize(int width, int height) {
            // 설정 코드
        }

        // 매개변수 여러 개를 묶어주는 도우미 클래스
        static class Position {
            int x, y;

            Position(int x, int y) {
                this.x = x;
                this.y = y;
            }
        }

        public void setPosition(Position position) {
            // 설정 코드
        }

        // 빌더 패턴을 응용한 메서드 호출
        static class GraphicsConfig {
            @SuppressWarnings("unused")
            private int x, y, width, height;

            public GraphicsConfig setX(int x) {
                this.x = x;
                return this;
            }

            public GraphicsConfig setY(int y) {
                this.y = y;
                return this;
            }

            public GraphicsConfig setWidth(int width) {
                this.width = width;
                return this;
            }

            public GraphicsConfig setHeight(int height) {
                this.height = height;
                return this;
            }
        }

        public void applyConfig(GraphicsConfig config) {
            // 설정 코드
        }
    }

    // 3. 매개변수의 타입으로는 클래스보다는 인터페이스가 더 나음
    static class UseInterface {
        public void printList(List<String> list) {
            for (String item : list) {
                System.out.println(item);
            }
        }
    }

    // 4. boolean보다는 원소 2개짜리 열거 타입이 나음
    static class UseEnum {
        enum Status {
            ENABLED, DISABLED
        }

        public void setStatus(Status status) {
            // 설정 코드
        }
    }

    public static void main(String[] args) {
        // 1. 편의 메서드를 너무 많이 만들지 말 것
        ConvenienceMethods convenienceMethods = new ConvenienceMethods();
        int[] array = new int[10];
        convenienceMethods.addElement(array, 2, 50);

        // 2. 매개변수 목록은 짧게 유지할 것
        ParameterList parameterList = new ParameterList();
        parameterList.setPosition(10, 20);
        parameterList.setSize(100, 200);

        ParameterList.Position position = new ParameterList.Position(30, 40);
        parameterList.setPosition(position);

        ParameterList.GraphicsConfig config = new ParameterList.GraphicsConfig()
                .setX(50)
                .setY(60)
                .setWidth(300)
                .setHeight(400);
        parameterList.applyConfig(config);

        // 3. 매개변수의 타입으로는 클래스보다는 인터페이스가 더 나음
        UseInterface useInterface = new UseInterface();
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");
        useInterface.printList(list);

        // 4. boolean보다는 원소 2개짜리 열거 타입이 나음
        UseEnum useEnum = new UseEnum();
        useEnum.setStatus(UseEnum.Status.ENABLED);
    }
}
