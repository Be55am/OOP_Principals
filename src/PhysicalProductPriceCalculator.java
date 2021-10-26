public class PhysicalProductPriceCalculator implements PriceCalculator{

    private final PhysicalProduct product;

    public PhysicalProductPriceCalculator(PhysicalProduct product) {
        this.product = product;
    }

    @Override
    public int calculatePrice(int quantity) {
        return product.getPrice()  * quantity + product.getWeight() * 10;
    }
}
