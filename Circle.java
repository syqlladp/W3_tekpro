public class Circle extends shape {

    private double radius;

    // No-arg constructor
    public Circle() {
        super();          // panggil constructor Shape()
        this.radius = 1.0;
    }

    // Constructor dengan radius
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    // Constructor lengkap
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    // Getter
    public double getRadius() {
        return radius;
    }

    // Setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Luas lingkaran
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Keliling lingkaran
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Override toString
    @Override
    public String toString() {
        return "A Circle with radius=" + radius +
               ", which is a subclass of " + super.toString();
    }
}