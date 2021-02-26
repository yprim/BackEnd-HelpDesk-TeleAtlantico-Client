package com.example.client.converter;

import com.example.client.model.Client;
import com.example.client.model.ClientDTO;
import org.springframework.stereotype.Service;


@Service
public class ClientConverter  {




    public ClientDTO Response(Client client) {

       ClientDTO clientDTO = new ClientDTO();
        clientDTO.setName(client.getName());
        clientDTO.setFirstSurname(client.getFirstSurname());
        clientDTO.setSecondSurname(client.getSecondSurname());
        clientDTO.setAddress(client.getAddress());
        clientDTO.setPhone(client.getPhone());
        clientDTO.setSecondContact(client.getSecondContact());
        clientDTO.setEmail(client.getEmail());
        clientDTO.setPassword(client.getPassword());
        clientDTO.setTelevision(client.getTelevision());
        clientDTO.setMobilePhone(client.getMobilePhone());
        clientDTO.setTelephone(client.getTelephone());
        clientDTO.setInternet(client.getInternet());
        clientDTO.setCreationDate(client.getCreationDate());
        clientDTO.setCreationUser(client.getCreationUser());
        clientDTO.setUpdateDate(client.getUpdateDate());
        clientDTO.setUpdateUser(client.getUpdateUser());

        return clientDTO;
    }


    public Client Request(ClientDTO dto) {
        return null;
    }


}
