package unit9.association.one_to_many;

import lombok.Data;
import java.util.List;

@Data
public class Product {


    private Integer id;
    private String name;
    private String description;
    private List<String> images;

    private Category category;


}
