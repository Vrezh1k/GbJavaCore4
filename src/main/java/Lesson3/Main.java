package Lesson3;

import java.util.Arrays;

/**
 * Java.Homework3
 *
 * @author Vrezh Sargsyan
 * @version 31.1.2022
 */

public class Main {


    public static void main(String[] args) {
        taskOne();
        taskTwo();
    }

        public static void taskOne() {

        String[] sarr = {"one", "two", "three", "four", "five"};
        Integer[] iarr = {1, 2, 3, 4, 5};

        System.out.println("Массив до перестановки: " + Arrays.toString(iarr));
        swapTwoElements(iarr, 1, 2);
        System.out.println("Массив после перестановки: " + Arrays.toString(iarr));

        System.out.println("Массив до перестановки: " + Arrays.toString(sarr));
        swapTwoElements(sarr, 0, 2);
        System.out.println("Массив после перестановки: " + Arrays.toString(sarr));
    }


    private static <T> void swapTwoElements(T[] array, int FirstNumPos, int SecondNumPos) {
        T temp = array[FirstNumPos];
        array[FirstNumPos] = array[SecondNumPos];
        array[SecondNumPos] = temp;
    }

        public static void taskTwo() {

        Orange orange = new Orange();
        Apple apple = new Apple();
        Box<Orange> orangeBox1 = new Box();
        Box<Orange> orangeBox2 = new Box();
        Box<Apple> appleBox = new Box();
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());

        for (int i = 0; i < 4; i++) {
            orangeBox2.add(new Orange());
        }
        for (int i = 0; i < 6; i++) {
            appleBox.add(new Apple());
        }


        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();

        Float orange1Weigth = orangeBox1.getWeight();
        Float orange2Weigth = orangeBox2.getWeight();
        Float appleWeigth = appleBox.getWeight();
        System.out.println("Вес коробки 1 с апельсинами: " + orange1Weigth);
        System.out.println("Вес коробки 2 с апельсинами: " + orange2Weigth);
        System.out.println("Вес коробки с яблоками: " + appleWeigth);

        System.out.println("Сравнить вес orangeBox1 и appleBox: " + orangeBox1.compare(appleBox));
        System.out.println("Сравнить вес orangeBox2 и appleBox: " + orangeBox2.compare(appleBox));

        orangeBox1.moveAt(orangeBox2);


        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();
    }
}