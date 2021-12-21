package br.com.project.gerenciadorbiblioteca.dominio;

import java.util.Set;

public class Artigo extends Publicacao {

    private String areaDePesquisa;

    public Artigo(String titulo, String descricao, int quantPaginas) {
        super(titulo, descricao, quantPaginas);
    }

    public String getAreaDePesquisa() {
        return areaDePesquisa;
    }

    public void setAreaDePesquisa(String areaDePesquisa) {
        this.areaDePesquisa = areaDePesquisa;
    }

    @Override
    public String toString() {
        return "Artigo{" +
                "areaDePesquisa='" + areaDePesquisa + '\'' +
                '}';
    }
}
