package Lesson1;

import java.util.Objects;

public abstract class Animal {
    private String name;
    private String color;
    private int age;
    private int jumpHeight;
    private int runLength;
    private int swimDistance;

    public Animal(String name, String color, int age, int jumpHeight, int runLength, int swimDistance) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.jumpHeight = jumpHeight;
        this.runLength = runLength;
        this.swimDistance = swimDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) this.age = age;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(int jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    public int getRunLength() {
        return runLength;
    }

    public void setRunLength(int runLength) {
        this.runLength = runLength;
    }

    public int getSwimDistance() {
        return swimDistance;
    }

    public void setSwimDistance(int swimDistance) {
        this.swimDistance = swimDistance;
    }
}
