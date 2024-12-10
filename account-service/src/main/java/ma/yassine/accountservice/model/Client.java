package ma.yassine.accountservice.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import ma.yassine.accountservice.enums.ClientType;

@Getter @Setter
@ToString
public class Client {
    private Long id;
    private String firstName;
    private String lastName;
    private ClientType clientType;
}
