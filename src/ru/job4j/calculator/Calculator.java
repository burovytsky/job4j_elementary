package ru.job4j.calculator;

/**
 * Calculate Класс для вычисления арифметических операций
 *
 * @author Constantine Burovytsky (burovytsky@gmail.com)
 */
public class Calculator {
    /**
     * Main
     * @param args - arguments
     */
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int onePlusTwo = one + two;
        System.out.println(onePlusTwo);
        int four = 4;
        int five = 5;
        int six = 6;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;
        System.out.println("SixDivTwo = " + sixDivTwo);
        System.out.println("fiveMinusTwo = " + fiveMinusTwo);
        System.out.println("fourTimeTwo = " + fourTimeTwo);

    }
}
