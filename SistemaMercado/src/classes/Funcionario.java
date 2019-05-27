package classes;

import javax.swing.JOptionPane;

public class Funcionario {
    private String nome;
    private String login;
    private String senha;

    public Funcionario(){
        this.login = "admin";
        this.senha = "admin";
    }
    
    public boolean fazerLoginFuncionario(String login, String senha){
        if((login.equals(this.getLogin()) && (senha.equals(this.getSenha())))){
            this.nome = JOptionPane.showInputDialog("Para continuar, por favor digite seu nome!");
            if(this.nome.equals("")){
                this.nome = "Desconhecido!";
            }
            return true;
        } 
        else{
            return false;
        }
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
