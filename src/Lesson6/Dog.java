package Lesson6;

public class Dog extends Animal {
    public static int countDog = 0;

    Dog(String name, float maxRun, float maxSwim) {
        super("Пес", name, maxRun, maxSwim);
        ++countDog;
    }
}
