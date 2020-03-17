package ru.job4j.array;

public class BarleyBreak {
    public static void main(String[] args) {
        int[][] data = new int[3][3];
        int count = 1;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = count;
                count++;
            }
        }
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j]);
            }
            System.out.println();
        }
    }
}
