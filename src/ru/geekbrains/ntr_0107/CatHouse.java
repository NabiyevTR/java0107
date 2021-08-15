package ru.geekbrains.ntr_0107;

import java.util.ArrayList;

public class CatHouse {

    public CatHouse() {

        Plate plate = new Plate(50);
        // put additional food
        plate.putFood(15);

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Барсик", true, 10));
        cats.add(new Cat("Чужой", true, 60));
        cats.add(new Cat("Веня", true, 15));
        cats.add(new Cat("Тайсон", true, 17));
        cats.add(new Cat("Мурка", false, 50));

        System.out.println("В доме живут:");
        for (Cat cat : cats) {
            System.out.println(cat.catInfo());
        }
        System.out.println("\nПокормим котов и кошек.");
        System.out.printf("В миске %d единиц корма.\n\n", plate.getFood());

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat.eatInfo());
            System.out.println(cat.fedInfo());
        }
    }
}
