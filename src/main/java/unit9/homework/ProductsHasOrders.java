package unit9.homework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class ProductsHasOrders {

    private Long id;
    private Product product;
    private Orders order;
    private int quantity;

}
