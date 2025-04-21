package exceptionHandling;

public class Test5 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(10);
        try {
            bankAccount.withdraw(15);
        } catch (InsufficientFundsException e) {
            System.out.println(e);
        }
    }
}
