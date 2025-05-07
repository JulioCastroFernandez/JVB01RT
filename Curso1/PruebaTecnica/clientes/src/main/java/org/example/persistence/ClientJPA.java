package org.example.persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceException;
import jakarta.persistence.TypedQuery;
import org.example.entities.Client;

import java.util.Collections;
import java.util.List;

public class ClientJPA {


    public List<Client> findAll() {
        EntityManager em = ConfigJPA.getEntityManager();

        try {
            // Aqui quiero conectarme a la BD y hacer una consulta SQL
            TypedQuery<Client> query = em.createQuery("SELECT c FROM clientes c", Client.class);
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    public void create(Client nuevoCliente) {
        EntityManager em = ConfigJPA.getEntityManager();
//Con esto hago que los datos que le mandemos a la BD persistan y se guarden
        try {
            em.getTransaction().begin(); //Aqui se inicia el proceso de guardado
            em.persist(nuevoCliente);      //Le indicio que esto es lo que quiero que se guarde
            em.getTransaction().commit(); //Aqui finaliza y guarda los datos
        } finally {
            em.close(); //Cierro el EntityManager

        }
    }

    public List<Client> buscarCiudad(String ciudad) {
        EntityManager em = ConfigJPA.getEntityManager();

        try {
            TypedQuery<Client> query = em.createQuery("SELECT c FROM clientes c WHERE c.ciudad = :ciudad", Client.class);
            query.setParameter("ciudad", ciudad);
            return query.getResultList();
        } finally {
            em.close();

        }
    }

    public void update (Client actualizarDatos){
        EntityManager em = ConfigJPA.getEntityManager();
        try {
            em.getTransaction().begin(); //Le pido que inicie el proceso de actualizado
            em.merge(actualizarDatos);    // aqui se actualiza
            em.getTransaction().commit(); // Aqui guarda los datos actualizados
        }catch (PersistenceException e){
            if(em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
            System.out.println("Error al actualizar el cliente: " + e.getMessage());

        }finally {
            em.close();
        }

    }

    public Client finOne(Integer idBuscado) {
        EntityManager em = ConfigJPA.getEntityManager();

        try {
            return em.find(Client.class, idBuscado);
        }finally {
            em.close();
        }
    }

    public void delete(Integer idEliminar) {
        EntityManager em = ConfigJPA.getEntityManager();

        try {
        em.getTransaction().begin(); //que se inicie el proceso de eliminado
        Client clienteEncontrado = em.find(Client.class, idEliminar);
        if (clienteEncontrado != null){
            em.remove(clienteEncontrado);
        }else{
            System.out.println("El id " + idEliminar + "no existe");
        }
        em.getTransaction().commit(); //se ejecuta la eliminacion
        }finally {
            em.close();

        }
    }
}

