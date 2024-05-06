package Model;

import Contract.ICardapio;

public abstract class Estoque implements ICardapio {
    @Override
    public void mostrarOpcoes() {
        System.out.println("Opções disponíveis no cardápio:");
    }
}
