package food;

public class FoodFactory {
    public static Food selectFood(String food) {
        food = food.toLowerCase();

        switch (food) {
            case "banana":
                return new Banana();
            case "bread":
                return new Bread();
            case "full english":
                return new FullEnglish();
            default:
                return new Apple();
        }
    }
}
