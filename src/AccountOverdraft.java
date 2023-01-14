package src;

public class AccountOverdraft extends Account {
    private double overdraft;
    private double limit;

    public AccountOverdraft(int id, Customer customer, double balance, double overdraft) throws Exception {
        super(id, customer, balance);
        this.overdraft = overdraft;
        this.limit = getBalance() + this.overdraft;
    }
    @Override
    public void accountSummary() {
        StringBuilder builder = new StringBuilder();

        builder.append("-----------------------------------\n");
        builder.append("AccountID: " + getId() + "\n");
        builder.append("Name: " + getCustomer() + "\n");
        builder.append("Balance: " + getBalance() + "\n");
        builder.append("Overdraft: " + getOverdraft() + "\n");
        builder.append("Limit: " + getLimit() + "\n");
        builder.append("-----------------------------------\n");

        System.out.println(builder.toString());
    }
    @Override
    public void withdraw(double value) throws Exception {
        if (value < 0) throw new Exception("Invalid value");
        if (value > limit) throw new Exception("No available balance");

        this.limit -= value;
        super.balance -= value;
    }
    public double getOverdraft() {
        return overdraft;
    }
    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }
    public double getLimit() {
        return getBalance() + getOverdraft();
    }
    public void setLimit(double limit) {
        this.limit = limit;
    }
}
