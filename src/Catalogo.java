import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private List<Disco> discos;
    private List<Artista> artistas;

    public Catalogo() {
        this.artistas = new ArrayList<>();
        this.discos = new ArrayList<>();
    }


    public void adicionarDisco (Disco disco) {
        discos.add(disco);
    }


    public void adicionarArtista(Artista artista) {
        artistas.add(artista);
    }

    public void editarDisco(String titulo, String novoTitulo, int novoAno) {
        for (Disco disco: discos) {
            if(disco.getTitulo().equalsIgnoreCase(titulo)) {
                disco.setTitulo(novoTitulo);
                disco.setAnoLancamento(novoAno);
                return;
            }
        }
    }

    public void editarArtista(String nome, String novoNome, String novoGenero) {
        for (Artista artista : artistas) {
            if (artista.getNome().equalsIgnoreCase(nome)) {
                artista.setNome(novoNome);
                artista.setGeneroMusical(novoGenero);
                return;
            }
        }
    }

    public void removerDisco(String titulo) {
        discos.removeIf(disco -> disco.getTitulo().equalsIgnoreCase(titulo));
    }

    public void removerArtista(String nome) {
        artistas.removeIf(disco -> disco.getNome().equalsIgnoreCase(nome));
    }

    public List<Disco> listarDiscos() {
        return discos;
    }

    public List<Artista> listarArtistas() {
        return artistas;
    }

    public Disco buscarDiscoPorTitulo(String titulo) {
        for (Disco disco : discos) {
            if (disco.getTitulo().equalsIgnoreCase(titulo)) {
                return disco;
            }
        }
        return null;
    }
}
