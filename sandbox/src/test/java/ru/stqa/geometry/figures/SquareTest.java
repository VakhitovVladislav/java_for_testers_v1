package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.stqa.geometry.Square;


public class SquareTest {
    @Test
    void canCalculateArea(){
        var s = new Square(5.0);
        Assertions.assertEquals(s.area(5.0), 25.0);
    }
    @Test
    void canCalculatePerimeter(){
        var s = new Square(5.0);
        Assertions.assertEquals(20, s.perimeter(5.0));
    }
}
