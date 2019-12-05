import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class Restaurant extends Business {

    private Address address;
    private Menu menu;
    private Set<Worker> workers;

    public Restaurant (String brandName, double accountMoney, Address address) {
        super(brandName, accountMoney);
        this.address = address;
    }

    @Override
    public Date open() {
        System.out.println("Restaurant " + getBrandName() + " is opening");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 6);
        calendar.set(Calendar.MINUTE, 0);
        return calendar.getTime();
    }

    @Override
    public Date close() {
        System.out.println("Restaurant " + getBrandName() + " is closing");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 18);
        calendar.set(Calendar.MINUTE, 0);
        return calendar.getTime();
    }

    @Override
    public double paySallary() {
        System.out.println("Sallary is paying");
        return workers.size() * 100;
    }

    @Override
    public void doWork(IWorker[] workers) {
        System.out.println(workers.length + " are working now");
        for (IWorker worker : workers) {
            worker.work();
        }
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

    public Set<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(Set<Worker> workers) {
        this.workers = workers;
    }

}
