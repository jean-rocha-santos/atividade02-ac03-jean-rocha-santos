package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Livraria {
    private List<Produto> produtos;
    private String nome;

    public Livraria(List<Produto> produtos, String nome) {
        this.produtos = new ArrayList<>();
        this.nome = nome;
    }

    public Livraria() {
    }

    public void adicionar(Produto produto){
        produtos.add(produto);
    }

    public void remover(String nome ){

        for (int i = 0; i < produtos.size() ; i++) {
            if (produtos.get(i).getNome().equalsIgnoreCase(nome)){
                produtos.remove(produtos.get(i));
            }
        }
    }
    public Double calcularTotalLivros(){
        Double valor=0.0;

        for (Produto produto : produtos) {
            if (produto instanceof Livro)
            valor +=produto.calcularPreco();
        }
        return valor;
    }
    public List<Livro> buscarLivrosPorFormato(Formato formato){
        List<Livro> lista = new ArrayList<>();

        for (Produto produto : produtos) {
            if (produto instanceof Livro livro){
                if (livro.getFormato().equals(formato)){
                    lista.add(livro);
                }
            }
        }
        return lista;
    }

    public List<Produto> buscarPorRaridade(Raridade raridade){
        List<Produto> lista = new ArrayList<>();
        for (Produto produto : produtos) {
            if (produto.getRaridade().equals(raridade)){
                lista.add(produto);
            }
        }
        return lista;
    }
    public Boolean existePorNome(String nome){
        Boolean existe=true;

        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)){
                return existe;
            }
        }

        return false;
    }

    public List<JogoTabuleiro> buscarPorQtdPecasMaior(Integer qtd){
        List<JogoTabuleiro> lista =new ArrayList<>();

        for (Produto produto : produtos) {
            if (produto instanceof JogoTabuleiro jogo){
                if (jogo.getQtdPecas() > qtd){
                    lista.add(jogo);
                }
            }
        }
        return lista;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
