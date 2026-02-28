public class Rectangle extends shape {

    private double width;
    private double length;

    // No-arg constructor
    public Rectangle() {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

    // Constructor width & length
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    // Constructor lengkap
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // Getter & Setter width
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Getter & Setter length
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // Luas persegi panjang
    public double getArea() {
        return width * length;
    }

    // Keliling persegi panjang
    public double getPerimeter() {
        return 2 * (width + length);
    }

    // Override toString
    @Override
    public String toString() {
        return "A Rectangle with width=" + width +
               " and length=" + length +
               ", which is a subclass of " + super.toString();
    }
} 
    

