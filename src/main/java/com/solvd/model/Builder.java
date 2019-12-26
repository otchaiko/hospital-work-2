package com.solvd.model;

import java.util.*;

public class Builder {
    public static Set<Worker> createWorkers() {

        Address alehAddress = new Address("Belarus", "Minsk", "Jukovskogo", "5",
                "51");
        Worker aleh = new Worker("Aleh", "Chaiko", 26, alehAddress);

        Address maximAddress = new Address("Belarus", "Minsk", "Maximalnaya", "12",
                "225b");
        Worker maxim = new Worker("Maxim", "Maximenko", 18, maximAddress);

        Set<Worker> collective = new HashSet<>();
        collective.add(aleh);
        collective.add(maxim);

        return collective;
    }

    public static Menu createMenu() {
        Dish beerPaulaner = new Dish("Beer Paulaner", 500, 5);
        Dish redBull = new Dish("Red Bull", 350, 4.30);
        List<Dish> drinks = new ArrayList<>();
        drinks.add(beerPaulaner);
        drinks.add(redBull);

        Dish soup = new Dish("Borsch", 500, 6.80);
        Dish potato = new Dish("Fried potatoes", 650, 6.20);
        List<Dish> hotMeals = new ArrayList<>();
        hotMeals.add(soup);
        hotMeals.add(potato);

        Dish salad = new Dish("Olivie", 450, 4.80);
        Dish nuggets = new Dish("Chiken nuggets", 200, 8);
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

        Address nobuAddress = new Address("Belarus", "Minsk", "Mogilevskaya", "39a");

        Restaurant nobu = new Restaurant("Nobu", 10000.00, nobuAddress);

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

        System.out.println("Please enter hot meals what you want (We can to offer you Borsch and Fried potatoes): ");
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
