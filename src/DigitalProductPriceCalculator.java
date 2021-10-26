public class DigitalProductPriceCalculator implements PriceCalculator{

    private final DigitalProduct digitalProduct;


    public DigitalProductPriceCalculator(DigitalProduct digitalProduct) {
        this.digitalProduct = digitalProduct;
    }

    @Override
    public int calculatePrice(int quantity) {
        return digitalProduct.getPrice() * quantity;
    }
}
