public class BankAccount {
    private double balance;
    private String pin;
    public BankAccount() {
        balance = 0;
        pin = "8888";
    }
    public BankAccount(double initialBalance, String inipin) {
        balance = initialBalance;
        pin = inipin;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount, String inpin) {
        if (inpin == pin) {
            balance+=amount;
        }
    }
    public void withdraw(double amount, String inpin) {
        if (inpin == pin) {
            balance-=amount;
        }
    }
}