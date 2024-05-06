package Model;
import Contract.IPagamento;
import ENUMS.FormadePagamento;

public abstract class Pedido implements IPagamento {
    protected double valorTotal;

    public double getValorTotal()
    {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public double realizarPagamento(double valorTotal, FormadePagamento formaPagamento) {
        System.out.println("Pagamento realizado com sucesso" + valorTotal + "via " + formaPagamento);
        return valorTotal;
    }
}
