package FakeDB;

import java.util.ArrayList;

public abstract class AbsFakeDB<TDominio>{
    protected ArrayList<TDominio> instance;

    public ArrayList<TDominio> getInstance(){ //verifica e cria a lista para que ela não cause um erro de NullPointerException quando for acessada.
        if(this.instance != null){
            return this.instance;
        }else{
            this.instance = new ArrayList<>();
            return this.instance;
        }
    }

    protected abstract void AllFill();

    public AbsFakeDB(){
        this.AllFill();
    }
}
