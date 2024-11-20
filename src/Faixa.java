public class Faixa {
    private String titulo;
    private double duracao;

    public Faixa(String titulo, double duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return titulo + " (" + String.format("%.2f", duracao) + " min)";
    }
}
