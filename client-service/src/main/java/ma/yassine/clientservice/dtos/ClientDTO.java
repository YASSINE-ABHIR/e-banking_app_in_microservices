package ma.yassine.clientservice.dtos;

import lombok.Getter;
import lombok.Setter;
import ma.yassine.clientservice.enums.ClientType;

@Getter @Setter
public class ClientDTO {
    private String firstName;
    private String lastName;
    private ClientType clientType;
}
