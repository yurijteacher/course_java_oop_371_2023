package unit9.homework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Client {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    private List<Orders> ordersList;

    private List<Address> addressList;

    private User user;

}
