package listaExercicio03;
import java.util.Scanner;


public class Qst24_anoBissexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia: ");
        int dia = scanner.nextInt();

        System.out.print("Digite o mês: ");
        int mes = scanner.nextInt();

        System.out.print("Digite o ano: ");
        int ano = scanner.nextInt();

        boolean dataValida = verificarDataCompleta(dia, mes, ano);

        if (dataValida) {
            System.out.println("A data é válida.");
        } else {
            System.out.println("A data é inválida.");
        }
    }

    public static boolean verificarDataCompleta(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) {
            return false;
        }

        if (dia < 1 || dia > 31) {
            return false;
        }

        if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            return false;
        }

        if (mes == 2) {
            if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
                if (dia > 29) {
                    return false;
                }
            } else {
                if (dia > 28) {
                    return false;
                }
            }
        } else {
            if (dia > 31) {
                return false;
            }
        }

        return true;
    }
}
