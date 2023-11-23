package unit10.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Users {

    private Long id;
    private String username;
    private String password;

    private List<RolesHasUsers> rolesHasUsersLists;

    private Customers customer;
}
