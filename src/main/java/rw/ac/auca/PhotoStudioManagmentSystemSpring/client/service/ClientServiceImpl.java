package rw.ac.auca.PhotoStudioManagmentSystemSpring.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rw.ac.auca.PhotoStudioManagmentSystemSpring.client.domain.Client;
import rw.ac.auca.PhotoStudioManagmentSystemSpring.client.repository.ClientRepository;

import java.util.List;
import java.util.UUID;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Client registerClient(Client theClient) {
        return clientRepository.save(theClient);
    }

    @Override
    public Client updateClient(UUID id, Client theClient) {
        Client found = findClientById(id);
        found.setFullName(theClient.getFullName());
        found.setPhoneNumber(theClient.getPhoneNumber());
        return clientRepository.save(found);
    }

    @Override
    public void deleteClient(UUID id) {
        clientRepository.delete(findClientById(id));
    }

    @Override
    public Client findClientById(UUID id) {
        return clientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Client not found!"));
    }

    @Override
    public List<Client> findAllClients() {
        return clientRepository.findAll();
    }
}
