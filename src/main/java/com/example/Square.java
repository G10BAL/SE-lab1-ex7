package src.main.java.com.example;

public class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public String toString() {
        return "Square(" + side + ")";
    }
}