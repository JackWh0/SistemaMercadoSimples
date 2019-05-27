package classes;

public class Cliente {
    private String nome;
    private double valorPago;

    public Cliente(String nome, double valorPago){
        this.nome = nome;
        this.valorPago = valorPago;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }
    
    
    
}
