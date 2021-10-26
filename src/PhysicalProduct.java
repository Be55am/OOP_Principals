public class PhysicalProduct extends Product{

    private int weight;

    public PhysicalProduct(String name, int price, int weight) {
        super(name, price);
        this.weight = weight;
    }

    public int calculateShippingCost(){
        return weight * 5;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public PriceCalculator createPriceCalculator() {
        return new PhysicalProductPriceCalculator(this);
    }
}
