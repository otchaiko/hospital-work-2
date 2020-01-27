package com.solvd;

import com.solvd.mapper.AddressMapper;
import com.solvd.mapper.RestaurantMapper;
import com.solvd.mapper.SqlExecutor;
import com.solvd.model.*;
import org.apache.log4j.Logger;

import java.util.Set;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        RestaurantMapper restaurantMapper = SqlExecutor.getRestaurantMapper();
        Restaurant nobu = restaurantMapper.getRestaurantById(1L);

        Set<Worker> collective = Builder.createWorkers();

        Menu nobuMenu = Builder.createMenu();

        //Restaurant nobu = Builder.createRestaurant();

        nobu.setWorkers(collective);
        nobu.setMenu(nobuMenu);
        nobu.setAccounting(true);

        LOGGER.info("Restaurant " + nobu.getBrandName() + " is created");

        Runner.runChooseDish(nobuMenu, Builder.enterDish());

    }
}
