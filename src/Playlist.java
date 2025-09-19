package src;

public class Playlist {
    String nome;
    Musica[] musicas;
    int proximaPosicao;

    public Playlist(String nome) {
        this.nome = nome;
        this.musicas = new Musica[100]; // Vetor com capacidade para 100 músicas
        this.proximaPosicao = 0;
    }

    public void adicionarMusica(Musica musica) {
        if (proximaPosicao < musicas.length) {
            musicas[proximaPosicao] = musica;
            proximaPosicao++;
            System.out.println("\n-> Música '" + musica.titulo + "' adicionada à playlist '" + this.nome + "'.");
        } else {
            System.out.println("Playlist cheia! Não foi possível adicionar a música.");
        }
    }

    public void exibirPlaylist() {
        System.out.println("\n========================================");
        System.out.println("Playlist: " + this.nome);
        System.out.println("========================================");
        for (int i = 0; i < proximaPosicao; i++) {
            musicas[i].exibirMusica();
        }
        System.out.println("========================================");
    }

    public void simularReproducao() {
        System.out.println("\n*** Iniciando a reprodução da playlist '" + this.nome + "' ***");
        for (int i = 0; i < proximaPosicao; i++) {
            System.out.println("Tocando agora: " + musicas[i].titulo + " - " + musicas[i].artista);
            try {
                // Simula a duração da música (1 segundo por minuto de duração)
                Thread.sleep((long) (musicas[i].duracao * 1000));
            } catch (InterruptedException e) {
                System.out.println("Reprodução interrompida.");
            }
        }
        System.out.println("*** Fim da playlist '" + this.nome + "' ***");
    }
}
