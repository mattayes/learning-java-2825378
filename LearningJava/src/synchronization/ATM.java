package synchronization;

public class ATM {
    static synchronized void withdraw(BankAccount account, int amount) {
        int balance = account.getBalance();
        if (balance - amount < -account.getOverdraft()) {
            System.out.println("Transaction denided!");
        } else {
            account.debit(amount);
            System.out.printf("$%d successfully withdrawn\n", amount);
        }
        System.out.printf("Current balance: $%d\n", account.getBalance());
    }
}
