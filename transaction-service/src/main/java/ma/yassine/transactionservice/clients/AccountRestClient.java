package ma.yassine.transactionservice.clients;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import ma.yassine.transactionservice.dtos.TransactionAccountsBalanceDTO;
import ma.yassine.transactionservice.dtos.TransactionAccountsRibDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name = "ACCOUNT-SERVICE")
public interface AccountRestClient {

    @PostMapping("/accounts/transaction")
    @CircuitBreaker(name = "accountService", fallbackMethod = "getDefaultTransaction")
    ResponseEntity<String> makeTransaction(@RequestHeader("Authorization") String token, @RequestBody TransactionAccountsRibDTO dto,@RequestParam double amount);

    default ResponseEntity<String> getDefaultTransaction(String token, TransactionAccountsRibDTO dto, double amount, Exception e) {
        return ResponseEntity.badRequest().body("Transaction failed!");
    }

}
