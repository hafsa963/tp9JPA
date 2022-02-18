package dao;

import model.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClientdaoImpl implements Clientdao{
    EntityManagerFactory emf= Persistence.createEntityManagerFactory("unit_clients");
    EntityManager em=emf.createEntityManager();
    @Override
    public Client save(Client c) {

        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();


        return c;
    }

    @Override
    public Client update(Client c) {

        return c;
    }

    @Override
    public void deleteById(long idClient) {
        em.getTransaction().begin();
        Client clientInDataBase = em.find(Client.class,idClient);
        em.remove(clientInDataBase);
        em.getTransaction().commit();
    }
    @Override
    public Client findById(long idClient) {
        return em.find(Client.class,idClient);
    }
}
