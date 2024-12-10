package ma.yassine.accountservice.mappers;

import ma.yassine.accountservice.dtos.AccountDTO;
import ma.yassine.accountservice.entities.Account;

import java.util.List;

public interface IMapper {
    AccountDTO accountToAccountDTO(Account account);

    List<AccountDTO> accountsToAccountDTOs(List<Account> accounts);

}
