import java.util.ArrayList;
import java.util.Scanner;

public class Aplicativo {

    private String nome;
    private int idCliente = 0;
    private int idRest =0;
    private String identificacao;

    Scanner tec = new Scanner(System.in);

    ArrayList<Restaurante> listRestaurantes = new ArrayList<>();
    ArrayList<Usuario> listClientes = new ArrayList<>();

    //-------------------------------- Restaurante ---------------------------------------
    public void cadastrarRestaurante() {

        System.out.println("------ CADASTRO DE RESTAURANTES ------");

        System.out.println("\n- Razão Social: ");
        nome = tec.nextLine();

        System.out.println("\n- CNPJ: ");
        identificacao = tec.nextLine();

        idRest += 1;

        listRestaurantes.add(new Restaurante(idRest, nome, identificacao));

        System.out.println("\n\t|*||*||*| LISTA DE RESTAURANTES |*||*||*|");
        System.out.println("\n\t\tID\t\tRestaurante\t\tCNPJ\n\t\t\t\t\n");

        for (Restaurante restaurante : listRestaurantes) {
            System.out.println("\t\t"+restaurante);
        }
        System.out.println("\n\t------------------------------------");
    }

    public void imprimirRestaurante(){
        for (Restaurante restaurante : listRestaurantes) {
            System.out.println("\t\t"+restaurante);
        }
    }
    //----------------------------------------------------------------------------------

    //-------------------------------- Clientes ---------------------------------------
    public void cadastrarClientes(){

        System.out.println("------- CADASTRO DE CLIENTES -------");

        System.out.println("\n- Nome: ");
        nome = tec.nextLine();

        System.out.println("\n- CPF: ");
        identificacao = tec.nextLine();

        System.out.println("\n- Endereço: ");
        String endereco = tec.nextLine();

        idCliente += 1;
        listClientes.add(new Usuario(idCliente, nome, endereco, identificacao));

        System.out.println("\n\t|C||C||C||C| LISTA DE CLIENTES |C||C||C||C|");
        System.out.println("\t\tID\t\tCliente\t\tCPF\t\tEndereço\n");

        for (Usuario usuario : listClientes) {
            System.out.println("\t\t"+usuario);
        }
        System.out.println("\t------------------------------------");
    }
    //----------------------------------------------------------------------------------
}