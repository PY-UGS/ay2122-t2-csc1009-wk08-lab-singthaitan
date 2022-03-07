import java.math.BigDecimal;

public class CheckingAccount {
    private double Balance = 10000;
    private int accountNumber;

    public CheckingAccount(double Balance, int Number) {
        this.Balance = Balance;
        this.accountNumber = Number;
    }

    public void deposit(double amount) {
        this.Balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        BigDecimal zero = new BigDecimal(0);
        if (Balance - amount < 0) {
            throw new InsufficientFundsException(amount - Balance);
        } else {
            this.Balance -= amount;
        }

    }

    public double getBalance() {
        return Balance;
    }

    public int getNumber() {
        return accountNumber;
    }

}
