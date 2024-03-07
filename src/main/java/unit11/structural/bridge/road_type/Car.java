package unit11.structural.bridge.road_type;

import unit11.structural.bridge.maker.Maker;

public abstract class Car {

    Maker maker;

    public Car(Maker maker) {
        this.maker = maker;
    }


     public abstract void carDetails();
}
