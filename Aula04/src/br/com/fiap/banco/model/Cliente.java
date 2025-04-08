package br.com.fiap.banco.model;

public class Cliente {
    public String username;
    public String senha;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    
   public boolean logar(String login, String senha){
        return login.equals(username) && senha.equals(this.senha);
    }
}



