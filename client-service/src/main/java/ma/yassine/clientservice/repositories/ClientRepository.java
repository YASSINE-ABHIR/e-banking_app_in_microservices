package ma.yassine.clientservice.repositories;

import ma.yassine.clientservice.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
