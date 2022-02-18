package dao;

import model.Client;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

@Repository
public class ClientdaoImpl implements Clientdao{
    @PersistenceContext
    EntityManager em;
    @Override

    public Client save(Client c) {


        em.persist(c);

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
