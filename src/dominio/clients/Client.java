package dominio.clients;

import dominio.AbsPerson;


public class Client extends AbsPerson implements Buyer{
    private String numberCard;

    public Client(int id, String name, String cpf, String email, String numberCard){
        super(id, name, cpf, email);
        this.numberCard = numberCard;
    }

    @Override
    public String getBuyerIdentifier() {
        return this.cpf;   ///diz que esse é um cliente fisico pelo cpf
    }


    public String getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(String numberCard) {
        this.numberCard = numberCard;
    }
}
