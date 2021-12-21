package br.com.project.gerenciadorbiblioteca.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Estoque {

    private List<Publicacao> publicacoesEmEstoque;
    private List<Publicacao> publicacoesRetiradas;

    public Estoque() {
        this.publicacoesEmEstoque = new ArrayList<>();
        this.publicacoesEmEstoque = new ArrayList<>();
    }

    public void adicionaPublicacao(Publicacao publicacao) {
        this.publicacoesEmEstoque.add(publicacao);
    }

    public String retirarPorEmprestimo(String titulo, String autor) {
        Publicacao publicacaoAEmprestar = publicacoesEmEstoque.stream()
                .filter(publicacao -> publicacao.getTitulo().equals(titulo)
                        && publicacao.getAutores().contains(autor))
                .collect(Collectors.toList())
                .get(0);

        publicacoesRetiradas.add(publicacaoAEmprestar);
        publicacoesEmEstoque.remove(publicacaoAEmprestar);

        return "Retirada para empréstimo:  " + publicacaoAEmprestar;
    }

    public String devolucaoPublicacao(String titulo, String autor) {
        Publicacao publicacaoParaDevolver = publicacoesRetiradas.stream()
                .filter(publicacao -> publicacao.getTitulo().equals(titulo)
                        && publicacao.getAutores().contains(autor))
                .collect(Collectors.toList())
                .get(0);

        publicacoesRetiradas.remove(publicacaoParaDevolver);
        publicacoesEmEstoque.add(publicacaoParaDevolver);

        return "Devolução concluída com sucesso";
    }

}
