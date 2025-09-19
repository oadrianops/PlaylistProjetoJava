package src;

public class Musica {
    String titulo;
    String artista;
    double duracao;
    String genero;

    public Musica(String titulo, String artista, double duracao, String genero) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
        this.genero = genero;
    }

    public void exibirMusica() {
        System.out.println("  - Título: " + this.titulo);
        System.out.println("    Artista: " + this.artista);
        System.out.println("    Duração: " + this.duracao + " min");
        System.out.println("    Gênero: " + this.genero);
    }
}
