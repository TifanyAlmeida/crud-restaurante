import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {

    Scanner tec = new Scanner(System.in);
    Usuario usuario;
    Restaurante restaurante;
    double conta = 0.0;
    ArrayList<Lanche> listPedidos= new ArrayList<>();

    public Pedido(Usuario usuario, Restaurante restaurante) {
        this.restaurante = restaurante;
        this.usuario = usuario;
        System.out.println(this.restaurante.getNameRest());
        System.out.println(this.usuario.getNome());
    }

    public Pedido() {

    }

    //--------------------------------------*-----------------------------------------------
    public void fazerPedido(){
        restaurante.imprimirCardapio();

        System.out.println("\n- Qual lanche deseja Comprar: ");
        int idlp = tec.nextInt();
        idlp -= 1;
        tec.nextLine();

        conta += restaurante.listLanches.get(idlp).getPrecoLanche();

        listPedidos.add(restaurante.listLanches.get(idlp));
        System.out.println(restaurante.listLanches.get(idlp));
    }

    @Override
    public String toString() {
        return "Pedido: " + listPedidos.toString();
    }
    //Usuários
    public void imprimirPedido(){
        for (Lanche pedido: listPedidos) {
            System.out.println(pedido);
        }
        System.out.printf("TOTAL: %.2f", conta);
    }
}
