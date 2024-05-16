class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}
class Account {
    double balance;
    Account(double min_bal) {
        this.balance = min_bal;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of " + amount + " successful");
    }

    public void withdraw(double amount) throws MyException {
        if (amount > balance) {
            throw new MyException("Insufficient funds. Cannot withdraw " + amount);
        } else {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful");
        }
    }
}

public class BankApp8C3 {
    public static void main(String[] args) {
        Account a1 = new Account(1000);

        try {
            a1.deposit(500);
            a1.withdraw(200);
            a1.withdraw(1500);
        } catch (MyException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println("Current Balance: " + a1.balance);
    }
}
