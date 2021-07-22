package CritterTypes;

public class Sleeper extends Critter {
    public Sleeper() {
        super("critter.Sleeper");
        this.TIRED_THRESHOLD = 3;
    }

    public Sleeper(String name) {
        this();
        if (!name.isBlank()) {
            this.name = "critter.Sleeper " + name;
        }
    }
}
