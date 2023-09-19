package listExercicio01;
import java.util.Scanner;
/* Enunciado
3. Crie uma classe e na função main() implemente um programa que lê um
 inteiro do teclado e imprime todos os números primos menores que ele (divisíveis por 1 ou por ele mesmo).
*/
public class Qst03_numerosPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n1 = scanner.nextInt();
        for (int i = 1; n1 > i; n1--){
            if (n1 % 2 != 0){
                if(n1 % 5 != 0){
                    if (n1 % 3 != 0){
                        if (n1 % 7 != 0){
                            System.out.println(n1);
                        } else if (n1 == 7) {
                            System.out.println(n1);
                        }
                    } else if (n1 == 3) {
                        System.out.println(n1);
                    }
                } else if (n1 == 5) {
                    System.out.println(n1);
                }
            }else if( n1 == 2){
                System.out.println(n1);
            }
        }
    }
}
