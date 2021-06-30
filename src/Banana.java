public class Banana implements Food {
    @Override
    public void applyFood(Critter critter) {
        critter.foodLevel += 3;
        critter.tiredness += 1;
    }
}
