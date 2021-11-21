package revisao;

public class Main {

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Silvio", 28, "Masculino", "999593306");
        Livro livro1 = new Livro("Titulo do meu livro", "João", "Engenharia", "Abril", 2021, 1, 500);
        Emprestimo emprestimo = new Emprestimo("21/11/2021", "17:22", livro1, usuario1);

        // abrir
//        livro1.abrir();

        // ler
        usuario1.lerLivro(livro1);

        // fechar
//        livro1.fechar();

        // devolver
        emprestimo.devolverLivro();
    }
}
