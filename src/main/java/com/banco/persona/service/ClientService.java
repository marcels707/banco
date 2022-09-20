package com.banco.persona.service;

import com.banco.persona.model.Client;
import com.banco.persona.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public List<Client> listAllClients() {
        return clientRepository.findAll();
    }

    public void saveClient(Client cliente) {
        clientRepository.save(cliente);
    }

    public Client getClient(Integer id) {
        return clientRepository.findById(id).get();
    }

    public void deleteClient(Integer id) {
        clientRepository.deleteById(id);
    }
}
