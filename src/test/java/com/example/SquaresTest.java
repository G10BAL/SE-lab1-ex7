package src.test.java.com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SquaresTest {

    @Test
    void testSquareArea() {
        Square s = new Square(5);
        assertEquals(25, s.getArea());
    }

    @Test
    void testTotalArea() {
        Squares squares = new Squares();
        squares.add(2);
        squares.add(3);
        // 4 + 9 = 13
        assertEquals(13, squares.getTotalArea());
    }

    @Test
    void testCount() {
        Squares squares = new Squares();
        squares.add(5);
        squares.add(10);
        assertEquals(2, squares.getCount());
    }
}