import java.util.ArrayList;
import java.util.Scanner;

public class Restaurante {

    ArrayList<Lanche> listLanches = new ArrayList<>();
    Scanner tec = new Scanner(System.in);

    private String nameRest;
    private int idRest;
    private String cnpj;
    private int idLanc;

    //---------------  CONSTRUTORES, GETTERS E SETTERS ---------------------------
    public Restaurante() {

    }
    public Restaurante(int idRest, String nameRest,String cnpj) {
        this.nameRest = nameRest;
        this.idRest = idRest;
        this.cnpj = cnpj;
    }

    public void setNameRest(String nameRest) {
        this.nameRest = nameRest;
    }
    public  String getNameRest(){
        return nameRest;
    }

    public void setIdRest(int idRest) {
        this.idRest = idRest;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {

        return idRest + "\t\t\t" + nameRest + "\t\t\t" + cnpj;
    }
//----------------------------------------------------------------------------------------------

    public void adicionarLanche() {

        System.out.println("\n- Lanche: ");
        String nomeLanche = tec.nextLine();

        System.out.println("\n- Preço: ");
        double precoLanche = tec.nextDouble();
        tec.nextLine();

        idLanc++;

        this.listLanches.add(new Lanche(idLanc, nomeLanche, precoLanche));
        System.out.println(getNameRest());
        System.out.println("\n--- LISTA DE LANCHES ---");
        System.out.println("\n\tID\t\tLanche\t\tPreço");
        for (Lanche lanche : listLanches) {
            System.out.println(lanche);
        }
    }
//---------------------------------------------------------------------------------------------------------
    public void removerLanche(){

        imprimirCardapio();

        System.out.println("\n- ID: ");
        int idExcluir = tec.nextInt();
        tec.nextLine();

        listLanches.remove(idExcluir -1);
    }

    //exibir lista de lanches
    public void imprimirCardapio(){
        System.out.println("\n--- LISTA DE LANCHES ---\n");
        System.out.println(getNameRest());
        System.out.println("\n\tID\t\tLanche\t\tPreço");
        for (Lanche lanche : listLanches) {
            System.out.println(lanche);
        }
    }
    // ------------------------------------------------------------------------------------------------------------
}
