package src;

public class Account {
    private int id;
    private Customer customer;
    protected double balance;

    public Account() {
        this.id = 0;
        this.customer.setNome("");
        this.balance = 0;
    }

    public Account(int id, String customer, double balance) throws Exception {
        this.id = id;
        this.customer= new Customer(customer);
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
        if (value > 0) {
            this.balance += value;
        } else {
            throw new Exception("Invalid value");
        }
    }

    public void withdraw(double value) throws Exception {
        if (value > 0){
            if (value <= this.balance){
                this.balance -= value;
            }else{
                throw new Exception("No available balance");
            }
        }else{
            throw new Exception("Invalid value");
        }
    }

//    public void transfer(){
//
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) throws Exception {
        String digitos = Integer.toString(id);
        if (digitos.length() == 4) {
            this.id = id;
        } else {
            throw new Exception("ID must be 4 digits");
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
