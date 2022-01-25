package Lesson2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[][] correctMatrix = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"8", "7", "6", "5"},
                {"4", "3", "2", "1"}
        };
        String[][] wrongSizeMatrix = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"8", "7", "6", "5"},
                {"4", "3"}
        };
        String[][] wrongCharMatrix = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"8", "7", "6", "5"},
                {"4", "3", "X", "1"}
        };

        try {
            System.out.println("Вариант 1:");
            System.out.println("Сумма всех элементов массива равна " + Converter.strConverter(correctMatrix) + ".\n");
        } catch (CheckedException e) {
            e.getMessage();
        }

        try {
            System.out.println("Вариант 2:");
            System.out.println("Сумма всех элементов массива равна " + Converter.strConverter(wrongSizeMatrix) + ".\n");
        } catch (CheckedException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Вариант 3:");
            System.out.println("Сумма всех элементов массива равна " + Converter.strConverter(wrongCharMatrix) + ".\n");
        } catch (CheckedException e) {
            System.out.println(e.getMessage());
        }
    }
}
