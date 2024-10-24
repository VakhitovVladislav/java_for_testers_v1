package ru.stqa.geometry;

public class Square {
    double side;

    public Square(double side) {
        this.side = side;
    }

    public static void printSquareArea(double side){
        String text = String.format(
                "Площадь квадрата со стороной %f = %f ", side, area(side));
        System.out.println(text);
    }

    public static double area(double side) {
        return side * side;
    }


    public  double perimeter(double v) {
        return 4 *v;
    }
}
