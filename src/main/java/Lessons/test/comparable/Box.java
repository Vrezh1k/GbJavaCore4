package Lessons.test.comparable;

import java.util.Arrays;

public class Box implements Comparable {

    private int size;

    public Box(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Box{" +
                "size=" + size +
                '}';
    }

    public static void main(String[] args) {
        Box box1 = new Box(50);
        Box box2 = new Box(10);

        System.out.println(box1.compareTo(box2));

        Box[] boxes = {new Box(4), new Box(10), new Box(2)};

        Arrays.sort(boxes);
        System.out.println(Arrays.toString(boxes));

    }

    @Override
    public int compareTo(Object o) {
        return - ((Box)o).getSize() + getSize();
    }
}
