import br.com.fiap.banco.model.Cliente;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        cliente.setUsername("Roberto");
        cliente.setSenha("111406");

        System.out.println("username:" + cliente.getUsername());
        System.out.println("Senha:" + cliente.getSenha());


        boolean churros = cliente.logar("Roberto", "111406");
        System.out.println("logou?" + churros);

    }
}