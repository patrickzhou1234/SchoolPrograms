public class exercise3 {
    public static void main(String[] args) {
        BankAccount patrick = new BankAccount(1000, "1111");
        BankAccount myAcct = new BankAccount(0, "1111");
        patrick.deposit(1000, "1111");
        System.out.println("Patrick\'s balance is: "+patrick.getBalance());
        patrick.withdraw(1000, "1111");
        System.out.println("Patrick\'s balance is: "+patrick.getBalance());
    }
}