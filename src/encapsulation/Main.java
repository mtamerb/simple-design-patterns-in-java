package encapsulation;

public class Main {

    public static void main(String[] args) {
        // we should encapsulation of the Account class
        /*var account = new Account();
        account.deposit(10);
        account.balance = -1;
        account.withdraw(5);
        System.out.println(account.getBalance());*/

        var account = new Account();
        account.setBalance(-10);
        System.out.println(account.getBalance());

        account.deposit(100);
        System.out.println("Balance: " + account.getBalance());

        account.withdraw(25);
        System.out.println("Balance: " + account.getBalance());
    }
}
