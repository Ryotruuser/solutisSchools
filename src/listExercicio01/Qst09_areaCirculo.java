package listExercicio01;
import java.util.Scanner;

/* Escreva uma classe para calcular a área de um círculo,
 sabendo que a área é A = PI * r2, onde o raio (r) deve ser
 informado pelo usuário e o resultado terá que ser arredondado.
 */
public class Qst09_areaCirculo {
    public static double areaCalc(double n1){
        double area = Math.PI * n1 * n1;
        area  = Math.round(area * 100) / 100;
        return area;
    }

    public static void main( String args[] ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o raio: ");
        double raio = scanner.nextDouble();
        System.out.println("A area do circulo e: " + areaCalc(raio));

    }
}
