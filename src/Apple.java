public class Apple implements Food {
    @Override
    public void applyFood(Critter critter) {
        critter.foodLevel ++;
        critter.tiredness ++;
    }
}
