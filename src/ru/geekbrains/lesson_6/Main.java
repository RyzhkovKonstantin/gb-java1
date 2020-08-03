package ru.geekbrains.lesson_6;

public class Main {
    //,
    public static void main(String[] args) {

        Cat cat = new Cat("Shal", 200, 2);
        cat.grp(200, 1, 11);

        Dog dog = new Dog("Boss.", 500, 0.5, 10);
        dog.grp(510, 1.9, 15);
    }
}
