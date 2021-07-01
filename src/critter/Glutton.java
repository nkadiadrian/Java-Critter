package critter;

import food.Food;

public class Glutton extends Critter {
    public Glutton() {
        super("critter.Glutton");
    }

    public Glutton(String name) {
        this();
        if (!name.isBlank()) {
            this.name = "critter.Glutton " + name;
        }
    }

    @Override
    public void feed(Food food) {
        foodLevel += 2;
        super.feed(food);
    }
}
