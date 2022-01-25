package Lesson1;

public class Pool implements Overcomable {

    private int length;

    public Pool(int length) {
        this.length = length;
    }

    public void overcome(Competitable competitable) {
        competitable.swim(length);
    }
}







