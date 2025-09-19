package src;

public class AppPlaylist {
    public static void main(String[] args) {
        System.out.println("### Sistema de Gerenciamento de Playlists ###");

        // Cenário 1: Cadastrar músicas no sistema
        System.out.println("\n--- Cadastrando músicas no sistema ---");
        Musica musica1 = new Musica("Bohemian Rhapsody", "Queen", 5.55, "Rock");
        Musica musica2 = new Musica("Smells Like Teen Spirit", "Nirvana", 5.01, "Grunge");
        Musica musica3 = new Musica("Billie Jean", "Michael Jackson", 4.54, "Pop");
        Musica musica4 = new Musica("Asa Branca", "Luiz Gonzaga", 3.15, "Baião");

        System.out.println("Músicas cadastradas com sucesso!");

        // Cenário 2: Criar uma playlist
        System.out.println("\n--- Criando uma nova playlist ---");
        Usuario usuario = new Usuario("Adriano");
        Playlist minhaPlaylist = new Playlist("Clássicos do Rock");
        System.out.println("Playlist '" + minhaPlaylist.nome + "' criada para o usuário " + usuario.nome + ".");

        // Cenário 3: Adicionar músicas à playlist
        System.out.println("\n--- Adicionando músicas à playlist ---");
        minhaPlaylist.adicionarMusica(musica1);
        minhaPlaylist.adicionarMusica(musica2);

        // Adicionando outra música para demonstrar
        Playlist playlistPop = new Playlist("Pop Hits");
        playlistPop.adicionarMusica(musica3);

        // Cenário 4: Exibir a playlist
        System.out.println("\n--- Exibindo o conteúdo das playlists ---");
        minhaPlaylist.exibirPlaylist();
        playlistPop.exibirPlaylist();

        // Cenário 5: Simular a reprodução da playlist
        System.out.println("\n--- Simulando a reprodução ---");
        minhaPlaylist.simularReproducao();
    }
}
