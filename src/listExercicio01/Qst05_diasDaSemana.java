package listExercicio01;

import java.util.Scanner;

/* Enunciado
5 - Faça um programa que solicite ao usuário um número de 1 a 7, e
imprima na tela o dia da semana correspondente. Suponha que Segunda corresponde a 1 ,
Terça corresponde a 2, e assim por diante. Utilizando Array.
*/

public class Qst05_diasDaSemana {
    public static void diaDaSemana(int n){
        String[] semana = {"","Segunda", "Terca", "Quarta", "Quinta", "Sexta", "Sabado", "Domingo"};
        System.out.println(n + " Corresponde a " + semana[n] + "-feira");

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 7: ");
        int n1 = scanner.nextInt();
        diaDaSemana(n1);

    }
}
