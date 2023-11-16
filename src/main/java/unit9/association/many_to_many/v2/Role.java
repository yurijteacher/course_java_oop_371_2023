package unit9.association.many_to_many.v2;

import lombok.Data;

import java.util.List;

@Data
public class Role {

    private Long id;
    private String name;

    private List<RolesHasUsers> rolesHasUser;

}
