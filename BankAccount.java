public class BankAccount {
    // member variables
    private double checkingBalance;
    private double savingBalance;

    // class variables
    private static int numberOfAccounts = 0;
    private static double totalMoneyStored = 0;

    // constructor
    public BankAccount() {
        this.checkingBalance = 0;
        this.savingBalance = 0;
        numberOfAccounts++;
    }

    // static method for getting number of accounts
    public static int accountCount() {
        return numberOfAccounts;
    }

    // static method for getting number of accounts
    public static double moneyCount() {
        return totalMoneyStored;
    }

    // checking getter
    public double getCheckingBalance() {
        return checkingBalance;
    }

    // savings getter
    public double getSavingBalance() {
        return savingBalance;
    }

    // deposit method
    public void deposit(double depositAmount, String accountType) {
        if(accountType == "checking") {
            this.checkingBalance += depositAmount;
        }
        else if(accountType == "saving") {
            this.savingBalance += depositAmount;
        }
        totalMoneyStored += depositAmount;
    }

    // withdraw method
    public void withdraw(double withdrawAmount, String accountType) {
        if(accountType == "checking") {
            if(checkingBalance >= withdrawAmount) {
                checkingBalance -= withdrawAmount;
            } else {
                System.out.println("Insufficient funds in Checking Account");
            }
        } 
        else if(accountType == "saving") {
            if(savingBalance >= withdrawAmount) {
                savingBalance -= withdrawAmount;
            } else {
                System.out.println("Insufficient funds in Savings Account");
            }
        }
        totalMoneyStored -= withdrawAmount;
    }

    // view total money from checking and saving
    public void display() {
        System.out.printf("Checking Balance: $%.2f\n", this.checkingBalance);
        System.out.printf("Saving Balance: $%.2f\n", this.savingBalance);
    }


}