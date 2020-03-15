/*
* This is triangle class  with methods calculating: circuit, area(using Heron's formula)
* and checking if tra=iangle is equilateral, scalene or isosceles
* Author: Wojtek
*/


public class Triangle {

    private double triangleLeftArm;
    private double triangleRightArm;
    private double triangleBase;

    public Triangle (double triangleLeftArm, double triangleRightArm, double triangleBase) {
        this.triangleLeftArm = triangleLeftArm;
        this.triangleRightArm = triangleRightArm;
        this.triangleBase = triangleBase;
    }

    public double circuitTriangle () {
        return this.triangleLeftArm + this.triangleRightArm + this. triangleBase;
    }

    public double halfOfCircuitTriangle(double circuitTriangle) {
        double halfCircuit = circuitTriangle / 2;
        return halfCircuit;
    }

    public double areaTriangle(double halfOfCircuitTriangle) {

        return Math.sqrt(halfOfCircuitTriangle * (halfOfCircuitTriangle - this.triangleLeftArm) *
                (halfOfCircuitTriangle - this.triangleRightArm) *
                (halfOfCircuitTriangle - this.triangleBase));

    }

    public boolean isEquilateral() {
        return this.triangleLeftArm == this.triangleRightArm && this.triangleLeftArm == this.triangleBase;
    }

    public boolean isIsosceles() {
        return this.triangleLeftArm == this.triangleRightArm || this.triangleLeftArm == this.triangleBase || this.triangleRightArm == this.triangleBase;
    }

    public boolean isScalene() {
        return this.triangleLeftArm != this.triangleRightArm && this.triangleLeftArm != this.triangleBase && this.triangleRightArm != this.triangleBase;
    }

    public static void main(String[] args) {

        Triangle tr = new Triangle(13,12,13);
        System.out.println(tr.circuitTriangle());
        System.out.println(tr.halfOfCircuitTriangle(tr.circuitTriangle()));
        System.out.println(tr.areaTriangle(tr.halfOfCircuitTriangle(tr.circuitTriangle())));
        System.out.println(tr.isEquilateral());
        System.out.println(tr.isIsosceles());
        System.out.println(tr.isScalene());

    }

}
