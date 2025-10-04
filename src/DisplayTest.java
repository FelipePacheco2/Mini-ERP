import FakeDB.ClientDB;
import FakeDB.ColllaboratorDB;
import dominio.clients.Buyer;
import dominio.clients.Client;
import dominio.clients.Company;
import dominio.employee.Collaborator;

public class DisplayTest {
    public static void DisplayClient(ClientDB db){
        System.out.println("--- Lista de Clientes ---");
        
        for(Buyer comprador : db.getInstance()) {
            System.out.println("ID Cliente: " + comprador.getBuyerIdentifier());

            if(comprador instanceof Client) {
                
                Client pf = (Client) comprador;
                System.out.println("   -> Tipo: Pessoa Física (Cliente)");
                System.out.println("   -> Nome: " + pf.getName());
                System.out.println("   -> Cartão: " + pf.getNumberCard()); 
                
            } else if(comprador instanceof Company) {
                
                Company pj = (Company) comprador;
                System.out.println("   -> Tipo: Pessoa Jurídica (Empresa)");
                System.out.println("   -> Razão Social: " + pj.getReason());
                System.out.println("   -> ID Interno: " + pj.getId()); 

            }
            System.out.println("----------------------------------------");
        }
    }

    public static void DisplayCollaborato(ColllaboratorDB db){
        System.out.println("--- Lista Colaboradores ---");
        
        for(Collaborator employee : db.getInstance()){
            System.out.println("ID Matricula : " + employee.getRegistration());
            System.out.println("   -> Nome: "+ employee.getName());
            System.out.println("   -> Cpf: "+ employee.getCpf());
            System.out.println("   -> cargo: "+ employee.getRole());
            System.out.println("   -> salario: R$"+ employee.getEffectiveSalary());
            System.out.println("----------------------------------------");
        }
    }
}
