package com.example.client.controller;

import com.example.client.converter.ClientConverter;
import com.example.client.converter.IssueConverter;
import com.example.client.model.Client;
import com.example.client.model.ClientDTO;
import com.example.client.model.Issue;
import com.example.client.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(path = "/api/client")
@RestController
public class ClientController {


    @Autowired
    private ClientService service;
    private RestTemplate restTemplate = new RestTemplate();
    private ClientConverter clientConverter = new ClientConverter();

    @GetMapping("/clients")
    public List<Client> list() {
        return service.listAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> getById(@PathVariable Integer id){
        try {
            Client client = service.get(id);
            return new ResponseEntity<Client>(client, HttpStatus.OK);
        }catch(NoSuchElementException e){
            return new ResponseEntity<Client>(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public Client SelectClientByEmail(@RequestBody Client client)
    {
        return service.SelectClientByEmail(client);
    }

    @RequestMapping(path = "/add", method = RequestMethod.POST)
    public int add(@RequestBody Client client) {
        try {
            service.save(client);
            ClientDTO clientDTO= clientConverter.Response(client);
            ResponseEntity<ClientDTO> response=restTemplate.postForEntity("http://localhost:53802/api/Client",clientDTO, ClientDTO.class);

            return 1;
        } catch (NoSuchElementException  e) {
            return 0;
        }
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }






}
