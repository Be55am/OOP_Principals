import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Customer {

    private String name;
    private Map<String, PaymentMethod> paymentMethods = new HashMap();

    public Customer(String name){
        this.name = name;
    }
    public void addPaymentMethod(PaymentMethod paymentMethod, String paymentMethodName){
        paymentMethods.put(paymentMethodName, paymentMethod);
    }

    public Optional<Order> checkout(ShoppingCart shoppingCart, String paymentMethodName){
        Optional<PaymentMethod> paymentMethod = Optional.ofNullable(paymentMethods.get(paymentMethodName));
        Optional<Payment> payment = paymentMethod.flatMap(pm -> pm.mkPayment(shoppingCart.getTotalCost()));

        return payment.map(value -> new Order(shoppingCart, this, value));
    }

    public  int calculateDiscount(){
        return 0;
    };

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", paymentMethod=" + paymentMethods +
                '}';
    }
}
