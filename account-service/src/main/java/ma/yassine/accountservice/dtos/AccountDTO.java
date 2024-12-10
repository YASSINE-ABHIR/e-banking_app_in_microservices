package ma.yassine.accountservice.dtos;

import lombok.Getter;
import lombok.Setter;
import ma.yassine.accountservice.enums.AccountType;
import ma.yassine.accountservice.model.Client;

import java.util.UUID;

@Getter @Setter
public class AccountDTO {
    private UUID id;
    private Double balance;
    private AccountType accountType;
    private String currency;
    private String rib;
    private Client customerInfo;
}
