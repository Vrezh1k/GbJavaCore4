package Lesson2;

public class MyArrayDataException extends CheckedException {

    MyArrayDataException (int y, int x) {
        super(String.format("Неверные данные в ячейке [%d, %d]\n", y, x));
    }
}
