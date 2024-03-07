package unit11.creational.builder;

public class Car {

    private String name;

    private Manufacture manufacture;

    private Engine engine;

    private Transmission transmission;

    private SizeCar sizeCar;

    private RoadType roadType;

    public Car() {
    }

    public Car(String name, Manufacture manufacture, Engine engine, Transmission transmission, SizeCar sizeCar, RoadType roadType) {
        this.name = name;
        this.manufacture = manufacture;
        this.engine = engine;
        this.transmission = transmission;
        this.sizeCar = sizeCar;
        this.roadType = roadType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manufacture getManufacture() {
        return manufacture;
    }

    public void setManufacture(Manufacture manufacture) {
        this.manufacture = manufacture;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public SizeCar getSizeCar() {
        return sizeCar;
    }

    public void setSizeCar(SizeCar sizeCar) {
        this.sizeCar = sizeCar;
    }

    public RoadType getRoadType() {
        return roadType;
    }

    public void setRoadType(RoadType roadType) {
        this.roadType = roadType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", manufacture=" + manufacture +
                ", engine=" + engine +
                ", transmission=" + transmission +
                ", sizeCar=" + sizeCar +
                ", roadType=" + roadType +
                '}';
    }
}
