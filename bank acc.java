class BankAccount 
{
    String accountNumber;
    String accountHolderName;
    double currentBalance;

    BankAccount(String accountNumber, String accountHolderName) 
    {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.currentBalance = 0.0;
    }

    void deposit(double amount)
    {
        currentBalance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (currentBalance >= amount) 
        {
            currentBalance -= amount;
            System.out.println("Withdrew: " + amount);
        } 
        else 
        {
            System.out.println("Insufficient Balance ");
        }
    }

    void checkBalance() 
    {
        System.out.println("Current Balance: " + currentBalance);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("77309620", "Mani");

        account.checkBalance();  

        account.deposit(500.0);  
        account.checkBalance(); 

        account.withdraw(200.0); 
        account.checkBalance();  // Returns CurrentBalance: 300.0

        account.withdraw(400.0); // Insufficient currentBalance!
    }
}
