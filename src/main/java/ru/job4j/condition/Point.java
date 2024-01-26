package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
       int resultX = x2 - x1;
       int resultY = y2 - y1;
       double resultX2 = Math.pow(resultX, 2);
       double resultY2 = Math.pow(resultY, 2);
       double sum = resultX2 + resultY2;
       double sqrt = Math.sqrt(sum);
       return sqrt;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
