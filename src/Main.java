import java.util.*;

public class Main {

    public static void main(String[] args) {

        Address alehAddress = new Address("Belarus", "Minsk", "Jukovskogo", "5/2",
                "23");
        Worker aleh = new Worker("Aleh", "Chaiko", 26, alehAddress);

        Address maximAddress = new Address("Belarus", "Minsk", "Maximalnaya", "12",
                "225b");
        Worker maxim = new Worker("Maxim", "Maximenko", 18, maximAddress);

        Set<Worker> collective = new HashSet<>();
        collective.add(aleh);
        collective.add(maxim);

        Dish beerPaulaner = new Dish("Beer Paulaner", 500, 5);
        Dish redBull = new Dish("Red Bull", 350, 4.30);
        List<Dish> drinks = new ArrayList<>();
        drinks.add(beerPaulaner);
        drinks.add(redBull);

        Dish soup = new Dish("Borsch", 500, 6.80);
        Dish potato = new Dish("Fried potatoes", 650,  6.20);
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

        Address nobuAddress = new Address("Belarus", "Minsk", "Mogilevskaya", "39a");

        Restaurant nobu = new Restaurant("Nobu", 10000.00, nobuAddress);
        nobu.setWorkers(collective);
        nobu.setMenu(nobuMenu);
        nobu.setAccounting(true);

        System.out.println("Restaurant " + nobu.getBrandName() + " is created");
    }
}
