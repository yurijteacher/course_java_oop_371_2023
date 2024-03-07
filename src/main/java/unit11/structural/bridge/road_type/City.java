package unit11.structural.bridge.road_type;

import unit11.structural.bridge.maker.Maker;

public class City extends Car{

    public City(Maker maker) {
        super(maker);
    }

    @Override
    public void carDetails() {
       maker.setMaker();
        System.out.println("city car!!");
    }
}
