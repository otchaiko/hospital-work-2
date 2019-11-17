public class Main {

    public static void main(String[] args) {

        Address alehAddress = new Address("Belarus", "Minsk", "Jukovskogo", "5/2",
                "23");
        Worker aleh = new Worker("Aleh", "Chaiko", 26, alehAddress);

        Address maximAddress = new Address("Belarus", "Minsk", "Maximalnaya", "12",
                "225b");
        Worker maxim = new Worker("Maxim", "Maximenko", 18, maximAddress);

        Worker[] collective = new Worker[2];
        collective[0] = aleh;
        collective[1] = maxim;

        Dish beerPaulaner = new Dish("Beer Paulaner", 500, 5);
        Dish redBull = new Dish("Red Bull", 350, 4.30);
        Dish[] drinks = new Dish[2];
        drinks[0] = beerPaulaner;
        drinks[1] = redBull;

        Dish soup = new Dish("Borsch", 500, 6.80);
        Dish potato = new Dish("Fried potatoes", 650,  6.20);
        Dish[] hotMeals = new Dish[2];
        hotMeals[0] = soup;
        hotMeals[1] = potato;

        Dish salad = new Dish("Olivie", 450, 4.80);
        Dish nuggets = new Dish("Chiken nuggets", 200, 8);
        Dish[] snacks = new Dish[2];
        snacks[0] = salad;
        snacks[1] = nuggets;

        Menu nobuMenu = new Menu();
        nobuMenu.setDrinks(drinks);
        nobuMenu.setHotMeals(hotMeals);
        nobuMenu.setSnacks(snacks);

        Address nobuAddress = new Address("Belarus", "Minsk", "Mogilevskaya", "39a");

        Restaurant nobu = new Restaurant("Nobu", 10000.00, nobuAddress);
        nobu.setWorkers(collective);
        nobu.setMenu(nobuMenu);
        nobu.setAccounting(true);

        System.out.println("Restaurant " + nobu.getBrandName() + " is created");
    }
}
