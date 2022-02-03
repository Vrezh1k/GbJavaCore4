package Lessons.c;

import java.util.Arrays;

public class GenArray<T> {

    public T[] array;

    @SafeVarargs
    public GenArray(T... array) {

        this.array = array;
    }

    @Override
    public String toString() {
        return "GenArray{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }


    public static void main(String[] args) {
        GenArray<Integer> integerGenArray1 = new GenArray<>(1, 2, 3, 4, 5, 6);

        GenArray<String> stringGenArray = new GenArray<>("one", "dva", "no", "tres", "wow");


            System.out.println("Массив до перестановки: " + integerGenArray1);
            System.out.println("Массив до перестановки: " + stringGenArray);
            swapTwoElementsInArray(new GenArray[]{integerGenArray1}, 1, 3);
            swapTwoElementsInArray(new GenArray[]{stringGenArray}, 0, 2);
            System.out.println("Массив после перестановки: " +Arrays.toString(new GenArray[]{integerGenArray1}));
            System.out.println("Массив после перестановки: " +Arrays.toString(new GenArray[]{stringGenArray}));

    }

    private static <S> void swapTwoElementsInArray(S[] array, int firstNumPos, int secondNumPos) {

        S temp = array[firstNumPos];
        array[firstNumPos] = array[secondNumPos];
        array[secondNumPos] = temp;
    }
}