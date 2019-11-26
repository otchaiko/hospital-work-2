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

    @Override
    public Dish chooseDish(String name, String menuSection) {
        Dish result = null;
        if (menuSection.equals("hotMeals")) {
            for (Dish dish : hotMeals) {
                if (dish.getName().equals(name)) {
                    result = dish;
                }
            }
        } else if (menuSection.equals("snacks")) {
            for (Dish dish : snacks) {
                if (dish.getName().equals(name)) {
                    result = dish;
                }
            }
        } else if (menuSection.equals("drinks")) {
            for (Dish dish : drinks) {
                if (dish.getName().equals(name)) {
                    result = dish;
                }
            }
        } else {
            System.out.println("Sorry this menu section does not exist");
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
