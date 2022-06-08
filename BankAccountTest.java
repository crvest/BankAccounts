public class BankAccountTest {
    public static void main(String[] args) {

        // test cases
        // create accounts
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();

        // test deposit
        account1.deposit(1500, "checking");
        account1.deposit(2500, "saving");
        account2.deposit(1750, "checking");
        account2.deposit(130, "saving");

        // test class variables
        System.out.printf("Total Accounts: %d\n", BankAccount.accountCount());
        System.out.printf("Total Money: $%.2f\n", BankAccount.moneyCount());

        // display method
        System.out.println("----Account 1----");
        account1.display();
        System.out.println("----Account 2----");
        account2.display();

        // test withdraw
        account1.withdraw(500, "checking");
        account1.withdraw(20, "saving");
        account2.withdraw(10, "checking");
        account2.withdraw(30, "saving");

        // display method
        System.out.println("----After withdraw----");
        System.out.println("----Account 1----");
        account1.display();
        System.out.println("----Account 2----");
        account2.display();
    }

}
