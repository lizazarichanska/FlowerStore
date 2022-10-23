package flower.store;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FlowerPack {
    private Flower flower;
    private int quantity;

    public double getPrice() {
        return flower.getPrice() * quantity;
    }
}
