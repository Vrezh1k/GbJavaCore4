package Lesson1;

public class Main {
    public static void main(String[] args) {
        Competitable[] competitors = {
                new Cat("Rosa", "red", 3, 1, 50, 5),
                new Wolf("Bari", "grey", 3, 5, 300, 30),
                new Turtle("Uri", "Green", 67, 0, 2, 100)
        };

        Overcomable[] overcomables = {new Wall(3), new Track(30), new Pool(10)};

        for (Competitable competitable : competitors) {
            for (Overcomable overcomable : overcomables) {
                overcomable.overcome(competitable);
            }
        }
    }
}
