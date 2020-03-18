package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double firstDegree = Math.pow((x2 - x1), 2);
        double secondDegree = Math.pow((y2 - y1), 2);
        double rsl = Math.sqrt(firstDegree + secondDegree);
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result1);
        double result2 = Point.distance(5, 4, 8, 2);
        System.out.println("result (5, 8) to (4, 2) " + result2);
    }
}
