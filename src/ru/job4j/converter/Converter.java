package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; // формула перевода рублей в доллоры.
        return rsl;
    }

    public static void main(String[] args) {
        int in = 2800;
        int expectedEur = 40;
        int expectedDol = 46;
        int out1 = rubleToEuro(in);
        int out2 = rubleToDollar(in);
        boolean passed1 = expectedEur == out1;
        boolean passed2 = expectedDol == out2;
        System.out.println("2800 rub are 40 eur. Test result : "+ passed1);
        System.out.println("2800 rub are 46,66 dollars. Test result : "+ passed2);
    }
}
