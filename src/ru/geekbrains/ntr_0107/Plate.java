package ru.geekbrains.ntr_0107;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decFood(int decFood) {
        if (decFood > food) return false;
        food -= decFood;
        return true;
    }

    public void putFood(int incFood) {
        food += incFood;
    }

    public int getFood() {
        return food;
    }
}
