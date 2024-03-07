package unit11.creational.builder;

public class BuilderCar {

    private String name = "def";

    private Manufacture manufacture = Manufacture.bmw;

    private Engine engine = Engine.l2000;

    private Transmission transmission = Transmission.auto;

    private SizeCar sizeCar = SizeCar.s2500;

    private RoadType roadType = RoadType.city;

    BuilderCar builderManufacture(Manufacture manufacture){
        this.manufacture = manufacture;
        return this;
    }

    BuilderCar builderEngine(Engine engine){
        this.engine = engine;
        return this;
    }

    BuilderCar builderRT(RoadType roadType){
        this.roadType = roadType;
        return this;
    }

    BuilderCar builderSizeCar(SizeCar sizeCar){
        this.sizeCar = sizeCar;
        return this;
    }

    BuilderCar builderT(Transmission transmission){
        this.transmission = transmission;
        return this;
    }

    public Car builder(){
        Car car = new Car();
        car.setEngine(engine);
        car.setManufacture(manufacture);
        car.setSizeCar(sizeCar);
        car.setTransmission(transmission);
        car.setRoadType(roadType);
        car.setName(name);

        return  car;
    }

}
