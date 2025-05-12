import javax.swing.*;
import java.util.Scanner;

public class Vogal {
    public static void main(String[] args) {

        String palavra = JOptionPane.showInputDialog("Digite uma palavra: ");

        String nomeCerto = palavra.replaceAll("[aeiou]", "*");

        JOptionPane.showMessageDialog(null, nomeCerto);














    }
}
