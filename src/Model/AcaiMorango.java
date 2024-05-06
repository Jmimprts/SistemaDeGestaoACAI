package Model;

public class AcaiMorango extends Acai{
    @Override
    public double calcularPreco() {
        // Simulação de cálculo de preço
        return 15.0;
    }

    @Override
    public void adicionarFruta(String fruta) {
        System.out.println("Fruta adicionada com sucesso");
    }

    @Override
    public void adicionarCobertura(String Cobertura) {
        System.out.println("Cobertura adicionada com sucesso");
    }
}