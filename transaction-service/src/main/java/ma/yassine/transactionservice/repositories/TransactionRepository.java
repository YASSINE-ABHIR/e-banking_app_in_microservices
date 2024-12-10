package ma.yassine.transactionservice.repositories;

import ma.yassine.transactionservice.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Set;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    @Query("SELECT t FROM Transaction t WHERE t.ribReceiver IN :ribs OR t.ribSender IN :ribs ORDER BY t.date")
    Set<Transaction> findByRibs(Set<String> ribs);

    @Query("SELECT t FROM Transaction t WHERE t.ribReceiver = :rib OR t.ribSender = :rib ORDER BY t.date")
    Set<Transaction> findByRib(String rib);
}
