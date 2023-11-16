package unit9.association.many_to_many.v2;

import lombok.Data;

@Data
public class RolesHasUsers {

    private Long id;
    private Client client;
    private Role role;
}
