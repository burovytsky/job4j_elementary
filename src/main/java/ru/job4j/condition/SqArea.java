package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double height = (double) p / (2 * (k + 1));
        double width = height * k;
        double rsl = width * height;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        double result2 = SqArea.square(20, 5);
        double result3 = SqArea.square(10, 8);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
        System.out.println(" p = 20, k = 5, s = " + result2);
        System.out.println(" p = 25, k = 8, s = " + result3);
    }
}
