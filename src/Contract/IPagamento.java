package Contract;
import ENUMS.FormadePagamento;

public interface IPagamento {
    double realizarPagamento(double valorTotal, FormadePagamento formaPagamento);
}
