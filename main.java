import src.Account;
import src.AccountOverdraft;
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

        AccountOverdraft account2 = new AccountOverdraft(4444,"Thais",2000,500);
        account2.accountSummary();

        account2.deposit(200);
//        account2.deposit(-200);
        account2.accountSummary();

        account2.withdraw(500);
//        account2.withdraw(-500);
        account2.withdraw(1800);
//        account2.withdraw(300);
        account2.accountSummary();
    }
}
