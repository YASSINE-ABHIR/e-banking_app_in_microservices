package ma.yassine.accountservice.business;

import ma.yassine.accountservice.entities.Account;

public interface IBusinessAccount {
    String generateBankIdentityStatement();

    Account addClientInfo(Account account);

    Account debit(Account account, double amount);

    Account credit(Account account, double amount);
}
