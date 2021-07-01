package food;

import critter.Critter;

public class Bread implements Food {
    @Override
    public void applyFood(Critter critter) {
        critter.incrementBreadStock(-2);
        critter.incrementFoodLevel(3);
    }
}
