package unit9.association.one_to_many;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Client {

    private Long id;
    private String fullName;
    private String email;
    private String phone;

    private List<Orders> ordersList;



}
