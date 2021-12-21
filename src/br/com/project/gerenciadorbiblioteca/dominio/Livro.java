package br.com.project.gerenciadorbiblioteca.dominio;

public class Livro extends Publicacao {

    private String editora;

    public Livro(String titulo, String descricao, int quantPaginas) {
        super(titulo, descricao, quantPaginas);
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Livro{" + super.toString();
    }
}
