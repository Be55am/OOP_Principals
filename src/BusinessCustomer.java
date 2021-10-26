public class BusinessCustomer  extends Customer{

    public BusinessCustomer(String name) {
        super(name);
    }

    @Override
    public int calculateDiscount() {
        return 2;
    }
}
