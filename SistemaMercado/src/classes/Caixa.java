package classes;

import java.util.ArrayList;

public class Caixa {
    private Funcionario funcionario;
    private ArrayList<Produto> produtos =  new ArrayList<>();
    
    public Caixa(){
        
    }
    
    public void adicionarProdutoACompra(Produto prod){
        this.produtos.add(prod);
    }
    
    public String mostrarProdutos(){
        String listaProdutos = "";
        for (Produto produto : produtos) {
            listaProdutos +=  "Nome do produto:..... " + produto.getNomeProduto() + "    | Quantidade:..... " + produto.getQuantidade() +
                    "    | Valor unit.....: " + produto.getValorUnitarioProduto() + "\n";
        }
        return listaProdutos;
    }
    
    public double somarValorProdutos(){
        double somaValorProdutos = 0;
        for (Produto produto : produtos) {
            somaValorProdutos += produto.getQuantidade() * produto.getValorUnitarioProduto();
        }
        return somaValorProdutos;
    }
    
    public boolean pagar(Cliente cl){
       if(cl.getValorPago() >= somarValorProdutos()){
           return true;
       }
       else{
           return false;
       }
    }
    
    public double mostrarTroco(Cliente cl){
            return  cl.getValorPago() - somarValorProdutos();
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
    
    
}
