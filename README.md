# Documentação do Projeto: Sistema de Playlist de Músicas

## 1. Tema do Projeto

O projeto consiste no desenvolvimento de um protótipo de um sistema de gerenciamento de playlists de músicas, utilizando a linguagem Java. O foco é aplicar conceitos de programação orientada a objetos e o uso de estruturas de dados estáticas, como vetores, para organizar as informações.

## 2. Objetivo

O objetivo principal é criar um sistema funcional que permita a um usuário cadastrar músicas, organizá-las em playlists e simular sua reprodução. O projeto serve como um estudo prático sobre a modelagem de classes, instanciação de objetos e manipulação de coleções de dados.

## 3. Estruturas Organizacionais Utilizadas

Para a organização dos dados, foram utilizadas as seguintes estruturas:

- **`Musica[] musicas`**: Um vetor (array) na classe `Playlist` para armazenar as instâncias de objetos `Musica`. Esta estrutura foi escolhida por sua simplicidade e por representar uma coleção de tamanho fixo (embora grande) de músicas dentro de uma playlist.
- **`Playlist[] playlists`**: Embora não implementado como um vetor único na classe principal, a lógica de ter múltiplas instâncias de `Playlist` (`minhaPlaylist`, `playlistPop`) simula uma coleção de playlists gerenciadas pelo `AppPlaylist`.

## 4. Estruturas Instanciáveis (Classes e Objetos)

O sistema foi modelado com as seguintes classes:

- **`Musica`**: Representa uma canção. Seus atributos são:
  - `titulo` (String): O nome da música.
  - `artista` (String): O nome do artista ou banda.
  - `duracao` (double): O tempo da música em minutos.
  - `genero` (String): O gênero musical.

- **`Usuario`**: Representa a pessoa que utiliza o sistema.
  - `nome` (String): Nome do usuário.

- **`Playlist`**: Representa uma lista de reprodução.
  - `nome` (String): O título da playlist.
  - `musicas` (Musica[]): Vetor que armazena as músicas.
  - `proximaPosicao` (int): Contador para gerenciar a inserção de novas músicas no vetor.
  - **Métodos principais**:
    - `adicionarMusica(Musica musica)`: Adiciona um objeto `Musica` ao final da lista.
    - `exibirPlaylist()`: Mostra todas as músicas contidas na playlist.
    - `simularReproducao()`: Percorre o vetor de músicas, exibindo uma mensagem de "Tocando agora" para cada uma, com uma pausa para simular a duração.

- **`AppPlaylist`**: A classe principal que contém o método `main` para executar o programa. Ela orquestra a criação dos objetos e a chamada dos métodos para demonstrar os cenários de uso.

## 5. Cenários de Uso

O fluxo de execução no `AppPlaylist.java` demonstra os seguintes cenários:

1.  **Cadastrar Música no Sistema**:
    - São criadas várias instâncias da classe `Musica`, cada uma representando uma canção diferente.
    ```java
    Musica musica1 = new Musica("Bohemian Rhapsody", "Queen", 5.55, "Rock");
    ```

2.  **Criar Playlist**:
    - Uma instância da classe `Playlist` é criada para um `Usuario`.
    ```java
    Playlist minhaPlaylist = new Playlist("Clássicos do Rock");
    ```

3.  **Adicionar Música na Playlist**:
    - O método `adicionarMusica()` da playlist é chamado, passando um objeto `Musica` como argumento.
    ```java
    minhaPlaylist.adicionarMusica(musica1);
    ```

4.  **Exibir Playlist**:
    - O método `exibirPlaylist()` é invocado para listar no console todas as músicas daquela playlist.
    ```java
    minhaPlaylist.exibirPlaylist();
    ```

5.  **Reproduzir Músicas da Playlist**:
    - O método `simularReproducao()` é chamado para "tocar" as músicas em sequência.
    ```java
    minhaPlaylist.simularReproducao();
    ```

## 6. Organização do Projeto no Git

Para um desenvolvimento colaborativo e organizado, sugere-se a seguinte abordagem com o Git:

- **Responsável pelo Repositório**: Um integrante do grupo deve ser o "dono" do repositório no GitHub (ou outra plataforma). Ele será responsável por criar o repositório, proteger a branch principal (`main` ou `master`) e revisar/aprovar os *Pull Requests* dos outros membros.

- **Estrutura de Pastas**:
  ```
  /               # Raiz do projeto
  |-- src/        # Pasta para o código-fonte Java
  |   |-- AppPlaylist.java
  |   |-- Musica.java
  |   |-- Playlist.java
  |   `-- Usuario.java
  `-- .gitignore  # Arquivo para ignorar arquivos do Git (ex: *.class, /bin)
  ```
