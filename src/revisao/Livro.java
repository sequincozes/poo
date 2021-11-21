package revisao;

public class Livro {
    String titulo;
    String autor;
    String area;
    String editora;
    int ano;
    int edicao;
    int numFolhas;
    boolean emprestimo;

    public boolean isEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(boolean emprestimo) {
        this.emprestimo = emprestimo;
    }

    public Livro(String titulo, String autor, String area, String editora, int ano, int edicao, int numFolhas) {
        this.titulo = titulo;
        this.autor = autor;
        this.area = area;
        this.editora = editora;
        this.ano = ano;
        this.edicao = edicao;
        this.numFolhas = numFolhas;
        this.emprestimo = false;
    }

    public void abrir(){
        System.out.println("O livro está aberto para a leitura.");
    }

    public void fechar(){
        System.out.println("O livro está fechado para a leitura.");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getNumFolhas() {
        return numFolhas;
    }

    public void setNumFolhas(int numFolhas) {
        this.numFolhas = numFolhas;
    }


}
