package src.main.java.com.example;

import java.util.ArrayList;
import java.util.List;

public class Squares {
    private List<Square> list;

    public Squares() {
        this.list = new ArrayList<>();
    }

    public void add(double side) {
        list.add(new Square(side));
    }

    public double getTotalArea() {
        double total = 0;
        for (Square square : list) {
            total += square.getArea();
        }
        return total;
    }

    public List<Square> getAll() {
        return list;
    }

    public int getCount() {
        return list.size();
    }
}