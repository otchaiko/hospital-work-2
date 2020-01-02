package com.solvd.model;

import com.solvd.exception.DishNotExist;
import com.solvd.exception.MenuSectionNotExist;
import org.apache.log4j.Logger;

import java.util.List;
import java.util.Map;

public class Runner {

    private static final Logger LOGGER = Logger.getLogger(Runner.class);

    public static void runChooseDish(Menu nobuMenu, Map<String, List<String>> dishNames) {
        double totalPrice = 0.0;
        try {
            for(Map.Entry<String, List<String>> entry : dishNames.entrySet()) {
                for(String dishName : entry.getValue()) {
                    Dish currentDish = nobuMenu.chooseDish(dishName, entry.getKey());
                    totalPrice = totalPrice + currentDish.getPrice();
                    LOGGER.debug("Current dish price is " + currentDish.getPrice());
                }
            }
        } catch (MenuSectionNotExist e) {
            LOGGER.error("Cannot find menu section with this name");
        } catch (DishNotExist e) {
            LOGGER.error("Cannot find dish with this name");
        } finally {
            LOGGER.info("Total price is : " + totalPrice);
        }
    }
}
