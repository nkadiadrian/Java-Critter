public class Glutton extends Critter {
    public Glutton() {
        super("Glutton");
    }

    public Glutton(String name) {
        this();
        if (!name.isBlank()) {
            this.name = "Glutton " + name;
        }
    }

    @Override
    public void feed() {
        foodLevel += 2;
        super.feed();
    }
}
