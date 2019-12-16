import java.util.List;
import java.util.Map;

public class Runner {
    public static void runChooseDish(Menu nobuMenu, Map<String, List<String>> dishNames) {
        double totalPrice = 0.0;
        try {
            for(Map.Entry<String, List<String>> entry : dishNames.entrySet()) {
                for(String dishName : entry.getValue()) {
                    Dish currentDish = nobuMenu.chooseDish(dishName, entry.getKey());
                    totalPrice = totalPrice + currentDish.getPrice();
                    System.out.println("Current dish price is " + currentDish.getPrice());
                }
            }
        } catch (MenuSectionNotExist e) {
            System.out.println("Cannot find menu section with this name");
        } catch (DishNotExist e) {
            System.out.println("Cannot find dish with this name");
        } finally {
            System.out.println("Total price is : " + totalPrice);
        }
    }
}
