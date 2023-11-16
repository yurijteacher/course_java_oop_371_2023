package unit9.association.one_to_many;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Category {

    private Integer id;
    private String name;
    private String description;

    private List<Product> products;


}
