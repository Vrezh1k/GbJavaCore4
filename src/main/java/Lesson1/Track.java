package Lesson1;

public class Track implements Overcomable {

    private int length;

    public Track(int length) {
        this.length = length;
    }

    public void overcome(Competitable competitable) {
        competitable.run(length);
    }
}
