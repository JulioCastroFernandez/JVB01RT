package org.example.persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ConfigJPA {  // Esto es una clase utilitaria

    //Creo la configuracion de persistencia de la BD
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("clientPU");

    public static EntityManager getEntityManager(){
        return emf.createEntityManager();
    }

    public static void close(){
        emf.close();
    }
}
