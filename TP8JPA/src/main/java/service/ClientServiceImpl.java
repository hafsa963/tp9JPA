package service;

import dao.Clientdao;
import dao.ClientdaoImpl;
import model.Client;

public class ClientServiceImpl implements ClientService{
    Clientdao dao ;

    public void setDao(Clientdao dao) {
        this.dao = dao;
    }

    public Clientdao getDao() {
        return dao;
    }

    @Override
    public Client save(Client c) {


        return  dao.save(c);
    }

    public Client modify(Client c) {
        return dao.update(c);
    }

    @Override
    public void removeById(long id) {
        dao.deleteById(id);

    }
    @Override
    public Client getById(long id) {
        return dao.findById(id);
    }
}
