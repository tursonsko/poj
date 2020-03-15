/*
* This is rectangle class - it calculates area, circuit and diagonal of rectangle
* Author: Wojtek
* */

public class Rectangle {

    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    //formula for rectangle's area
    public double areaRectangle() {
        return this.height * this.width;
    }

    //formula for circuit
    public double circuitRectangle() {
        return (2 * this.height + 2 * this.width);
    }

    //formula for diaqgonal
    public double diagonalRectangle() {
        return Math.sqrt(Math.pow(this.height, 2) + Math.pow(this.width, 2));
    }


    public static void main(String[] args) {

        Rectangle sample = new Rectangle(17, 34);
        double area = sample.areaRectangle();
        double circ = sample.circuitRectangle();
        double diag = sample.diagonalRectangle();
        System.out.println(area + " " + circ + " " + diag);

    }

}
