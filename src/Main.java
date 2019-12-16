import java.util.*;

public class Main {

    public static void main(String[] args) {

        Set<Worker> collective = Builder.createWorkers();

        Menu nobuMenu = Builder.createMenu();

        Restaurant nobu = Builder.createRestaurant();

        nobu.setWorkers(collective);
        nobu.setMenu(nobuMenu);
        nobu.setAccounting(true);

        System.out.println("Restaurant " + nobu.getBrandName() + " is created");

        Runner.runChooseDish(nobuMenu, Builder.getClientChoose());

    }
}
