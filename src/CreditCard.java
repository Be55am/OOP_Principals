import java.util.Optional;
import java.util.UUID;

public class CreditCard implements PaymentMethod {

    private String name;
    private final long number;

    public CreditCard(String name, long number) {
        this.name = name;
        this.number = number;
    }


    public Optional<Payment> mkPayment(int price){
        if(Math.random() > 0.3)
            return Optional.of(new Payment(this,price, UUID.randomUUID().toString()));
        else
            return Optional.empty();
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "name=" + name +
                "number=" + number +
                '}';
    }
}
