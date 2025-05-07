package org.example.controllers;

import org.example.entities.Client;
import org.example.persistence.ClientJPA;

import java.util.List;

public class ClientController {

    private ClientJPA clientJPA = new ClientJPA();



    public List<Client> findAll() {
        return clientJPA.findAll();
    }

    public void create(Client nuevoCliente) {
        clientJPA.create(nuevoCliente);
    }

    public List<Client> findCity (String ciudad){
        return clientJPA.buscarCiudad(ciudad);
}

    public void update(Client actualizarDatos) {
        clientJPA.update(actualizarDatos);
    }

    public void delete(Integer idEliminar) {
        clientJPA.delete(idEliminar);
    }


    public Client findOne(Integer idBuscado) {
        return clientJPA.finOne(idBuscado);
    }


}
