import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like your critter to be called?");
        String lineRead = scanner.nextLine();
        Critter bob = lineRead.isBlank() ? new Critter() : new Critter(lineRead);
        while (bob.isAlive() && !bob.isVictorious()) {
            System.out.println("What would you like " + bob.getName() + " to do?");
            lineRead = scanner.nextLine();
            if (lineRead.equalsIgnoreCase("eat")) {
                bob.feed();
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
