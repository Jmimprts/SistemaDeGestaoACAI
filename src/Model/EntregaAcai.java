package Model;
import Contract.IEntrega;

public class EntregaAcai implements IEntrega {
    @Override
    public void agendarEntrega() {
        System.out.println("Agendando entrega...");
        System.out.println("Entrega agendada para hoje à tarde.");
    }
}
