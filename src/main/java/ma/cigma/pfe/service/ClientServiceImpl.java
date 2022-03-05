package ma.cigma.pfe.service;

import ma.cigma.pfe.dao.ClientDaoImpl;
import ma.cigma.pfe.dao.IClientDao;
import ma.cigma.pfe.models.Client;

public class ClientServiceImpl implements IClientService{
    IClientDao dao ;



    public ClientServiceImpl(IClientDao dao) {
        this.dao = dao;
    }

    public void setDao(IClientDao dao) {
        this.dao = dao;
    }

    @Override
    public boolean save(Client c) {
      //  System.out.println(" service layer level ...");
        return dao.save(c);
    }



    public ClientServiceImpl() {

        System.out.println("creation d'un objet clientserviceimpl");  ;
    }
    @Override
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
