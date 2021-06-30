public class Critter {
    private boolean isAlive;
    private boolean isVictorious;
    private int foodLevel;
    private int tiredness;
    private int breadStock;
    private String name;

    public Critter() {
        isAlive = true;
        isVictorious = false;
        foodLevel = 5;
        tiredness = 0;
        breadStock = 0;
        this.name = "Critter";
    }
    public Critter(String name) {
        isAlive = true;
        isVictorious = false;
        foodLevel = 5;
        tiredness = 0;
        breadStock = 0;
        this.name = name;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public boolean isVictorious() {
        return isVictorious;
    }

    private void die() {
        isAlive = false;
    }
    
    public void sleep() {
        System.out.println(name + " sleeps.");
        tiredness = 0;
        foodLevel -= 3;
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
            if (foodLevel > 10) {
                System.out.println(name + " over ate.");
                die();
            }
            else if (tiredness > 5) {
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
            breadStock += 2;
            if (breadStock >= 10) {
                System.out.println(name + " is victorious, they've got all the bread there is!");
                isVictorious = true;
            }
        }
    }
}
