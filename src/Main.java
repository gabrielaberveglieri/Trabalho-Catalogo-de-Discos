import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Catalogo catalogo = new Catalogo();

        while (true) {
            System.out.println("-----------------------------------------------------");
            System.out.println("         SEJA BEM VINDO AO CATALOGO DE DISCOS        ");
            System.out.println("-----------------------------------------------------");
            System.out.println("");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar disco");
            System.out.println("2 - Cadastrar artista");
            System.out.println("3 - Listar discos");
            System.out.println("4 - Editar disco");
            System.out.println("5 - Editar artista");
            System.out.println("6 - Remover disco");
            System.out.println("7 - Remover artista");
            System.out.println("8 - Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Título do disco: ");
                    String tituloDisco = scanner.nextLine();
                    System.out.print("Ano de lançamento: ");
                    int anoDisco = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome do artista: ");
                    String nomeArtista = scanner.nextLine();
                    System.out.print("Gênero musical: ");
                    String generoArtista = scanner.nextLine();


                    Artista artista = new Artista(nomeArtista, generoArtista);
                    catalogo.adicionarArtista(artista);

                    Disco disco = new Disco(tituloDisco, anoDisco, artista);

                    System.out.println("Adicione as faixas do disco.");
                    while (true) {
                        System.out.print("Título da faixa (ou pressione ENTER para finalizar): ");
                        String tituloFaixa = scanner.nextLine();
                        if (tituloFaixa.isEmpty()) {
                            break; // Encerra o loop se o título da faixa estiver vazio
                        }
                        System.out.print("Duração da faixa (em segundos): ");
                        int duracaoFaixa = scanner.nextInt();
                        scanner.nextLine(); // Consome a quebra de linha

                        Faixa faixa = new Faixa(tituloFaixa, duracaoFaixa);
                        disco.adicionarFaixa(faixa);
                        System.out.println("Faixa adicionada com sucesso!");
                    }

                    catalogo.adicionarDisco(disco);
                    System.out.println("Disco cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("Nome do artista: ");
                    String nome = scanner.nextLine();
                    System.out.print("Gênero musical: ");
                    String genero = scanner.nextLine();
                    Artista novoArtista = new Artista(nome, genero);
                    catalogo.adicionarArtista(novoArtista);
                    System.out.println("Artista cadastrado com sucesso!");
                    break;

                case 3:
                    System.out.println("Discos cadastrados:");
                    for (Disco d : catalogo.listarDiscos()) {
                        System.out.println(d);
                    }
                    break;

                case 4:
                    System.out.print("Digite o título do disco a ser editado: ");
                    String tituloEdicao = scanner.nextLine();
                    System.out.print("Novo título: ");
                    String novoTitulo = scanner.nextLine();
                    System.out.print("Novo ano de lançamento: ");
                    int novoAno = scanner.nextInt();
                    scanner.nextLine();
                    catalogo.editarDisco(tituloEdicao, novoTitulo, novoAno);
                    System.out.println("Disco editado com sucesso!");
                    break;

                case 5:
                    System.out.print("Digite o nome do artista a ser editado: ");
                    String nomeEdicao = scanner.nextLine();
                    System.out.print("Novo nome: ");
                    String novoNome = scanner.nextLine();
                    System.out.print("Novo gênero musical: ");
                    String novoGenero = scanner.nextLine();
                    catalogo.editarArtista(nomeEdicao, novoNome, novoGenero);
                    System.out.println("Artista editado com sucesso!");
                    break;

                case 6:
                    System.out.print("Digite o título do disco a ser removido: ");
                    String tituloRemoverDisco = scanner.nextLine();
                    catalogo.removerDisco(tituloRemoverDisco);
                    System.out.println("Disco removido com sucesso!");
                    break;

                case 7:
                    System.out.print("Digite o nome do artista a ser removido: ");
                    String nomeRemoverArtista = scanner.nextLine();
                    catalogo.removerArtista(nomeRemoverArtista);
                    System.out.println("Artista removido com sucesso!");
                    break;

                case 8:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
            }
        }
    }
}
