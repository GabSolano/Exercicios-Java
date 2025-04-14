import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Endereco endereco = new Endereco();
        Cliente cliente = new Cliente();
        ContaCorrente contaCorrente = new ContaCorrente();

        System.out.println("Digite o logradouro: ");
        endereco.logadouro = leitor.nextLine();

        System.out.println("Digite o numero do endereco: ");
        endereco.numero = leitor.nextShort();
        leitor.nextLine();

        System.out.println("Digite o complemento do endereco:");
        endereco.complemento = leitor.nextLine();

        System.out.println("Digite o cep do endereco: ");
        endereco.cep = leitor.nextLine();

        System.out.println("=================Cliente=============");

        System.out.println("Digite o nome do clinte: ");
        cliente.nome = leitor.nextLine();

        System.out.println("Digite Cpf:");
        cliente.cpf = leitor.nextLine();

        cliente.endereco = endereco;

        System.out.println("=================Conta Corrente=============");

        System.out.println("Digite um saldo inicial: ");
        contaCorrente.saldo = leitor.nextDouble();

        contaCorrente.titular = cliente;

        System.out.println("Valor a depositar na conta corrente");
        double saldoADepositar = leitor.nextDouble();
        contaCorrente.depositar(saldoADepositar);
        System.out.println("Novo Valor:" + contaCorrente.retornarSaldo());

        System.out.println("Valor a retirar na conta corrente");
        double saldoARetirar = leitor.nextDouble();
        contaCorrente.retirar(saldoARetirar);
        System.out.println("Novo Saldo:" + contaCorrente.retornarSaldo());

        System.out.println("===========Dados do CLiente===============");
        System.out.println(cliente.retornarDados());

        System.out.println("=============Endereco do Cliente==========");
        System.out.println(cliente.endereco.retornarEndereco());
    }
}