package dominio;

public abstract class AbsIdentifier {

    protected int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public AbsIdentifier(){

    }

    public AbsIdentifier(int id){
        this.id = id;
    }
}
