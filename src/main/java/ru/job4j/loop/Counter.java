package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(5, 4));
        System.out.println(sum(-4, 2));
        System.out.println(sum(0, 56));
        System.out.println("Sum by even");
        System.out.println((sumByEven(1, 10)));
        System.out.println((sumByEven(-10, 20)));
    }
}