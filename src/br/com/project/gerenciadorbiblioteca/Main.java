package br.com.project.gerenciadorbiblioteca;

import br.com.project.gerenciadorbiblioteca.dominio.Artigo;
import br.com.project.gerenciadorbiblioteca.dominio.Estoque;
import br.com.project.gerenciadorbiblioteca.dominio.Livro;
import br.com.project.gerenciadorbiblioteca.dominio.Publicacao;

public class Main {

    public static void main(String[] args) {

        Estoque estoque = new Estoque();

        Publicacao livro1 = new Livro("Clean code", "Ensinamento clear", 350);
        livro1.adicionarAutores("Robert Cecil Martin");
        Publicacao artigo1 = new Artigo("Sistema da Informação", "Uma pesquisa", 125);
        artigo1.adicionarAutores("Teste");
        Publicacao livro2 = new Livro("ABC dos códigos", "O básico", 220);
        livro1.adicionarAutores("Teste");
        Publicacao artigo2 = new Artigo("Uma inovação", "Tecnológica", 125);
        artigo2.adicionarAutores("Teste");

        estoque.adicionaPublicacao(livro1);
        estoque.adicionaPublicacao(artigo1);
        estoque.adicionaPublicacao(livro2);
        estoque.adicionaPublicacao(artigo2);

        estoque.getPublicacoesRegistradasNoSistema().forEach(System.out::println);

        System.out.println("O livro Clean code está disponível: " +
                estoque.estaDisponivel("Clean code", "Robert Cecil Martin"));
    }
}
