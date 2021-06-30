public class Hustler extends Critter {
    public Hustler() {
        super("Hustler");
    }

    public Hustler(String name) {
        this();
        if (!name.isBlank()) {
            this.name = "Hustler " + name;
        }
    }

    @Override
    public void sleep() {
        System.out.println(name + " sleeps.");
        tiredness = 0;
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(500);
                System.out.print(".");
            } catch (InterruptedException e) {
                System.out.println("Could not sleep due to interruption\n" + e.getMessage());
            }
        }

        System.out.println("\nBut a hustler never gets tired!");
    }
}
