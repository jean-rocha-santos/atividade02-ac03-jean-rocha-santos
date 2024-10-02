package school.sptech;

import static school.sptech.Formato.COMUM;
import static school.sptech.Formato.DIGITAL;

public class Livro extends Produto {
    private String editora;
    private String autor;
    private Integer qtdPaginas;
    private  Formato formato;

    public Livro(String nome, Raridade raridade, String editora, String autor, Integer qtdPaginas, Formato formato) {
        super(nome, raridade);
        this.editora = editora;
        this.autor = autor;
        this.qtdPaginas = qtdPaginas;
        this.formato = formato;
    }

    public Livro(String editora, String autor, Integer qtdPaginas, Formato formato) {
        this.editora = editora;
        this.autor = autor;
        this.qtdPaginas = qtdPaginas;
        this.formato = formato;
    }

    public Livro() {
    }

    @Override
    public Double calcularPreco() {
        Double valor = 0.0;
        if ( qtdPaginas >0){
        if (formato.equals(DIGITAL)){
            valor = ((qtdPaginas * 0.20) * (getRaridades().getAdicionalPorcentagem()/100 +1));
        } else if (formato.equals(COMUM)) {
            valor = ((qtdPaginas *0.30) * (getRaridades().getAdicionalPorcentagem()/100 +1));
        }else {
            valor = ((qtdPaginas *0.40) * (getRaridades().getAdicionalPorcentagem()/100 +1));
        }
        }

        return valor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(Integer qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    public Formato getFormato() {
        return formato;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
    }
}
