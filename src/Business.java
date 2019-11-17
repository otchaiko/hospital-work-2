public class Business {

    private String brandName;
    private double accountMoney;
    private boolean accounting;

    public Business(String brandName, double accountMoney) {
        this.brandName = brandName;
        this.accountMoney = accountMoney;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public double getAccountMoney() {
        return accountMoney;
    }

    public void setAccountMoney(double accountMoney) {
        this.accountMoney = accountMoney;
    }

    public boolean isAccounting() {
        return accounting;
    }

    public void setAccounting(boolean accounting) {
        this.accounting = accounting;
    }
}