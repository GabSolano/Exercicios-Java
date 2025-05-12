import java.util.Scanner;



public class Maiuscula {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        System.out.println("Digite seu nome");
        String nomeCompleto = leitor.nextLine();

        String nomeMaiusculo = nomeCompleto.toUpperCase();

        System.out.printf( nomeMaiusculo );
    }


}
