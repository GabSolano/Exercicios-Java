import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //ler o nome, preco, codigo e disponiel
        Scanner leitor = new Scanner(System.in);

        //criar um objeto Produto com os dados
        System.out.println("Digite o nome do produto:");
        String nome = leitor.next() + leitor.nextLine();

        System.out.println("Digite o codigo do produto:");
        int codigo = leitor.nextInt();

        System.out.println("Digite o preço do produto:");
        float preco = leitor.nextFloat();

        System.out.println("O produto esta disponivel(true false):");
        boolean disponivel = leitor.nextBoolean();

        //criar objeto
        Produtos produto = new Produtos();

            // COlocar os dados no objetos
            produto.codigo = codigo;
            produto.nome = nome;
            produto.preco = preco;
            produto.disponivel = disponivel;

        System.out.println("Código: " + produto.codigo);
        System.out.println("Nome: " + produto.nome);
        System.out.println("Preço: R$ " + produto.preco);
        System.out.println("Disponível: " + (produto.disponivel ? "Sim" : "Não"));
    }

}
