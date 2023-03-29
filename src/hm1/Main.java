package hm1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Прохор"));
        animals.add((new Dog("Веня")));
        animals.add(new Carp("Карп"));
        animals.add(new Eagl("eagle"));

        for (Animal a: animals) a.toGo();

        for (Animal a: animals) a.fly();

        for (Animal a: animals) a.swim();

    }
}