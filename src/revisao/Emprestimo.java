package revisao;

public class Emprestimo {
    String dataDoEmprestimo;
    String horaDoEmprestimo;
    Livro livro;
    Usuario usario;

    public Emprestimo(String dataDoEmprestimo, String horaDoEmprestimo, Livro livro, Usuario usario) {
        this.dataDoEmprestimo = dataDoEmprestimo;
        this.horaDoEmprestimo = horaDoEmprestimo;
        this.livro = livro;
        this.usario = usario;
        System.out.println("----- EMPRÉSTIMO -----");
        System.out.println("Usuário: " + this.usario.getNome());
        System.out.println("Livro: " + this.livro.getTitulo());
        System.out.println("Data: " + this.dataDoEmprestimo);
    }

    public void devolverLivro() {
        this.livro.setEmprestimo(true);
        System.out.println("O livro " + livro.getTitulo() + " foi devolvido!");
    }

    public String getDataDoEmprestimo() {
        return dataDoEmprestimo;
    }

    public void setDataDoEmprestimo(String dataDoEmprestimo) {
        this.dataDoEmprestimo = dataDoEmprestimo;
    }

    public String getHoraDoEmprestimo() {
        return horaDoEmprestimo;
    }

    public void setHoraDoEmprestimo(String horaDoEmprestimo) {
        this.horaDoEmprestimo = horaDoEmprestimo;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Usuario getUsario() {
        return usario;
    }

    public void setUsario(Usuario usario) {
        this.usario = usario;
    }


}
