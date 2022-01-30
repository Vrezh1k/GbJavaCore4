package Lesson3;

import java.util.Arrays;

public class GenArray<T> {

    public T[] array;

    public GenArray(T... array) {

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
        return "GenArray{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    public static void main(String[] args) {
        GenArray<Integer> integerGenArray1 = new GenArray(1, 2, 3, 4, 5, 6);

        System.out.println (String.valueOf (integerGenArray1));

        GenArray<String> stringGenArray = new GenArray("one", "dva", "no", "tres", "wow");


        try {
            swapTwoElementsInArray(new GenArray[]{integerGenArray1}, 2, 3);
        } catch (WrongPositionException e) {
            e.printStackTrace();
        }
            try {
                swapTwoElementsInArray(new GenArray[]{stringGenArray}, 1, 2);
            } catch (WrongPositionException e) {
                e.printStackTrace();
        }

        System.out.println("Матрица после перестановки: " +  String.valueOf(integerGenArray1));
        System.out.println("Матрица после перестановки: " + String.valueOf(stringGenArray));
    }

    private static void swapTwoElementsInArray(
            Object[] array,
            int firstNumPos,
            int secondNumPos
    ) throws WrongPositionException {
        if (firstNumPos < 0 || firstNumPos > array.length ||
                secondNumPos < 0 || secondNumPos > array.length || firstNumPos == secondNumPos) {
            throw new WrongPositionException("Неправильно указаны позиции элементов для замены");
        }
        Object temp = array[firstNumPos];
        array[firstNumPos] = array[secondNumPos];
        array[secondNumPos] = temp;
    }

}