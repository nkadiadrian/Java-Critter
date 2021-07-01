package food;

import critter.Critter;

public class FullEnglish implements Food {
    @Override
    public void applyFood(Critter critter) {
        critter.incrementFoodLevel(5);
        critter.incrementTiredness(3);
    }
}
