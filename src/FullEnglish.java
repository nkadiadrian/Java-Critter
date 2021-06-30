public class FullEnglish implements Food {
    @Override
    public void applyFood(Critter critter) {
        critter.foodLevel += 5;
        critter.tiredness += 3;
    }
}
