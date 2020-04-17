package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int maxFirstAndSecond = first > second ? first : second;
        int maxNumber = maxFirstAndSecond > third ? maxFirstAndSecond : third;
        return maxNumber;
    }
}
