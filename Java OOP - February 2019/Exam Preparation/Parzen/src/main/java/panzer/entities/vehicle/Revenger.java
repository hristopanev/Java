package panzer.entities.vehicle;

import java.math.BigDecimal;

public class Revenger extends BaseVehicle {
    private String model;

    public Revenger(String model, double weight, BigDecimal price, int attack, int defense, int hitPoints) {
        super(model, weight, price.multiply(new BigDecimal(1.50)),
                (int) (attack * 2.50), (int) (defense * 0.5), (int) (hitPoints * 0.5));
    }
}
