import java.util.Optional;
import java.util.UUID;

public class BankAccount implements PaymentMethod{
    private String bankName;
    private int bANumber;


    public BankAccount(String bankName, int bANumber) {
        this.bankName = bankName;
        this.bANumber = bANumber;
    }

    @Override
    public Optional<Payment> mkPayment(int value) {
        if(Math.random() > 0.4)
            return Optional.of(new Payment(this,value, UUID.randomUUID().toString()));
        else
            return Optional.empty();
    }


    @Override
    public String toString() {
        return "BankAccount{" +
                "bankName='" + bankName + '\'' +
                ", bANumber=" + bANumber +
                '}';
    }
}
