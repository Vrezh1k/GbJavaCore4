package Lesson1;

public class Wall implements Overcomable {

    private int heigth;

    public Wall(int heigth) {
        this.heigth = heigth;
    }

    public void overcome(Competitable competitable) {
        competitable.jump(heigth);
    }
}
