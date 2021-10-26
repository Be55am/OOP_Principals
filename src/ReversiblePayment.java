public class ReversiblePayment implements PaymentIntf {

    private final PaymentIntf payment;

    public ReversiblePayment(PaymentIntf payment) {
        this.payment = payment;
    }

    public void reverse(){
        payment.setValue( - getValue());
        execute();

    }

    @Override
    public void execute(){
        System.out.println("Execute reversible payment ");
        payment.execute();
    }

    @Override
    public int getValue(){
        return payment.getValue();
    }

    @Override
    public void setValue(int value){
        payment.setValue(value);
    }
}
