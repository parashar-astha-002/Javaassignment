interface Notifier {
    void sendMessage();
}

class BankAccount {
    private double balance = 5000;

    // Inner class can access the private field of the outer class.
    class AccountManager {
        void updateBalance(double amount) {
            balance += amount;
            System.out.println("Updated Balance = " + balance);
        }
    }

    // Static nested class does not need an outer object.
    static class ReceiptPrinter {
        void printReceipt() {
            System.out.println("Bank Transaction Receipt");
        }
    }

    void notifyUser(Notifier notifier) {
        notifier.sendMessage();
    }
}

public class NestedDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        BankAccount.AccountManager manager = account.new AccountManager();
        manager.updateBalance(1000);

        BankAccount.ReceiptPrinter printer = new BankAccount.ReceiptPrinter();
        printer.printReceipt();

        Notifier notification = () ->
            System.out.println("Transaction Successful!");

        account.notifyUser(notification);
    }
}
