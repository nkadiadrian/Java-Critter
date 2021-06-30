public class CritterFactory {
    public static Critter createCritter(String critterType, String name) {
        Critter critter;
        critterType = critterType.toLowerCase();

       switch (critterType) {
           case "hustler":
               critter = new Hustler(name);
               break;
           case "sleeper":
               critter = new Sleeper(name);
               break;
           case "glutton":
               critter = new Glutton(name);
           default:
               critter = new Critter(name);
       }

       return critter;
    }
}
 