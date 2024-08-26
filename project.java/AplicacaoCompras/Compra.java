package AplicacaoCompras;

public class Compra {
    private String descricao;
    private double valor;

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }
    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public String toString() {
        return "Compra: descricao =" + descricao +
                " valor = " + valor;
    }
}
