package classes;

import java.util.Calendar;

public class NotaFiscal {
    private Funcionario funcionario;
    private Cliente cliente;
    private Caixa caixa;
    private Calendar calendar = Calendar.getInstance();
    
    int dia = calendar.get(Calendar.DAY_OF_MONTH);
    int mes = calendar.get(Calendar.MONTH) + 1;
    int ano = calendar.get(Calendar.YEAR);
    int hora = calendar.get(Calendar.HOUR_OF_DAY);
    int minuto = calendar.get(Calendar.MINUTE);
    int segundo = calendar.get(Calendar.SECOND);
    
    public NotaFiscal(Funcionario func, Cliente clie, Caixa cai){
        this.funcionario = func;
        this.cliente = clie;
        this.caixa = cai;
    }
    
    public String mostrarNotaFiscal(){
        
        return "===================== Mercado Orientado a Compras ====================\n" + "Funcionário: " + 
                funcionario.getNome() + "\nCliente: " + cliente.getNome()+ "\nData e hora da compra: " + dia + 
                "/" + mes + "/" + ano + "   |   " + hora + ":" + minuto + ":" + segundo +
                "\n\n-------------------------------------------- Lista de Compras --------------------------------------------\n" +
                caixa.mostrarProdutos() +"\nValor total da compra: " + caixa.somarValorProdutos() + "\nvalor pago: " +
                cliente.getValorPago() + "\nTroco: " + caixa.mostrarTroco(cliente);
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Caixa getCaixa() {
        return caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    
}
