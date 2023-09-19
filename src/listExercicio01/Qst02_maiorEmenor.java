package listExercicio01;

import java.util.Scanner;

/* Enunciado
2 - Faça um programa que receba 2 valores e retorne o maior entre eles.
*/

public class Qst02_maiorEmenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int n2 = scanner.nextInt();

        if(n1 > n2){
            System.out.println("O numero "+ n1 + " e maior que " + n2);
        }else if(n2 > n1){
            System.out.println("O numero "+ n2 + " e maior que " + n1);
        }else{
            System.out.println("Os numeros possuem o mesmo valor.");
        }
    }
}
