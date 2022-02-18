package service;

import dao.Clientdao;
import dao.ClientdaoImpl;
import model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional

public class ClientServiceImpl implements ClientService{
    @Autowired
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
