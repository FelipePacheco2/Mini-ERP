package FakeDB;

import java.util.ArrayList;

import dominio.clients.Buyer;
import dominio.clients.Client;
import dominio.clients.Company;
import dominio.phone.TypePhone;

public class ClientDB extends AbsFakeDB<Buyer>{
    private TypePhone addPhone;

    @Override
    protected void AllFill() {
        if(this.instance == null){
            this.instance = new ArrayList<>(); //  verifica e cria a lista para que ela seja preenchida com dados. 
        }

        TypePhone addPhone = new TypePhone();
        Client naturalPerson = new Client
        (
            1, "João Silva", "111.111.111-11", "joao@email.com", 
            "1234-5678-9012"
        );

        naturalPerson.addPhone("6799999-3232", TypePhone.Celular); 
        this.instance.add(naturalPerson);
        

        Company physicalPerson = new Company
        ( 
            2, "Tech Soluções Ltda", "Tech Solutions", "00.000.000/0001-00"
        );

        physicalPerson.addPhone("6799999-3232", TypePhone.Celular); 
        this.instance.add(physicalPerson);

    }
    
}
