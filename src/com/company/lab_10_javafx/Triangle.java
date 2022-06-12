package com.company.lab_10_javafx;


public class Triangle {

    protected int x1;
    protected int x2;
    protected int x3;
    protected int y1;
    protected int y2;
    protected int y3;
    protected double sideA;
    protected double sideB;
    protected double sideC;
    protected double angleA;
    protected double angleB;
    protected double angleC;
    protected double perimeter;
    protected double square;

    public Triangle(int x1, int x2, int x3, int y1, int y2, int y3) {
        this.setX1(x1);
        this.setX2(x2);
        this.setX3(x3);
        this.setY1(y1);
        this.setY2(y2);
        this.setY3(y3);

        this.setSideA(sideA);
        this.setSideB(sideB);
        this.setSideC(sideC);
        this.setAngleA(angleA);
        this.setAngleB(angleB);
        this.setAngleC(angleB);

        this.setPerimeter(perimeter);
        this.setSquare(square);

    }

    public static double getSideLength(int x1, int y1, int x2, int y2) {

        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static boolean isTriangleExists(int x1, int y1, int x2, int y2, int x3, int y3) {

        double sideA = getSideLength(x1, y1, x2, y2);
        double sideB = getSideLength(x3, y3, x2, y2);
        double sideC = getSideLength(x1, y1, x3, y3);

        return (sideA + sideB > sideC) && (sideB + sideC > sideA) && (sideA + sideC > sideB);

    }

    public double getAngleA() {
        return angleA;
    }

    public void setAngleA(double angleA) {
        this.angleA = getAngle_1();
    }

    public double getAngleB() {
        return angleB;
    }

    public void setAngleB(double angleB) {
        this.angleB = getAngle_2();
    }

    public double getAngleC() {
        return angleC;
    }

    public void setAngleC(double angleC) {
        this.angleC = getAngle_3();
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = getLengthA();
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = getLengthB();
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = getLengthC();
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getX3() {
        return x3;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getY3() {
        return y3;
    }

    public void setY3(int y3) {
        this.y3 = y3;
    }

    public double getLengthA() {

        return Math.sqrt(Math.pow((getX2() - getX1()), 2) + Math.pow((getY2() - getY1()), 2));
    }

    public double getLengthB() {

        return Math.sqrt(Math.pow((getX3() - getX2()), 2) + Math.pow((getY3() - getY2()), 2));
    }

    public double getLengthC() {

        return Math.sqrt(Math.pow((getX1() - getX3()), 2) + Math.pow((getY1() - getY3()), 2));
    }

    public double getAngle_1() {
        return Math.acos((Math.pow(getLengthA(), 2) + Math.pow(getLengthB(), 2) - Math.pow(getLengthC(), 2)) / (2 * getLengthA() * getLengthB())) * 57.2957795;
    }

    public double getAngle_2() {
        return Math.acos((Math.pow(getLengthB(), 2) + Math.pow(getLengthC(), 2) - Math.pow(getLengthA(), 2)) / (2 * getLengthB() * getLengthC())) * 57.2957795;
    }

    public double getAngle_3() {
        return Math.acos((Math.pow(getLengthA(), 2) + Math.pow(getLengthC(), 2) - Math.pow(getLengthB(), 2)) / (2 * getLengthA() * getLengthC())) * 57.2957795;
    }

    public double getPerimeter() {

        return getLengthA() + getLengthB() + getLengthC();
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = getPerimeter();
    }

    public double getSquare() {

        double perimeter = getPerimeter() / 2;
        return Math.sqrt(perimeter * (perimeter - getLengthA()) * (getLengthB()) * (perimeter - getLengthC()));
    }

    public void setSquare(double square) {
        this.square = getSquare();
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "x1=" + x1 +
                ", x2=" + x2 +
                ", x3=" + x3 +
                ", y1=" + y1 +
                ", y2=" + y2 +
                ", y3=" + y3 +
                "; Side A=" + String.format("%.3f", getLengthA()) +
                "; Side B=" + String.format("%.3f", getLengthB()) +
                "; Side C=" + String.format("%.3f", getLengthC()) +
                "; Perimeter" + String.format("%.3f", getPerimeter()) +
                "; Square=" + String.format("%.3f", getSquare()) +
                "; First angle=" + String.format("%.3f", getAngle_1()) +
                "; Second angle=" + String.format("%.3f", getAngle_2()) +
                "; Third angle=" + String.format("%.3f", getAngle_3()) +
                '}';
    }
}
