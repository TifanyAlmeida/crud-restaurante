import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int op, idc = 0, idr = 0;

        Aplicativo aplicativo = new Aplicativo();
        Restaurante restaurante = new Restaurante();

        System.out.println("------- SEJAM TODIS BEM VINDIX -------");

        do {
            System.out.println("\n\t\tCadastre - se: ");
            System.out.println("\n\n\t\t1 - Cadastrar Restaurante");
            System.out.println("\t\t2 - Cadastrar Clientes");
            System.out.println("\t\t3 - Cadastrar Item no Cardápio");
            System.out.println("\t\t4 - Remover Item do Cardápio");
            System.out.println("\t\t5 - Imprimir Cardápio");
            System.out.println("\t\t6 - Fazer Pedido");
            System.out.println("\t\t7 - Imprimir Pedido");

            System.out.println("\t\t8 - Sair");

            System.out.println("\n- Opção: ");

            op = tec.nextInt();
            tec.nextLine();
            System.out.println("--------------------------------------");

            switch (op) {
                case 1:
                    aplicativo.cadastrarRestaurante();
                    break;
                case 2:
                    aplicativo.cadastrarClientes();
                    break;
                case 3:
                    aplicativo.imprimirRestaurante();

                    System.out.println("\n- Deseja Adicionar o Lanche a qual Restaurante: ");
                    int idAddRest = tec.nextInt();
                    tec.nextLine();

                    System.out.println("\n\t------------------------------------");
                    aplicativo.listRestaurantes.get(idAddRest-1).adicionarLanche();
                    break;

                case 4:
                    aplicativo.imprimirRestaurante();

                    System.out.println("\n- Deseja Remover o Lanche de qual Restaurante: ");
                    int idAdd = tec.nextInt();
                    tec.nextLine();

                    restaurante.imprimirCardapio();

                    System.out.println("\n\t------------------------------------");
                    aplicativo.listRestaurantes.get(idAdd-1).removerLanche();

                    break;
                case 5:
                    for (int i = 0; i < aplicativo.listRestaurantes.size(); i++) {
                        aplicativo.listRestaurantes.get(i).imprimirCardapio();
                    }
                    break;
                case 6:

                    aplicativo.imprimirCliente();
                    System.out.println("\n- Deseja comprar lanche em qual Conta: ");
                    idc = tec.nextInt();
                    tec.nextLine();

                    aplicativo.imprimirRestaurante();
                    System.out.println("\n- Deseja comprar lanche de qual Restaurante: ");
                    idr = tec.nextInt();
                    tec.nextLine();

                    Pedido pedido = new Pedido(aplicativo.listClientes.get(idc-1),aplicativo.listRestaurantes.get(idr-1));
                    for (int i = 0; i < aplicativo.listRestaurantes.size(); i++) {
                        aplicativo.listRestaurantes.get(i).imprimirCardapio();
                    }
                    pedido.fazerPedido();
                    break;
                case 7:

                    Pedido pedidos = new Pedido(aplicativo.listClientes.get(idc-1), aplicativo.listRestaurantes.get(idr-1));
                    pedidos.imprimirPedido();
                    break;
                default:
                    if (op != 8) {
                        System.out.println("* Erro: Digite Apenas Itens do Menu!");
                    } else {
                        System.out.println("\n\n***** Obrigadi! Volte Sempre! ****");
                        System.out.println("----------------------------------");
                    }
            }
        } while (op != 8);
    }
}
