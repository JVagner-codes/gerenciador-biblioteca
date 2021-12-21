package br.com.project.gerenciadorbiblioteca.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Estoque {

    private List<Publicacao> publicacoesRegistradasNoSistema;

    public Estoque() {
        this.publicacoesRegistradasNoSistema = new ArrayList<>();
    }

    public void adicionaPublicacao(Publicacao publicacao) {
        this.publicacoesRegistradasNoSistema.add(publicacao);
    }

    public String retirarPorEmprestimo(String titulo, String autor) throws Exception {
        Publicacao publicacaoAEmprestar = get(titulo, autor);
        if (publicacaoAEmprestar.isDisponivel()) {
            publicacaoAEmprestar.setDisponivel(false);
            return "Retirado para empréstimo:  " + publicacaoAEmprestar;
        }
        return "A publicação está indisponível para empréstimo";
    }

    public String devolucaoPublicacao(String titulo, String autor) throws Exception {
        Publicacao publicacaEmDevolucao = get(titulo, autor);
        if (!publicacaEmDevolucao.isDisponivel()) {
            publicacaEmDevolucao.setDisponivel(true);
            return "Devolução concluída com sucesso";
        }
        return "Não conseguimos registrar a sua devolução";
    }

    private Publicacao get(String titulo, String autor) throws Exception {
        Publicacao publicacaoRetornada = publicacoesRegistradasNoSistema.stream()
                .filter(publicacao -> publicacao.getTitulo().equals(titulo)
                        && publicacao.getAutores().contains(autor))
                .collect(Collectors.toList()).get(0);

        if (publicacaoRetornada == null){
            throw new Exception("Publicação não encontrada no sistema");
        }
        return publicacaoRetornada;
    }

}
