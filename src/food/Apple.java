package food;

import CritterTypes.Critter;

public class Apple implements Food {
    @Override
    public void applyFood(Critter critter) {
        critter.incrementFoodLevel(1);
        critter.incrementTiredness(1);
    }
}
