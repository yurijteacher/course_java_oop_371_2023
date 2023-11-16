package unit9.homework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Orders {

    private Long id;
    private Date dateCreated;
    private Client client;

    private List<ProductsHasOrders> productsHasOrdersLista;

}
