public class NonProfitCustomer extends Customer{

    public NonProfitCustomer(String name) {
        super(name);
    }


    @Override
    public int calculateDiscount() {
        return 0;
    }
}
