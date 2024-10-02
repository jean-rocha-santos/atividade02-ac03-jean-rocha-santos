package school.sptech;

import java.util.List;

public abstract class Produto {
    private String nome;
    private Raridade raridade;

    public Produto(String nome, Raridade raridade) {
        this.nome = nome;
        this.raridade = raridade;
    }

    public Produto() {

    }

    public abstract Double calcularPreco();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Raridade getRaridade() {
        return raridade;
    }

    public void setRaridade(Raridade raridade) {
        this.raridade = raridade;
    }

    public Raridade getRaridades() {
        return raridade;
    }

    public void setRaridades(Raridade raridades) {
        this.raridade = raridades;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", raridades=" + raridade +
                '}';
    }
}
