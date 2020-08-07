package ru.geekbrains.lesson_7;

public class Plate {
    private int food;
    int getFood() {
        return food;
    }

    public Plate (int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        food -= n;
    }
    public void increaseFood () {
        this.food += 400;
        System.out.println("Добавили 400 грамм корма");
    }
    boolean checkFood (int n){
        return (food - n) >= 0;
    }
}
