package school.sptech;

public class JogoTabuleiro extends Produto {
    private Integer qtdPecas;

    public JogoTabuleiro(String nome, Raridade raridade, Integer qtdPecas) {
        super(nome, raridade);
        this.qtdPecas = qtdPecas;
    }

    public JogoTabuleiro(Integer qtdPecas) {
        this.qtdPecas = qtdPecas;
    }

    public JogoTabuleiro() {
    }

    @Override
    public Double calcularPreco() {
        Double valor = 0.0;
        if (!getRaridades().equals(Raridade.COMUM))
        valor = ((qtdPecas * 0.50) * (getRaridades().getAdicionalPorcentagem()/100 +1)) ;
        else {
            valor = qtdPecas * 0.50 ;
        }
        return valor;
    }

    public Integer getQtdPecas() {
        return qtdPecas;
    }

    public void setQtdPecas(Integer qtdPecas) {
        this.qtdPecas = qtdPecas;
    }
}
