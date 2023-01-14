package src;

public class Account {
    private int id;
    private Customer customer;
    protected double balance;

    public Account(int id, Customer customer, double balance) throws Exception {
        this.id = id;
        this.customer= customer;
        this.balance = balance;
    }

    public void accountSummary() {
        StringBuilder builder = new StringBuilder();

        builder.append("-----------------------------------\n");
        builder.append("AccountID: " + getId()+"\n");
        builder.append("Name: " + getCustomer()+"\n");
        builder.append("Balance: " + getBalance()+"\n");
        builder.append("-----------------------------------\n");

        System.out.println(builder.toString());
    }

    public void deposit(double value) throws Exception {
        if (value < 0) throw new Exception("Invalid value");

        this.balance += value;
    }

    public void withdraw(double value) throws Exception {
       if(value < 0) throw new Exception("Invalid value");
       if (value > balance) throw new Exception("No available balance");

       balance -= value;
    }

    public void transfer(Account target, double value) throws Exception {
        this.withdraw(value);
        target.deposit(value);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) throws Exception {
        String digitos = Integer.toString(id);
        if (digitos.length() != 4) throw new Exception("ID must be 4 digits");

        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomer() {
        return customer.getNome();
    }

    public void setCustomer(String customer) {
        this.customer.setNome(customer);
    }

}
