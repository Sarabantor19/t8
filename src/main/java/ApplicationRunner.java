import ma.cigma.pfe.models.Client;
import ma.cigma.pfe.models.Facture;
import ma.cigma.pfe.presentaion.ClientController;
import ma.cigma.pfe.presentaion.FactureController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;

import java.util.List;

public class ApplicationRunner {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");



        ClientController ctrl = (ClientController) context.getBean("idctrl");
        Client clientForm=new Client("sara");
 /*
        ctrl.save(clientForm);

        // Test save use case for three clients
        ctrl.save(new Client("OMAR"));
        ctrl.save(new Client("SIHAM"));
        ctrl.save(new Client("AHMED"));
        ctrl.save(new Client("SARAH"));

        ctrl.modify(new Client(1,"new Name"));

        ctrl.removeById(1L);
        Client found = ctrl.getById(1L);

*/

        // facture

        FactureController ctrlF = (FactureController) context.getBean("controllerFacture");

        // Test save use case for two factures
        ctrlF.save(new Facture ( new Date(System.currentTimeMillis()), 1600.00));

        ctrlF.save(new Facture(new Date(2020, 04,17), 800.88));
        ctrlF.save(new Facture(new Date(2021, 04,17), 100.00));
        ctrlF.save(new Facture(new Date(2022, 04,17), 200.00));
        ctrlF.save(new Facture(new Date(2022, 05,22), 999.99));

        // Test modify use case for facture with id==1
        ctrlF.modify(new Facture(2L, new Date(System.currentTimeMillis()),2344.00));

        // Test remove use case for facture with id==1
        ctrlF.removeById(3L);
        // please note that I did some tests on the database
        // please note that I did some tests on the database

        // Test find use case for facture with id==1
        Facture foundF = ctrlF.getById(1L);

        // Test get all factures
        List<Facture> factureList = ctrlF.getAll();


    }
}
