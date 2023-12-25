package encapsulation;

public class Account {
    private float balance;

    // encapsulation
    public void deposit(float amount) {
        if (amount > 0)
            balance += amount;
    }

    public void withdraw(float amount) {
        if (amount > 0 && this.balance - amount >= 0) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float newBalance) {
        if (newBalance >= 0) {
            this.balance = newBalance;
            System.out.println("Balance is set.");

        } else {
            System.out.println("Balance can't be negative. Balance is set to 0.");
            this.balance = 0;
        }
    }

}
