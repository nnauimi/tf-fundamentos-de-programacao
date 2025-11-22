import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Evento {
    public enum TipoEvento {
        FEIRA,
        WORKSHOP,
        SEMINARIO
    }

    private int codigo;
    private String nome;
    private TipoEvento tipoEvento;
    private Date dataInicial;
    private Date dataFinal;
    private List<Inscricao> inscricoes;
    private List<Sala> salas;

    public Evento(int codigo, String nome, TipoEvento tipoEvento, Date dataInicial, Date dataFinal) {
        this.codigo = codigo;
        this.nome = nome;
        this.tipoEvento = tipoEvento;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.inscricoes = new ArrayList<>();
        this.salas = new ArrayList<>();
    }

    public void adicionarInscricao(Inscricao inscricao) {
        this.inscricoes.add(inscricao);
    }

    public void adicionarSala(Sala sala) {
        this.salas.add(sala);
    }

    // metodo de manipulacao de vetores 1
    public Sala getSalaPorCapacidade(int capacidade) {
        for (int i = 0; i < salas.size(); i++) {
            Sala sala = salas.get(i);

            if (sala.getLotacaoMaxima() == capacidade) {
                return sala;
            }
        }
        return null;
    }

    // metodo de manipulacao de vetores 2
    public List<Inscricao> getInscricoesEstudante() {
        List<Inscricao> alunos = new ArrayList<>();

        for (int i = 0; i < inscricoes.size(); i++) {
            Inscricao inscricao = inscricoes.get(i);
            
            if (inscricao.getCategoria() == Inscricao.CategoriaIncricao.ESTUDANTE) {
                alunos.add(inscricao);
            }
        }

        return alunos;
    }

    // metodo de manipulacao de vetores 3
    public boolean alterarValorSala(int idSala, double novoValor) {
        for (int i = 0; i < salas.size(); i++) {
            Sala sala = salas.get(i);

            if (sala.getId() == idSala) {
                sala.setValorDiaria(novoValor);
                return true;
            }
        }
        return false;
    }

    // metodo de manipulacao de vetores 4
    public double calcularReceitaTotal() {
        double receitaTotal = 0.0;

        for (int i = 0; i < inscricoes.size(); i++) {
            Inscricao inscricao = inscricoes.get(i);
            receitaTotal += inscricao.getPrecoInscricao();
        }

        return receitaTotal;
    }

    // metodo de manipulacao de vetores 5
    public int capacidadeTotalDoEvento() {
        int capacidadeTotal = 0;

        for (int i = 0; i < salas.size(); i++) {
            Sala sala = salas.get(i);
            capacidadeTotal += sala.getLotacaoMaxima();
        }

        return capacidadeTotal;
    }

    // metodo de manipulacao de vetores 6
    public List<Sala> getSalasPorLocalizacao(String localizacao) {
        List<Sala> salasLocalizacao = new ArrayList<>();

        for (int i = 0; i < salas.size(); i++) {
            Sala sala = salas.get(i);

            if (sala.getLocalizacao().equalsIgnoreCase(localizacao)) {
                salasLocalizacao.add(sala);
            }
        }

        return salasLocalizacao;
    }

    // metodo de manipulacao de vetores 7
    public void removerInscricaoPorId(int idInscricao) {
        for (int i = 0; i < inscricoes.size(); i++) {
            Inscricao inscricao = inscricoes.get(i);

            if (inscricao.getId() == idInscricao) {
                inscricoes.remove(i);
                break;
            }
        }
    }

    // getters e setters
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public int getQuantidadeSalas() {
        return salas.size();
    }

    public int getQuantidadeInscricoes() {
        return inscricoes.size();
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }
}