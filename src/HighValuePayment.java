public class HighValuePayment implements PaymentIntf{

    private final PaymentIntf payment;

    public HighValuePayment(PaymentIntf payment) {
        this.payment = payment;
    }

    @Override
    public int getValue() {
        return payment.getValue();
    }

    @Override
    public void setValue(int value) {
        payment.setValue(value);
    }

    @Override
    public void execute() {
        System.out.println("Executing highValue payment " + payment.getValue());
        payment.execute();
    }
}
