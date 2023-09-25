package listaExercicio03;
import java.util.Scanner;

public class Qst64_sequenciaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de triangulos desejada: ");
        int quantidadeTriangulos = scanner.nextInt();

        for (int i = 1; i <= quantidadeTriangulos; i++) {
            System.out.println("Triangulo " + i + ":");
            desenharTriangulo(i);
            System.out.println();
        }
    }

    public static void desenharTriangulo(int linhas) {
        for (int linha = 1; linha <= linhas; linha++) {
            for (int asteriscos = 1; asteriscos <= linha; asteriscos++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
