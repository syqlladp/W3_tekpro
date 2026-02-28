public class TestShape {

    public static void main(String[] args) {

        System.out.println("=== TEST SHAPE ===");
        shape s1 = new shape();
        shape s2 = new shape("blue", false);
        System.out.println(s1);
        System.out.println(s2);

        System.out.println("\n=== TEST CIRCLE ===");
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.0, "red", true);
        System.out.println(c1);
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());

        System.out.println();

        System.out.println(c2);
        System.out.println("Area: " + c2.getArea());
        System.out.println("Perimeter: " + c2.getPerimeter());

        System.out.println("\n=== TEST RECTANGLE ===");
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(4.0, 6.0, "green", true);
        System.out.println(r1);
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());

        System.out.println();

        System.out.println(r2);
        System.out.println("Area: " + r2.getArea());
        System.out.println("Perimeter: " + r2.getPerimeter());

        System.out.println("\n=== TEST SQUARE ===");
        Square sq1 = new Square();
        Square sq2 = new Square(5.0, "yellow", false);

        System.out.println(sq1);
        System.out.println("Area: " + sq1.getArea());
        System.out.println("Perimeter: " + sq1.getPerimeter());

        System.out.println();

        System.out.println(sq2);
        System.out.println("Area: " + sq2.getArea());
        System.out.println("Perimeter: " + sq2.getPerimeter());

        // Test override setWidth & setLength
        System.out.println("\n=== TEST SETTER SQUARE ===");
        sq2.setWidth(10);
        System.out.println("After setWidth(10): " + sq2);

        sq2.setLength(7);
        System.out.println("After setLength(7): " + sq2);
    }
}