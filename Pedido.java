import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {

    String op = "";
    Scanner tec = new Scanner(System.in);
    Usuario usuario;
    Restaurante restaurante;
    double conta = 0.0;
    ArrayList<String> pedidos= new ArrayList<>();

    public Pedido(){

    }
    public Pedido(Usuario usuario, Restaurante restaurante) {
        this.restaurante = restaurante;
        this.usuario = usuario;
        System.out.println(this.restaurante.getNameRest());
        System.out.println(this.usuario.getNome());
    }
//--------------------------------------*-----------------------------------------------
    public void fazerPedido(){

        System.out.println("\n--- COMANDA DE PEDIDO ---");
        restaurante.imprimirCardapio();
        System.out.println("\n- Número do Pedido: ");
        int id = tec.nextInt();
        tec.nextLine();

        pedidos.add(restaurante.listLanches.get(id).getNomeLanche());
        conta += restaurante.listLanches.get(id).getPrecoLanche();

        System.out.println("Deseja Pedir Mais itens?(S - SIM/ N - NÃO): ");
        op = tec.nextLine();

        if(op.equalsIgnoreCase("S")){
          fazerPedido();
        }
        else if(op.equalsIgnoreCase("N")) {
            System.out.println("");
        }
        else{
            System.out.println("! Digite Apenas S ou N !");
            fazerPedido();
        }
    }

    @Override
    public String toString() {
        return "Pedido: " + pedidos.toString();
    }
    //Usuários
    public void imprimirPedido(){
        for (String pedido: pedidos) {
            System.out.println(pedido);
        }
        System.out.printf("TOTAL: %.2f", conta);
    }
}
