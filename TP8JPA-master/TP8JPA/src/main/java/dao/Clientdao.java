package dao;

import model.Client;

public interface Clientdao {
    Client save(Client c);
    Client update(Client c);
    void deleteById(long idClient);
    Client findById(long idClient);
}
