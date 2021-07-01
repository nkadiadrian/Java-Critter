package food;

import critter.Critter;

public class Banana implements Food {
    @Override
    public void applyFood(Critter critter) {
        critter.incrementFoodLevel(3);
        critter.incrementTiredness(1);
    }
}
