import java.util.Optional;
import java.util.UUID;

public class Demo {

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product toothbrush = Catalogue.getProduct("toothbrush");

        shoppingCart.addLineItem(new LineItem(toothbrush, 3));
        shoppingCart.addLineItem(new LineItem(Catalogue.getProduct("phone"), 1));

        System.out.println(shoppingCart);
        System.out.println(shoppingCart.getTotalCost());

        Customer customer = new NonProfitCustomer("customer");
        customer.addPaymentMethod(new CreditCard("paysera", 12345), "paysera");
        customer.addPaymentMethod(new BankAccount("BNA", 44444344), "BNA");

        System.out.println("discount: " + customer.calculateDiscount());
        Optional<Order> order = customer.checkout(shoppingCart, "BNA");

        System.out.println(order);

        PaymentMethod paymentMethod = new BankAccount("Bank of algeria", 1234589);
        //Decorator Pattern
        PaymentIntf payment = new Payment(paymentMethod, 100, UUID.randomUUID().toString());
        PaymentIntf highValuePayment = new HighValuePayment(payment);
        ReversiblePayment reversibleHighValuePayment = new ReversiblePayment(highValuePayment);
        reversibleHighValuePayment.reverse();
    }
}
