package Main;
import ENUMS.FormadePagamento;
import ENUMS.SaborAcai;
import ENUMS.TamanhodoCopo;
import Model.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EstoqueAcai estoque = new EstoqueAcai();

        int opcao;
        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Mostrar Opções do Cardápio");
            System.out.println("2. Fazer Pedido");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    estoque.mostrarOpcoes();
                    break;
                case 2:
                    fazerPedido();
                    break;
                case 3:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        } while (opcao != 3);

        scanner.close();
    }

public static void fazerPedido() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("===== Fazer Pedido =====");

    System.out.println("Escolha o tamanho do copo:");
    for (TamanhodoCopo tamanho : TamanhodoCopo.values()) {
        System.out.println((tamanho.ordinal() + 1) + ". " + tamanho.name());
    }
    System.out.print("Opção: ");
    int tamanhoEscolhido = scanner.nextInt();
    TamanhodoCopo tamanhoCopo = TamanhodoCopo.values()[tamanhoEscolhido - 1];

    System.out.println("Escolha o sabor do açaí:");
    for (SaborAcai sabor : SaborAcai.values()) {
        System.out.println((sabor.ordinal() + 1) + ". " + sabor.name());
    }
    System.out.print("Opção: ");
    int saborEscolhido = scanner.nextInt();
    SaborAcai saborAcai = SaborAcai.values()[saborEscolhido - 1];

    Acai acai = new AcaiMorango();

    System.out.println("Deseja adicionar alguma fruta? (Sim/Não):");
    String escolha = scanner.next();
    if (escolha.equalsIgnoreCase("Sim")) {
        System.out.print("Digite a fruta a ser adicionada: ");
        String fruta = scanner.next();
        acai.adicionarFruta(fruta);
    }

    System.out.println("Deseja adicionar algum topping? (Sim/Não):");
    escolha = scanner.next();
    if (escolha.equalsIgnoreCase("Sim")) {
        System.out.print("Digite a cobertura a ser adicionada ");
        String Cobertura = scanner.next();
        acai.adicionarCobertura(Cobertura);
    }

    double precoTotal = acai.calcularPreco();
    System.out.println("Preco total do pedido = R$" + precoTotal);

    System.out.println("Selecione a sua forma de pagamento");
    for (FormadePagamento formaPagamento : FormadePagamento.values()) {
        System.out.println((formaPagamento.ordinal() + 1) + ". " + formaPagamento.name());
    }
    System.out.print("Opção: ");
    int formaPagamentoEscolhida = scanner.nextInt();
    FormadePagamento formaPagamento = FormadePagamento.values()[formaPagamentoEscolhida - 1];

    Pedido pedido = new PedidoAcaiMorango();
    pedido.setValorTotal(precoTotal);
    pedido.realizarPagamento(precoTotal, formaPagamento);

    scanner.close();
}
}