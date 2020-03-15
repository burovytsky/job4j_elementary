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

        /**
         * number One for calculations
         */
        int one = 1;

        /**
         * number Two for calculations
         */
        int two = 2;

        /**
         *
         * calculating the sum of two numbers
         */
        int onePlusTwo = one + two;
        System.out.println(onePlusTwo);
        /**
         * number Four for calculations
         */
        int four = 4;
        /**
         * number Five for calculations
         */
        int five = 5;
        /**
         * number Six for calculations
         */
        int six = 6;
        /**
         *
         * division of two numbers
         */
        int sixDivTwo = six / two;
        /**
         *
         * subtraction of two numbers
         */
        int fiveMinusTwo = five - two;
        /**
         *
         * multiplication of two numbers
         */
        int fourTimeTwo = four * two;

        System.out.println("SixDivTwo = " + sixDivTwo);
        System.out.println("fiveMinusTwo = " + fiveMinusTwo);
        System.out.println("fourTimeTwo = " + fourTimeTwo);

    }
}
