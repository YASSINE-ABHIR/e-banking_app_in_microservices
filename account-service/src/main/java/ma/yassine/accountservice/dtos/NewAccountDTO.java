package ma.yassine.accountservice.dtos;

import lombok.Getter;
import lombok.Setter;
import ma.yassine.accountservice.enums.AccountType;

import java.util.UUID;

@Getter @Setter
public class NewAccountDTO {
    private Double balance;
    private AccountType accountType;
    private String currency;
    private Long clientId;
}
