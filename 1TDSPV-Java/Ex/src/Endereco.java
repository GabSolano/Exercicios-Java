public class Endereco {

    String logadouro;
    short numero;
    String complemento;
    String cep;

    String retornarEndereco() {
        String endereco = logadouro + " " + numero + " " + complemento;
        return endereco;
    }
}



