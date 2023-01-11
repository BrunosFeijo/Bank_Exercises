import src.Account;
import src.Customer;

public class main {
    public static void main(String[] args) throws Exception {
        Account account1 = new Account(4343,"Bruno",1000);
//        Account account2 = new Account(4343,null,1000);
        account1.accountSummary();

        account1.deposit(200);
//        account1.deposit(-200);
        account1.accountSummary();

        account1.withdraw(500);
//        account1.withdraw(-500);
//        account1.withdraw(800);
        account1.accountSummary();



    }
}
