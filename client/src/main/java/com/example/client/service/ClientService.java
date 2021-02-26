package com.example.client.service;

import com.example.client.model.Client;
import com.example.client.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class ClientService {

    @Autowired
    private ClientRepository repository;

    

    public List<Client> listAll(){return repository.findAll();}
    public void save(Client client){
        repository.save(client);
    }
    public Client get (int id){ return repository.findById(id).get();}
    public void delete(int id){repository.deleteById(id);}

    public Client SelectClientByEmail(Client client) {
        return repository.SelectClientByEmail(client.getEmail(),client.getPassword());
    }
}
