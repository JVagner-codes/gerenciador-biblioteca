package br.com.project.gerenciadorbiblioteca;

import br.com.project.gerenciadorbiblioteca.dominio.Artigo;
import br.com.project.gerenciadorbiblioteca.dominio.Livro;
import br.com.project.gerenciadorbiblioteca.dominio.Publicacao;

public class Main {

    public static void main(String[] args) {

        Publicacao publicacao = new Livro("Clean code", "Ensinamento clear", 350);
        Publicacao publicacao1 = new Artigo("Sistema da Informação", "Uma pesquisa", 125);
    }
}
