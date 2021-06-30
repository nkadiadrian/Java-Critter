public class Critter {
    protected int TIRED_THRESHOLD = 5;

    private boolean isAlive;
    private boolean isVictorious;
    protected int foodLevel;
    protected int tiredness;
    protected int breadStock;
    protected String name;

    public Critter() {
        isAlive = true;
        isVictorious = false;
        foodLevel = 5;
        tiredness = 0;
        breadStock = 0;
        this.name = "Critter";
    }
    public Critter(String name) {
        this();
        if (!name.isBlank()) {
            this.name = name;
        }
    }

    public boolean isAlive() {
        return isAlive;
    }

    public boolean isVictorious() {
        return isVictorious;
    }

    public String getName() {
        return name;
    }

    private void die() {
        isAlive = false;
    }
    
    public void sleep() {
        System.out.println(name + " sleeps.");
        tiredness = 0;
        foodLevel -= 3;
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("Zzz...");
            } catch (InterruptedException e) {
                System.out.println("Could not snore due to interruption\n" + e.getMessage());
            }
        }

        if (foodLevel <= 0) {
            System.out.println(name + " starves to death.");
            die();
        }
    }

    public void feed() {
        if (isAlive) {
            System.out.println(name + " eats.");
            foodLevel++;
            tiredness++;
            System.out.println(foodLevel + " " + tiredness);

            if (foodLevel > 10) {
                System.out.println(name + " over ate.");
                die();
            }
            else if (tiredness > TIRED_THRESHOLD) {
                System.out.println(name + " is sleepy from so much food.");
                sleep();
            }
        }
    }

    public void hustle() {
        if (isAlive) {
            System.out.println(name + " is getting that bread!");
            foodLevel -= 2;
            tiredness += 4;
            breadStock += 4;
            if (breadStock >= 10) {
                System.out.println(name + " has got all the bread there is!");
                isVictorious = true;
            }
            else if (tiredness > TIRED_THRESHOLD) {
                System.out.println(name + " is sleepy from getting so much bread");
                sleep();
            }
        }
    }
}
