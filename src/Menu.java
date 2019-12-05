import java.util.List;
import java.util.Map;

public class Menu implements IMenu {

    private Map<String, List<Dish>> dishes;

    @Override
    public void open() {
        System.out.println("Our menu has " + dishes.get("hotMeals").size() + " hot meals, "
                + dishes.get("snacks").size() + " snacks " + dishes.get("drinks").size() + " drinks ");
    }

    @Override
    public void close() {
        System.out.println("Come again");
    }

    public final Dish chooseDish(String name) {
        return chooseDish(name, "hotMeals");
    }

    @Override
    public final Dish chooseDish(String name, String menuSection) {
        Dish result = null;
        if (name != null && menuSection != null) {
            List<Dish> dishesList = dishes.get(menuSection);
            if(dishesList == null) {
                System.out.println("Sorry this menu section does not exist");
            } else {
                result = findDishByName(dishesList, name);
            }

            //могу ли я убрать switch case?
            /*switch (menuSection) {
                case "hotMeals":
                    result = findDishByName(dishes.get("hotMeals"), name);
                    break;
                case "snacks":
                    result = findDishByName(dishes.get("snacks"), name);
                    break;
                case "drinks":
                    result = findDishByName(dishes.get("drinks"), name);
                    break;
                default:
                    System.out.println("Sorry this menu section does not exist");
                    break;
            } */
        }
        return result;
    }

    private static Dish findDishByName(List<Dish> dishes, String name) {
        Dish result = null;
        for (Dish dish : dishes) {
            if (dish == null) {
                break;
            }
            if (dish.getName().equals(name)) {
                result = dish;
                break;
            }
        }
        return result;
    }

    public Map<String, List<Dish>> getDishes() {
        return dishes;
    }

    public void setDishes(Map<String, List<Dish>> dishes) {
        this.dishes = dishes;
    }
}
