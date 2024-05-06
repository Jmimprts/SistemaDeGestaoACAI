package Model;
import ENUMS.FormadePagamento;

public class PedidoAcaiMorango extends Pedido {
    @Override
    public double realizarPagamento(double valorTotal, FormadePagamento formaPagamento) {
        System.out.println("Realizando pagamento...");
        System.out.println("Valor total do pedido: R$" + valorTotal);
        System.out.println("Forma de pagamento: " + formaPagamento.name());
        System.out.println("Pagamento realizado com sucesso!");
        return valorTotal;
    }
}
