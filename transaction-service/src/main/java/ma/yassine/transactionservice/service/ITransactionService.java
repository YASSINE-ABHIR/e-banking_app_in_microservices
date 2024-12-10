package ma.yassine.transactionservice.service;

import ma.yassine.transactionservice.dtos.TransactionDTO;
import ma.yassine.transactionservice.entities.Transaction;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Set;

public interface ITransactionService {
    ResponseEntity<String> processTransaction(TransactionDTO transactionDTO);

    List<Transaction> getAllTransactions();

    Set<Transaction> getTransactionsByRib(Set<String> rib);

    Set<Transaction> getTransactionsByRib(String rib);

    void deleteTransactions(Set<String> ribs);
}
