/**
 * Square class implementation (Exercise 23)
 * Author Wojtek Turek
 */

public class Square extends Rectangle {

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, double side, boolean filled) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return super.getLength();
    }

    public void setSide(double side) {
        this.setWidth(side);
        this.setLength(side);
    }

    public void setWidth(double side) {
        super.setWidth(side);

    }

    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "\"Square[Rectangle[Shape[color=" +
                getColor() + "], filled=" +
                isFilled() + ", width=" +
                getWidth() + ", length=" +
                getLength() + "]]\"";
    }
}
