package listaExercicio03;
import java.util.Scanner;

public class Qst43_mediaAritmetica500Valores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeValores = 500; // Número de valores a serem fornecidos

        int soma = 0;

        for (int i = 1; i <= quantidadeValores; i++) {
            System.out.print("Digite o valor " + i + ": ");
            int valor = scanner.nextInt();
            soma += valor;
        }

        double media = (double) soma / quantidadeValores;

        System.out.println("A média aritmética dos " + quantidadeValores + " valores é: " + media);
    }
}
