package Lesson1;

public class Wolf extends Animal implements Competitable {

    public Wolf(String name, String color, int age, int jumpHeight, int runLength,  int swimDistance) {
        super(name, color, age, jumpHeight, runLength, swimDistance);
    }

    @Override
    public double swim(int length) {
        if (length > getSwimDistance()) {
            System.out.println("Wolf" + " name= " + getName() + ", color= " + getColor() + ", age= " + getAge() + " не смог проплыть");
        } else {
            System.out.println("Wolf" + " name= " + getName() + ", color= " + getColor() + ", age= " + getAge() + " смог проплыть!");
        }
        return 0;
    }

    @Override
    public double jump(int heigth) {
        if (heigth > getJumpHeight()) {
            System.out.println("Wolf" + " name= " + getName() + ", color= " + getColor() + ", age= " + getAge() + " не смог перепрыгнуть");
        } else {
            System.out.println("Wolf" + " name= " + getName() + ", color= " + getColor() + ", age= " + getAge() + " смог перепрыгнуть!");
        }
        return 0;
    }

    @Override
    public double run(int length) {
        if (length > getRunLength()) {
            System.out.println("Wolf" + " name= " + getName() + ", color= " + getColor() + ", age= " + getAge() + " не смог пробежать");
        } else {
            System.out.println("Wolf" + " name= " + getName() + ", color= " + getColor() + ", age= " + getAge() + " смог пробежать!");
        }
        return 0;
    }
}
