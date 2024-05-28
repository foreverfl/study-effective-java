package chapter04;

public class Item23_PreferClassHierarchiesToTaggedClasses {
    // 태그 달린 클래스
    public static class Figure {
        enum Shape {
            RECTANGLE, CIRCLE
        };

        // 태그 필드
        final Shape shape;

        // RECTANGLE일 때만 사용되는 필드
        double length;
        double width;

        // CIRCLE일 때만 사용되는 필드
        double radius;

        // RECTANGLE 생성자
        public Figure(double length, double width) {
            shape = Shape.RECTANGLE;
            this.length = length;
            this.width = width;
        }

        // CIRCLE 생성자
        public Figure(double radius) {
            shape = Shape.CIRCLE;
            this.radius = radius;
        }

        public double area() {
            switch (shape) {
                case RECTANGLE:
                    return length * width;
                case CIRCLE:
                    return Math.PI * (radius * radius);
                default:
                    throw new AssertionError(shape);
            }
        }
    }

    // 클래스 계층구조
    public static abstract class FigureHierarchy {
        abstract double area();
    }

    public static class Rectangle extends FigureHierarchy {
        private final double length;
        private final double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        double area() {
            return length * width;
        }
    }

    public static class Circle extends FigureHierarchy {
        private final double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        double area() {
            return Math.PI * (radius * radius);
        }
    }

    public static void main(String[] args) {
        // 태그 달린 클래스 사용
        Figure rectangle = new Figure(2, 3);
        Figure circle = new Figure(1);

        System.out.println("Tagged Rectangle Area: " + rectangle.area());
        System.out.println("Tagged Circle Area: " + circle.area());

        // 클래스 계층구조 사용
        FigureHierarchy rect = new Rectangle(2, 3);
        FigureHierarchy circ = new Circle(1);

        System.out.println("Hierarchy Rectangle Area: " + rect.area());
        System.out.println("Hierarchy Circle Area: " + circ.area());
    }
}