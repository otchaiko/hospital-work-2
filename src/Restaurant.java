public class Restaurant extends Business {

    private Address address;
    private Menu menu;
    private Worker[] workers;

    public Restaurant (String brandName, double accountMoney, Address address) {
        super(brandName, accountMoney);
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Worker[] getWorkers() {
        return workers;
    }

    public void setWorkers(Worker[] workers) {
        this.workers = workers;
    }

}
