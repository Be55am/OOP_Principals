public class Payment implements PaymentIntf {

    private PaymentMethod paymentMethod;
    private int value;
    private String transactionId;

    public Payment(PaymentMethod paymentMethod, int value, String transactionId) {
        this.paymentMethod = paymentMethod;
        this.value = value;
        this.transactionId = transactionId;
    }

    @Override
    public void execute(){
        System.out.println("Executing payment "+ value);
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "payementMethod=" + paymentMethod +
                ", value=" + value +
                ", transactionId='" + transactionId + '\'' +
                '}';
    }
}
