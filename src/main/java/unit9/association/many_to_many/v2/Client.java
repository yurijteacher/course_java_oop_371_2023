package unit9.association.many_to_many.v2;

import lombok.Data;

import java.util.List;

@Data
public class Client {

    private Long id;
    private String fullName;

    private List<RolesHasUsers> rolesHasUsers;
}
