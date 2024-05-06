package Model;
import ENUMS.SaborAcai;
import ENUMS.TamanhodoCopo;

public abstract class Acai {
    protected TamanhodoCopo tamanho;
    protected SaborAcai sabor;

    public abstract double calcularPreco();

    public TamanhodoCopo getTamanho() {
        return tamanho;
    }
    public void setTamanho(TamanhodoCopo tamanho) {
        this.tamanho = tamanho;
    }
    public SaborAcai getSabor() {
        return sabor;
    }
    public void setSabor(SaborAcai sabor) {
        this.sabor = sabor;
    }

    public abstract void adicionarFruta(String fruta);

    public abstract void adicionarCobertura(String Cobertura);
}


