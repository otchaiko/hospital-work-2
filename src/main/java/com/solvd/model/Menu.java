package com.solvd.model;

import com.solvd.exception.DishNotExist;
import com.solvd.IMenu;
import com.solvd.exception.MenuSectionNotExist;
import org.apache.log4j.Logger;

import java.util.List;
import java.util.Map;

public class Menu implements IMenu {

    private static final Logger LOGGER = Logger.getLogger(Menu.class);

    private Map<String, List<Dish>> dishes;

    @Override
    public void open() {
        LOGGER.info("Our menu has " + dishes.get("hotMeals").size() + " hot meals, "
                + dishes.get("snacks").size() + " snacks " + dishes.get("drinks").size() + " drinks ");
    }

    @Override
    public void close() {
        LOGGER.info("Come again");
    }

    public final Dish chooseDish(String name) throws MenuSectionNotExist, DishNotExist {
        return chooseDish(name, "hotMeals");
    }

    @Override
    public final Dish chooseDish(String name, String menuSection) throws MenuSectionNotExist, DishNotExist {
        Dish result = null;
        if (name != null && menuSection != null) {
            List<Dish> dishesList = dishes.get(menuSection);
            if(dishesList == null) {
                throw new MenuSectionNotExist("Sorry this menu section does not exist");
            } else {
                result = findDishByName(dishesList, name);
                if(result == null) {
                    throw new DishNotExist("Sorry this dish does not exist");
                }
            }
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
