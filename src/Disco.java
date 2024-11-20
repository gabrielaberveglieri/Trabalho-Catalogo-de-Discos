import java.util.ArrayList;
import java.util.List;

public class Disco {
    private String titulo;
    private int anoLancamento;
    private Artista artista;
    private List<Faixa> faixas;

    public Disco(String titulo, int anoLancamento, Artista artista) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.artista = artista;
        this.faixas = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public Artista getArtista() {
        return artista;
    }

    public List<Faixa> getFaixas() {
        return faixas;
    }

    public void adicionarFaixa(Faixa faixa) {
        faixas.add(faixa);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Disco: ").append(titulo).append(" (").append(anoLancamento).append(")\n")
                .append("Artista: ").append(artista).append("\n")
                .append("Faixas: ");

        for (Faixa faixa : faixas) {
            sb.append(faixa).append(" ");
        }

        return sb.toString();
    }
}

