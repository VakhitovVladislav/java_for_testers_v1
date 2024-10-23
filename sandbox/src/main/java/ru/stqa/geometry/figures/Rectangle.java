package ru.stqa.geometry.figures;

public class Rectangle {
    public static void printRectangleArea(double side, double side1) {
        var text  = String.format("Площадь прямоугольника со сторонами %f и %f = %f ", side,side1,RectangleArea(side, side1));
        System.out.println(text);
    }

    private static double RectangleArea(double side, double side1) {
        return side * side1;
    }
}
