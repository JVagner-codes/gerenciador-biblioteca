package br.com.project.gerenciadorbiblioteca.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Publicacao implements Comparable<Publicacao> {

    private String titulo;
    private String descricao;
    private Set<String> autores;
    private int quantPaginas;

    public Publicacao(String titulo, String descricao, int quantPaginas) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.autores = new LinkedHashSet<>();
        this.quantPaginas = quantPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<String> getAutores() {
        return autores;
    }

    public void adicionarAutores(String autores) {
        this.autores.add(autores);
    }

    public int getQuantPaginas() {
        return quantPaginas;
    }

    public void setQuantPaginas(int quantPaginas) {
        this.quantPaginas = quantPaginas;
    }

    @Override
    public String toString() {
        return "Publicacao{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", autores=" + autores +
                ", quantPaginas=" + quantPaginas +
                '}';
    }


    @Override
    public int compareTo(Publicacao p) {
        return this.getTitulo().compareToIgnoreCase(p.getTitulo());
    }
}
