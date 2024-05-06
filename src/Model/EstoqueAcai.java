package Model;
import ENUMS.SaborAcai;
import ENUMS.TamanhodoCopo;

public class EstoqueAcai extends Estoque {

    @Override
    public void mostrarOpcoes() {
        System.out.println("Opções disponíveis no cardápio de açaí:");
        System.out.println("Tamanhos disponíveis:");
        for (TamanhodoCopo tamanho : TamanhodoCopo.values()) {
            System.out.println("- " + tamanho.name());
        }
        System.out.println("Sabores disponíveis:");
        for (SaborAcai sabor : SaborAcai.values()) {
            System.out.println("- " + sabor.name());
        }
    }
}
