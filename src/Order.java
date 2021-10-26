public class Order {

    private ShoppingCart shoppingCart;
    private Customer customer;
    private PaymentIntf payment;

    public Order(ShoppingCart shoppingCart, Customer customer, PaymentIntf payment) {
        this.shoppingCart = shoppingCart;
        this.customer = customer;
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Order{" +
                "shoppingCart=" + shoppingCart +
                ", customer=" + customer +
                ", payment=" + payment +
                '}';
    }
}
