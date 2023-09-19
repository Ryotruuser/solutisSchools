package listExercicio01;
/* Enunciado
4. Pretende-se escrever um programa que leia do teclado uma distância expressa em milhas,
converte-a para quilômetros e apresenta o resultado no console. (fórmula de conversão: 1 milha = 1.609 km).
*/
import java.util.Scanner;
public class Qst04_milhaToKm {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a distancia em milhas: ");
        Double distanciaM = scanner.nextDouble();

        Double novaDistancia = distanciaM * 1.609;
        System.out.println(distanciaM + " Milhas, sao extamente " + novaDistancia + " km/h");


    }
}
