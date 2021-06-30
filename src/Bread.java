public class Bread implements Food {
    @Override
    public void applyFood(Critter critter) {
        critter.breadStock -= 2;
        critter.foodLevel += 3;
    }
}
