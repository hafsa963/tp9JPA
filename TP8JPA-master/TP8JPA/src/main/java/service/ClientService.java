package service;


import model.Client;

public interface ClientService {

    Client save(Client c);
    Client modify(Client c);
    void removeById(long id);
    Client getById(long id);
}