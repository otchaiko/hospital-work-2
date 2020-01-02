package com.solvd.model;

import com.solvd.utils.PartialProperty;
import org.apache.log4j.Logger;

import java.util.*;

public class Builder {

    private static final Logger LOGGER = Logger.getLogger(Builder.class);

    public static Set<Worker> createWorkers() {

        Address alehAddress = new Address(
                PartialProperty.readProperty("aleh.address.country"),
                PartialProperty.readProperty("aleh.address.city"),
                PartialProperty.readProperty("aleh.address.street"),
                PartialProperty.readProperty("aleh.address.house"),
                PartialProperty.readProperty("aleh.address.apartment"));
        Worker aleh = new Worker(
                PartialProperty.readProperty("aleh.firstName"),
                PartialProperty.readProperty("aleh.lastName"),
                Integer.parseInt(PartialProperty.readProperty("aleh.age")),
                alehAddress);

        Address maximAddress = new Address(
                PartialProperty.readProperty("maxim.address.country"),
                PartialProperty.readProperty("maxim.address.city"),
                PartialProperty.readProperty("maxim.address.street"),
                PartialProperty.readProperty("maxim.address.house"),
                PartialProperty.readProperty("maxim.address.apartment"));
        Worker maxim = new Worker(PartialProperty.readProperty("maxim.firstName"),
                PartialProperty.readProperty("maxim.lastName"),
                Integer.parseInt(PartialProperty.readProperty("maxim.age")),
                maximAddress);

        Set<Worker> collective = new HashSet<>();
        collective.add(aleh);
        collective.add(maxim);

        return collective;
    }

    public static Menu createMenu() {
        Dish beerPaulaner = new Dish(
                PartialProperty.readProperty("dish.drink.beerPaulaner.name"),
                Double.parseDouble(PartialProperty.readProperty("dish.drink.beerPaulaner.weight")),
                Double.parseDouble(PartialProperty.readProperty("dish.drink.beerPaulaner.price")));
        Dish redBull = new Dish(
                PartialProperty.readProperty("dish.drink.redBull.name"),
                Double.parseDouble(PartialProperty.readProperty("dish.drink.redBull.weight")),
                Double.parseDouble(PartialProperty.readProperty("dish.drink.redBull.price")));
        List<Dish> drinks = new ArrayList<>();
        drinks.add(beerPaulaner);
        drinks.add(redBull);

        Dish soup = new Dish(
                PartialProperty.readProperty("dish.hotMeal.borsch.name"),
                Double.parseDouble(PartialProperty.readProperty("dish.hotMeal.borsch.weight")),
                Double.parseDouble(PartialProperty.readProperty("dish.hotMeal.borsch.price")));
        Dish potato = new Dish(
                PartialProperty.readProperty("dish.hotMeal.potato.name"),
                Double.parseDouble(PartialProperty.readProperty("dish.hotMeal.potato.weight")),
                Double.parseDouble(PartialProperty.readProperty("dish.hotMeal.potato.price")));
        List<Dish> hotMeals = new ArrayList<>();
        hotMeals.add(soup);
        hotMeals.add(potato);

        Dish salad = new Dish(
                PartialProperty.readProperty("dish.snack.olivie.name"),
                Double.parseDouble(PartialProperty.readProperty("dish.snack.olivie.weight")),
                Double.parseDouble(PartialProperty.readProperty("dish.snack.olivie.price")));
        Dish nuggets = new Dish(
                PartialProperty.readProperty("dish.snack.nuggets.name"),
                Double.parseDouble(PartialProperty.readProperty("dish.snack.nuggets.weight")),
                Double.parseDouble(PartialProperty.readProperty("dish.snack.nuggets.price")));
        List<Dish> snacks = new ArrayList<>();
        snacks.add(salad);
        snacks.add(nuggets);

        Map<String, List<Dish>> dishes = new HashMap<>();
        dishes.put("drinks", drinks);
        dishes.put("hotMeals", hotMeals);
        dishes.put("snacks", snacks);

        Menu nobuMenu = new Menu();
        nobuMenu.setDishes(dishes);

        return nobuMenu;
    }

    public static Restaurant createRestaurant() {

        Address nobuAddress = new Address(
                PartialProperty.readProperty("restaurant.nobu.address.country"),
                PartialProperty.readProperty("restaurant.nobu.address.city"),
                PartialProperty.readProperty("restaurant.nobu.address.street"),
                PartialProperty.readProperty("restaurant.nobu.address.house"));

        Restaurant nobu = new Restaurant(
                PartialProperty.readProperty("restaurant.name"),
                Double.parseDouble(PartialProperty.readProperty("restaurant.accountMoney")), nobuAddress);

        return nobu;
    }

    public static Map<String, List<String>> getClientChoose() {
        List<String> hotMeals = new ArrayList<>();
        hotMeals.add("Borsch");
        hotMeals.add("Fried potatoes");
        List<String> drinks = new ArrayList<>();
        drinks.add("Beer Paulaner");
        drinks.add("Beer Paulaner");
        Map<String, List<String>> clientChoose = new HashMap<>();
        clientChoose.put("hotMeals", hotMeals);
        clientChoose.put("drinks", drinks);
        return clientChoose;
    }

    public static Map<String, List<String>> enterDish() {
        Map<String, List<String>> clientChoose = new HashMap<>();

        System.out.println("\nPlease enter hot meals what you want (We can to offer you Borsch and Fried potatoes): ");
        System.out.println("If you want to go to the next position, enter \"no\"");
        List<String> hotMeals = addDish();

        System.out.println("Please enter snacks what you want (We can to offer you Olivie and Chiken nuggets): ");
        System.out.println("If you want to go to the next position, enter \"no\"");
        List<String> snacks = addDish();

        System.out.println("Please enter drinks what you want (We can to offer you Red Bull and Beer Paulaner): ");
        System.out.println("If you want to finish your order enter \"no\"");
        List<String> drinks = addDish();

        clientChoose.put("hotMeals", hotMeals);
        clientChoose.put("snacks", snacks);
        clientChoose.put("drinks", drinks);

        return clientChoose;
    }

    private static List<String> addDish() {
        Scanner scanner;
        String answer = null;
        List<String> result = new ArrayList<>();
        while(!"no".equals(answer)) {
            scanner = new Scanner(System.in);
            answer = scanner.nextLine();
            if (!"no".equals(answer)) {
                result.add(answer);
            }
        }
        return result;
    }

}
