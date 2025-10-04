package FakeDB;

import java.util.ArrayList;

import dominio.employee.Collaborator;
import dominio.employee.Role;

public class ColllaboratorDB extends AbsFakeDB<Collaborator>{

    private RoleDB roleDB;


    @Override
    protected void AllFill() {
        if(this.instance == null){
            this.instance = new ArrayList<>();
        }
        roleDB = new RoleDB();

        Role cargoFinanceiro = this.roleDB.getRoleById(102);
        Role cargoTecnico = this.roleDB.getRoleById(103);

        Collaborator collaborator = new Collaborator
        (
            3, "felipe", "000.222.000-11", "Felipe@gmai.com", 2000.00, "xj6", cargoFinanceiro
        );
        this.instance.add(collaborator);

        Collaborator collaborator2 = new Collaborator
        (
            4, "joão", "111.222.000-11", "joaoe@gmai.com", 4000.00, "xm06", cargoTecnico
        );
        this.instance.add(collaborator2);
    }
    
}
