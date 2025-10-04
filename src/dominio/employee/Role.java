package dominio.employee;

import dominio.AbsIdentifier;

public class Role extends AbsIdentifier{
    private String name;

    public Role (int id, String name, Double basesalary){
        super(id);
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
