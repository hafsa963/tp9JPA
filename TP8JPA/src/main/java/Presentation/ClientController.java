package Presentation;

import model.Client;
import service.ClientService;

public class ClientController {
    ClientService service;

    public void setService(ClientService service) {
        this.service = service;
    }

    public ClientService getService() {
        return service;
    }


    public void save(Client c) {
        service.save(c);


    }
    public void modify(Client c){
        service.modify(c);
    }
    public void removeById(long id){
        service.removeById(id);
    }
    public Client getById(long id){
        return service.getById(id);
    }

}
