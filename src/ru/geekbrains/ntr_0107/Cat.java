package ru.geekbrains.ntr_0107;

public class Cat {
    private String name;
    private boolean wellFed;
    private boolean sex;
    private int gluttony;


    public Cat(String name, boolean sex, int gluttony) {
        this.name = name;
        this.sex = sex;
        this.gluttony = gluttony;
    }

    public boolean eat(Plate plate) {
        wellFed = plate.decFood(gluttony);
        return wellFed;
    }

    public String fedInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this);
        if (sex) {
            if (wellFed) {
                stringBuilder.append(" сыт.");
            } else {
                stringBuilder.append(" голоден.");
            }
        } else {
            if (wellFed) {
                stringBuilder.append(" сыта.");
            } else {
                stringBuilder.append(" голодна.");
            }
        }
        return stringBuilder.toString();
    }

    public String catInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this).append(String.format(" ест %d единиц корма.", gluttony));
        return stringBuilder.toString();
    }

    public String eatInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this);
        if (wellFed) {
            if (sex) {
                stringBuilder.append(" съел ");
            } else {
                stringBuilder.append(" съела ");
            }
            stringBuilder.append(gluttony).append(" единиц корма.");
        } else {
            if (sex) {
                stringBuilder.append(" не смог поесть.");
            } else {
                stringBuilder.append(" не смогла поесть.");
            }
        }
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (sex) {
            stringBuilder.append("Кот ");
        } else {
            stringBuilder.append("Кошка ");
        }
        stringBuilder.append(name);
        return stringBuilder.toString();
    }
}
