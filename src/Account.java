package src;

public class Account {
    private int id;
    private Customer customer;
    private double balance;

    public Account() {
        this.id = 0;
        this.customer.setNome("");
        this.balance = 0;
    }

    public Account(int id, String customer, double balance) {
        this.id = id;
        this.customer.setNome(customer);
        this.balance = balance;
    }

    public void accountSummary() {
        StringBuilder builder = new StringBuilder();

        builder.append("-----------------------------------");
        builder.append("AccountID: " + getId());
        builder.append("Name: " + getCustomer());
        builder.append("Balance: " + getBalance());
        builder.append("-----------------------------------");

        System.out.println(builder.toString());
    }

    public void deposit(double value) {
        if (value > 0) {
            this.balance += value;
        } else {
            // Informar erro
        }
    }

    public void withdraw(double value){
        if (value > 0){
            if (value > this.balance){
                this.balance -= value;
            }else{
                // Informar erro
            }
        }else{
            // Informar erro
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        String digitos = Integer.toString(id);
        if (digitos.length() == 4) {
            this.id = id;
        } else {
            // Informar erro
        }
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
