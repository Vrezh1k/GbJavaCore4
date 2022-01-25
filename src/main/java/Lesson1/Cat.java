package Lesson1;

public class Cat extends Animal implements Competitable {

    public Cat(String name, String color, int age, int jumpHeight, int runLength, int swimDistance) {
        super(name, color, age, jumpHeight, runLength, swimDistance);
    }

    @Override
    public double swim(int length) {
        if (length > getSwimDistance()) {
            System.out.println("Cat" + " name= " + getName() + ", color= " + getColor() + ", age= " + getAge() + " не смогла проплыть");
        } else {
            System.out.println("Cat" + " name= " + getName() + ", color= " + getColor() + ", age= " + getAge() + " смогла проплыть!");
        }
        return 0;
    }

    @Override
    public double jump(int heigth) {
        if (heigth > getJumpHeight()) {
            System.out.println("Cat" + " name= " + getName() + ", color= " + getColor() + ", age= " + getAge() + " не смогла перепрыгнуть");
        } else {
            System.out.println("Cat" + " name= " + getName() + ", color= " + getColor() + ", age= " + getAge() + " смогла перепрыгнуть!");
        }
        return 0;
    }

    @Override
    public double run(int length) {
        if (length > getRunLength()) {
            System.out.println("Cat" + " name= " + getName() + ", color= " + getColor() + ", age= " + getAge() + " не смогла пробежать");
        } else {
            System.out.println("Cat" + " name= " + getName() + ", color= " + getColor() + ", age= " + getAge() + " смогла пробежать!");
        }
        return 0;
    }
}
