package ma.yassine.accountservice.mappers;

import lombok.AllArgsConstructor;
import ma.yassine.accountservice.dtos.AccountDTO;
import ma.yassine.accountservice.entities.Account;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class Mapper implements IMapper {
    private final ModelMapper modelMapper;

    @Override
    public AccountDTO accountToAccountDTO(Account account) {
        return modelMapper.map(account, AccountDTO.class);
    }

    @Override
    public List<AccountDTO> accountsToAccountDTOs(List<Account> accounts) {
        return accounts.stream().map(account -> modelMapper.map(account, AccountDTO.class)).toList();
    }

}
