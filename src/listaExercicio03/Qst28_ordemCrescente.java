package listaExercicio03;
import java.util.Scanner;

public class Qst28_ordemCrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int numero3 = scanner.nextInt();

        if (numero1 > numero2) {
            int temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }

        if (numero2 > numero3) {
            int temp = numero2;
            numero2 = numero3;
            numero3 = temp;
        }

        if (numero1 > numero2) {
            int temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }

        System.out.println("Os números em ordem crescente são: " + numero1 + ", " + numero2 + ", " + numero3);
    }
}
