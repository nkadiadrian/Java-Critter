public class Sleeper extends Critter {
    public Sleeper() {
        super("Sleeper");
        this.TIRED_THRESHOLD = 3;
    }

    public Sleeper(String name) {
        this();
        if (!name.isBlank()) {
            this.name = "Sleeper " + name;
        }
    }
}
