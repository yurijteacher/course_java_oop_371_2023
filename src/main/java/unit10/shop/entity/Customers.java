package unit10.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Customers {

    private Long id;
    private String firstName;
    private String lastName;

    private int age;

    private String phone;
    private String email;

    private List<Address> addressList;

    private List<Images> images;

    private Users user;

    private List<Orders> orders;

}
