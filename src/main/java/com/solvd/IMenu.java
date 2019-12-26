package com.solvd;

import com.solvd.exception.DishNotExist;
import com.solvd.exception.MenuSectionNotExist;
import com.solvd.model.Dish;

public interface IMenu {
    void open();
    void close();
    Dish chooseDish(String name, String menuSection) throws MenuSectionNotExist, DishNotExist;
}
