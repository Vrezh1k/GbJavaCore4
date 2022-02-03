package Lessons.test;

import java.util.Arrays;

public class NumbersBox <T extends Number> {

    private T[] array;

    public NumbersBox(T... array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "NumbersBox{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    public boolean isSameAvg(NumbersBox<?> boxToCompare) {

        return Math.abs(calcAverage() -+boxToCompare.calcAverage()) < 0.001 ;
    }

    public static <U extends Number> U getFirstElement(NumbersBox<U> numbersBox) {
        return numbersBox.getArray()[0];
    }

    public double calcAverage() {
        double sum = 0.0;

        for (T num : array) {

            sum = sum + num.doubleValue();
        }

        return sum / array.length;
    }

    public static void main(String[] args) {
        NumbersBox<Integer> integerNumbersBox1 = new NumbersBox<>(1,3,4,5,6,3);
        System.out.println(integerNumbersBox1.calcAverage());

        NumbersBox<Integer> integerNumbersBox2 = new NumbersBox<>(1,3,4,5,6,3);
        System.out.println(integerNumbersBox1.isSameAvg(integerNumbersBox2));

        NumbersBox<Double> doubleNumbersBox1 = new NumbersBox(1,9,8,5);

        System.out.println(integerNumbersBox1.isSameAvg(doubleNumbersBox1));

        System.out.println(getFirstElement(doubleNumbersBox1));
    }
}
