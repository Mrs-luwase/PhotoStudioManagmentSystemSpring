package rw.ac.auca.PhotoStudioManagmentSystemSpring.client.service;

import rw.ac.auca.PhotoStudioManagmentSystemSpring.client.domain.Client;
import java.util.List;
import java.util.UUID;

public interface ClientService {

    Client registerClient(Client theClient);

    Client updateClient(UUID id, Client theClient);

    void deleteClient(UUID id);

    Client findClientById(UUID id);
    List<Client> findAllClients();
}
