package Model;

public class ItemPedido {
    public Acai acai;
    public int quantidade;
    public ItemPedido(Acai acai, int quantidade) {
        this.acai = acai;
        this.quantidade = quantidade;
    }

    public Acai getAcai() {
        return acai;
    }

    public void setAcai(Acai acai) {
        this.acai = acai;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public double calcularSubtotal() {
        return acai.calcularPreco() * quantidade;
    }
}

