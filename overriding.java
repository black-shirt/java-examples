package unlisted_experiments;

public class overriding {
    public static void main(String[] args) {
        //compile-time polymorphism
        int sum1 = add(2, 3);
        double sum2 = add(3.14, 2.71);
        System.out.println("Sum1 = " + sum1);
        System.out.println("Sum2 = " + sum2);
        //runtime polymorphism
        Shape shape1 = new Shape();
        Shape shape2 = new Circle();
        shape1.draw();
        shape2.draw();
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static class Shape {
        public void draw() {
            System.out.println("Drawing a shape.");
        }
    }

    public static class Circle extends Shape {
        public void draw() {
            System.out.println("Drawing a circle.");
        }
    }
}