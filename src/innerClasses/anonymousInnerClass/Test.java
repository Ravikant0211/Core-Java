package innerClasses.anonymousInnerClass;

public class Test {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(150);
//        CreditCardV0 creditCard = new CreditCardV0("1234567890");

        cart.processPayment(new Payment() {
            @Override
            public void pay(double amount) {
                System.out.println("Paid " + amount + " using credit card.");
            }
        });
    }
}
