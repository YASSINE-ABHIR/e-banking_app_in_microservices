package ma.yassine.clientservice.mappers;

import ma.yassine.clientservice.dtos.ClientDTO;
import ma.yassine.clientservice.entities.Client;

public interface IClientMapper {
    Client convertNewClientDtoToClient(ClientDTO dto);
}
