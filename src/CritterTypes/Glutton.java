package CritterTypes;

public class Glutton extends Critter {

    @Override
    public void sleep() {
        System.out.println("*Snores Loudly*");;
        super.sleep();
    }
}
