package rw.ac.auca.PhotoStudioManagmentSystemSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import rw.ac.auca.PhotoStudioManagmentSystemSpring.client.service.*;
import rw.ac.auca.PhotoStudioManagmentSystemSpring.client.domain.*;


import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/search-all")
    @ResponseStatus(HttpStatus.OK)
    public List<Client> findAllRecords() {
        return clientService.findAllClients();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Client findById(@PathVariable UUID id) {
        return clientService.findClientById(id);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.OK)
    public Client createClient(@RequestBody Client theClient) {
        return clientService.registerClient(theClient);
    }

    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Client updateClient(@PathVariable UUID id, @RequestBody Client theClient) {
        return clientService.updateClient(id, theClient);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteClient(@PathVariable UUID id) {
        clientService.deleteClient(id);
    }
}
