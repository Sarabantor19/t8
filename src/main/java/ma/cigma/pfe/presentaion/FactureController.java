package ma.cigma.pfe.presentaion;

import ma.cigma.pfe.models.Client;
import ma.cigma.pfe.models.Facture;
import ma.cigma.pfe.service.IClientService;
import ma.cigma.pfe.service.IFactureService;

import java.util.List;

public class FactureController {
    IFactureService serviceFDI ;

    public FactureController() {
        System.out.println("creation d'un objet facture controller");;
    }

    public FactureController(IFactureService factureService) {
        System.out.println("Call FactureController ...");
        this.serviceFDI = factureService;
    }
    public void setFactureService(IFactureService factureService)
    {
        this.serviceFDI = factureService;
    }

    public IFactureService getFactureService()
    {
        return serviceFDI;
    }



    public void save(Facture f)
    {
         System.out.println("presentation layer level...");
        serviceFDI.save(f);

    }


    public void modify(Facture newFacture)
    {
        serviceFDI.modify(newFacture);
    }
    public void removeById(long id)
    {
        serviceFDI.removeById(id);
    }
    public Facture getById(long id)
    {
        return serviceFDI.getById(id);
    }

    public List<Facture> getAll()
    {
        return serviceFDI.getAll();
    }
}
