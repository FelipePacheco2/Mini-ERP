package dominio.employee;

import dominio.AbsPerson;

public class Collaborator extends AbsPerson{
    private double effectiveSalary;
    private String registration;
    private Role role;


    public Collaborator(int id, String name, String cpf, String email, double effectiveSalary, String registration, Role role) {
        super(id, name, cpf, email);
        this.effectiveSalary = effectiveSalary;
        this.registration = registration;
        this.role = role;

    }

    
    public void setEffectiveSalary(double effectiveSalary) {
        this.effectiveSalary = effectiveSalary;
    } // atualizar salario individual do colaborador


    public double getEffectiveSalary() {
        return effectiveSalary;
    }


    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }
   

    public Role getRole() {
        return role;
    }


    public void setRole(Role role) {
        this.role = role;
    }

}
