public class Cliente {
    String nome;
    String cpf;
    Endereco endereco;

   String retornarDados() {
       String dados = "Nome: " + nome + "Cpf: " + cpf;
       return dados;
   }
}
