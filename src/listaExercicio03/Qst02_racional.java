package listaExercicio03;
import java.util.Scanner;

public class Qst02_racional {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numerador: ");
        double num = scanner.nextDouble();

        System.out.println("Digite o denominador: ");
        double den = scanner.nextDouble();

        if(den != 0){
            System.out.println("O resultado da divisao e: " + (num/den));
        }else{
            System.out.println("Denominador nao pode ser 0");
        }
    }

}
