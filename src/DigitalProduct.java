public class DigitalProduct extends  Product{
    private String licence;

    public DigitalProduct(String name, int price, String licence) {
        super(name, price);
        this.licence = licence;
    }

    public String getLicence() {
        return licence;
    }

    @Override
    public PriceCalculator createPriceCalculator() {
        return new DigitalProductPriceCalculator(this);
    }
}
