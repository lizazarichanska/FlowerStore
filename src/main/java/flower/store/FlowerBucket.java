package flower.store;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    private List<FlowerPack> pack = new ArrayList<FlowerPack>();

    public void add(FlowerPack flowerPack) {
        pack.add(flowerPack);
    }

    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack : pack) {
            price += flowerPack.getPrice();
        }
        return price;
    }
}