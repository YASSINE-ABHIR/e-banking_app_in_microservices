package ma.yassine.clientservice.business;

import lombok.AllArgsConstructor;
import ma.yassine.clientservice.clients.AccountRestClient;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ClientBusiness implements IClientBusiness {
    private final AccountRestClient accountRestClient;

    private String getToken(){
        Jwt jwt = (Jwt) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return "Bearer " + jwt.getTokenValue();
    }

    @Override
    public ResponseEntity<String> deleteAccountByClientId(Long id) {
        String token = getToken();
        return accountRestClient.deleteAccountByClientId(token, id);
    }
}
