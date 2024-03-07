package unit11.structural.bridge.road_type;

import unit11.structural.bridge.maker.Maker;

public class Sport extends Car{
    public Sport(Maker maker) {
        super(maker);
    }

    @Override
    public void carDetails() {
        maker.setMaker();
        System.out.println("Sport Car!!");
    }
}
