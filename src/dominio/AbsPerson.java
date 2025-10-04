package dominio;

import java.util.ArrayList;
import java.util.List;

import dominio.phone.Phone;
import dominio.phone.TypePhone;

public class AbsPerson extends AbsIdentifier{
    protected String name;
    protected String cpf;
    protected String email;
    protected List<Phone> phone;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    public List<Phone> getPhones(){
        return phone; 
    }

    public AbsPerson(int id, String name, String cpf, String email){
        super(id);
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.phone = new ArrayList<>();
    }

    public void addPhone(String number, TypePhone type){
         this.phone.add(new Phone(number, type));
    }
    
}
