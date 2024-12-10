package ma.yassine.clientservice.business;

import org.springframework.http.ResponseEntity;

public interface IClientBusiness {
    ResponseEntity<String> deleteAccountByClientId(Long id);
}
