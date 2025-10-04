package dominio;

import java.util.ArrayList;
import java.util.List;
import dominio.phone.Phone;

public abstract class AbsLegal extends AbsIdentifier{
    protected String reason;
    protected String name;
    protected String cnpj;

    public String getReason() {
        return reason;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public AbsLegal(int id, String reason, String name, String cnpj){
        super(id);
        this.reason = reason;
        this.name = name;
        this.cnpj = cnpj;
    }
}
