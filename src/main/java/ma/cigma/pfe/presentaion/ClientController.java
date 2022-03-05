package ma.cigma.pfe.presentaion;

import ma.cigma.pfe.dao.IClientDao;
import ma.cigma.pfe.models.Client;
import ma.cigma.pfe.service.ClientServiceImpl;
import ma.cigma.pfe.service.IClientService;

public class ClientController {

    public void setService(IClientService service) {
        this.service = service;
    }

    IClientService service ;

    public IClientService getService() {
        return service;
    }

    public void save(Client c){
        //  System.out.println("presentation layer level...");
        service.save(c);

    }

    public ClientController() {
        System.out.println("creation d'un objet client controller");;
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
