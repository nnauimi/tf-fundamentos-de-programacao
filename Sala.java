public class Sala {
    int id;
    String localizacao;
    int lotacaoMaxima;
    double valorDiaria;

    public Sala(int id, String localizacao, int lotacaoMaxima, double valorDiaria) {
        this.id = id;
        this.localizacao = localizacao;
        this.lotacaoMaxima = lotacaoMaxima;
        this.valorDiaria = valorDiaria;
    }

    public int getId() {
        return id;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public int getLotacaoMaxima() {
        return lotacaoMaxima;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
}
