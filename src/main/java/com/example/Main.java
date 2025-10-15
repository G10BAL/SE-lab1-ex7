package src.main.java.com.example;

public class Main {

    public static void main(String[] args) {
        Squares squares = new Squares();

        squares.add(5);
        squares.add(10);
        squares.add(3);

        System.out.println("Squares:");
        for (Square s : squares.getAll()) {
            System.out.println("  " + s + " -> Area: " + s.getArea());
        }

        System.out.println("\nTotal squares: " + squares.getCount());
        System.out.println("Total area: " + squares.getTotalArea());
    }
}