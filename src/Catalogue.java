import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Catalogue {

    private static Map<String, Product> products = Map.of(
            "toothbrush",new PhysicalProduct("Tooth Brush", 100,10),
            "phone", new DigitalProduct("phone", 1000,"AZED DSDG DFGF GVCV")
    );

    public static Product getProduct(String productName){
        return products.get(productName);

    }



}
