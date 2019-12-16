public interface IMenu {
    void open();
    void close();
    Dish chooseDish(String name, String menuSection) throws MenuSectionNotExist, DishNotExist;
}
