import critter.Critter;
import critter.CritterFactory;
import food.FoodFactory;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What type of critter would you like");
        String critterType = scanner.nextLine();
        System.out.println("What would you like your critter to be called?");
        String name = scanner.nextLine();
        Critter bob = CritterFactory.createCritter(critterType, name);

        while (bob.isAlive() && !bob.isVictorious()) {
            System.out.println("What would you like " + bob.getName() + " to do?");
            String lineRead = scanner.nextLine();
            if (lineRead.equalsIgnoreCase("eat")) {
                System.out.println("What would you like " + bob.getName() + " to eat?");
                lineRead = scanner.nextLine();
                bob.feed(FoodFactory.selectFood(lineRead));
            } else if (lineRead.equalsIgnoreCase("sleep")) {
                bob.sleep();
            } else if (lineRead.equalsIgnoreCase("get bread")) {
                bob.hustle();
            }
        }

        if (bob.isVictorious()) {
            System.out.println(bob.getName() + " is victorious");
        } else if (!bob.isAlive()) {
            System.out.println(bob.getName() + " has died.");
        }
        scanner.close();
    }
}
