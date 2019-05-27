package classes;

public class Produto {
    private String nomeProduto;
    private double valorUnitarioProduto;
    private int quantidade;

    public Produto(String nomeProduto, double valorUnitarioProduto, int quantidade) {
        this.nomeProduto = nomeProduto;
        this.valorUnitarioProduto = valorUnitarioProduto;
        this.quantidade = quantidade;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getValorUnitarioProduto() {
        return valorUnitarioProduto;
    }

    public void setValorUnitarioProduto(double valorUnitarioProduto) {
        this.valorUnitarioProduto = valorUnitarioProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
