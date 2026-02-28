public class Square extends Rectangle {

    // No-arg constructor
    public Square() {
        super(1.0, 1.0);
    }

    // Constructor dengan side
    public Square(double side) {
        super(side, side);   // width = side, length = side
    }

    // Constructor lengkap
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    // Getter khusus side
    public double getSide() {
        return getWidth();   // karena width = length
    }

    // Setter side
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    // Override setWidth
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    // Override setLength
    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    // Override toString
    @Override
    public String toString() {
        return "A Square with side=" + getWidth() +
               ", which is a subclass of " + super.toString();
    }
}