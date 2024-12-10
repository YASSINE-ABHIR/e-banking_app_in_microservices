package ma.yassine.clientservice.service;

import ma.yassine.clientservice.dtos.ClientDTO;
import ma.yassine.clientservice.entities.Client;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IClientService {
    Client getClientById(Long id);

    List<Client> getAllClients();

    @Transactional
    Client addClient(ClientDTO dto);

    @Transactional
    Client updateClientById(Long id, ClientDTO dto);

    @Transactional
    ResponseEntity<String> deleteClientById(Long id);
}
