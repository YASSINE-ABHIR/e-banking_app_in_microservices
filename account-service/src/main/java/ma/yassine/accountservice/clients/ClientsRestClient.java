package ma.yassine.accountservice.clients;

import ma.yassine.accountservice.model.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;

@FeignClient(name = "client-service")
public interface ClientsRestClient {

    @GetMapping("/clients/{id}")
    @CircuitBreaker(name = "clientService", fallbackMethod = "getDefaultClient")
    ResponseEntity<Client> getClient(@RequestHeader("Authorization") String token, @PathVariable Long id);

    @GetMapping("/clients")
    @CircuitBreaker(name = "clientService", fallbackMethod = "getDefaultClients")
    ResponseEntity<List<Client>> getClients(@RequestHeader("Authorization") String token);

    default ResponseEntity<Client> getDefaultClient(String token, Long id, Exception e) {
        Client customer = new Client();
        customer.setId(id);
        customer.setFirstName("Not available");
        customer.setLastName("Not available");
        customer.setClientType(null);
        return ResponseEntity.ok(customer);
    }

    default ResponseEntity<List<Client>> getDefaultClients(String token, Exception e) {
        System.err.println("CLIENT SERVICE NOT AVAILABLE");
        return ResponseEntity.noContent().build();
    }
}
