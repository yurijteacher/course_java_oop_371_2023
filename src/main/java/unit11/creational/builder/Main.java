package unit11.creational.builder;

public class Main {

    public static void main(String[] args) {

        BuilderCar builderCar = new BuilderCar();
        builderCar.builderSizeCar(SizeCar.s2500);
        Car car = builderCar.builder();


        Car car1 = new BuilderCar()
                .builderEngine(Engine.l2000)
                .builderSizeCar(SizeCar.s4000)
                .builderT(Transmission.manual)
                .builderManufacture(Manufacture.seat)
                .builder();



    }

}
