package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static int max(int first, int second, int third) {
        int firstOrSecond = max(first, second);
        return firstOrSecond > third ? firstOrSecond : third;
    }

    public static int max(int first, int second, int third, int fourth) {
        int maxOfThree = max(first, second, third);
        return maxOfThree > fourth ? maxOfThree : fourth;
    }
}
