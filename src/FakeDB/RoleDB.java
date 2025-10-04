package FakeDB;

import java.util.ArrayList;

import dominio.employee.Role;

public class RoleDB extends AbsFakeDB<Role> {

    @Override
    protected void AllFill() {
        if(instance == null){
            this.instance = new ArrayList<>();
        }

        this.instance.add(new Role(102, "Financeiro", 7000.00));
        this.instance.add(new Role(103, "Tecnico", 4000.00));
    }

    public Role getRoleById(int id){
        for (Role role : this.instance){
            if(role.getId() == id){
                return role;
            }
        }
        return null;
    }
    
}
