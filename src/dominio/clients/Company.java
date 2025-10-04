package dominio.clients;

import dominio.AbsLegal;
import dominio.phone.TypePhone;

public class Company extends AbsLegal implements Buyer {

    public Company(int id, String reason, String name, String cnpj){
        super( id, reason, name, cnpj);
    }

    @Override
    public String getBuyerIdentifier() { 
        return this.cnpj; // diz que esse é um cliente juridico pelo cpf
    }

    public void addPhone(String string, TypePhone celular) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addPhone'");
    }

}
