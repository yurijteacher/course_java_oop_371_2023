package unit9.aggregation.v1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Engine engine = new Engine(1L, "engine","asdas");

        Car seat2000 = new Car();
        seat2000.setEngine(engine);

        Car seat3000 = new Car();
        seat3000.setEngine(engine);

        List<Car> cars = new ArrayList<>();
        cars.add(seat2000);
        cars.add(seat3000);

        System.out.println(cars);

        Engine engine2 = new Engine(2L, "engine2","3000");

        seat3000.setEngine(engine2);
        seat2000.setEngine(engine);
    }
}
