package unit9.aggregation.v1;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Car {

    private Long id;
    private String name;

    private Engine engine;
    public Car() {
        engine = new Engine(1L, "Honda", "2000");
    }
}
