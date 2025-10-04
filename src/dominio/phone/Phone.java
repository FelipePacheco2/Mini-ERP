package dominio.phone;

public class Phone {
    private String phone;
    private TypePhone type;

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public TypePhone getType() {
        return type;
    }
    public void setType(TypePhone type) {
        this.type = type;
    }


    public Phone(String phone, TypePhone type){
        this.phone = phone;
        this.type = type;
    }

    @Override
    public String toString(){
        return phone;
    }
    
}
