import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Critter bob = new Critter();
        while (bob.isAlive() && !bob.isVictorious()) {
            System.out.println("What would you like Critter to do?");
            String lineRead = scanner.nextLine();
            if (lineRead.equalsIgnoreCase("eat")) {
                bob.feed();
            } else if (lineRead.equalsIgnoreCase("sleep")) {
                bob.sleep();
            } else if (lineRead.equalsIgnoreCase("get bread")) {
                bob.hustle();
            }
        }
        System.out.println("Critter has died.");
        scanner.close();
    }
}
