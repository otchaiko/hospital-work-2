public class Menu implements IMenu {

    private Dish[] hotMeals;
    private Dish[] snacks;
    private Dish[] drinks;

    @Override
    public void open() {
        System.out.println("Our menu has " + hotMeals.length + " hot meals, "
                + snacks.length + " snacks " + drinks.length + " drinks ");
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
            switch (menuSection) {
                case "hotMeals":
                    result = findDishByName(hotMeals, name);
                    break;
                case "snacks":
                    result = findDishByName(snacks, name);
                    break;
                case "drinks":
                    result = findDishByName(drinks, name);
                    break;
                default:
                    System.out.println("Sorry this menu section does not exist");
                    break;
            }
        }
        return result;
    }

    private static Dish findDishByName(Dish[] dishes, String name) {
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

    public Dish[] getHotMeals() {
        return hotMeals;
    }

    public void setHotMeals(Dish[] hotMeals) {
        this.hotMeals = hotMeals;
    }

    public Dish[] getSnacks() {
        return snacks;
    }

    public void setSnacks(Dish[] snacks) {
        this.snacks = snacks;
    }

    public Dish[] getDrinks() {
        return drinks;
    }

    public void setDrinks(Dish[] drinks) {
        this.drinks = drinks;
    }

}
