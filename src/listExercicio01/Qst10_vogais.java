package listExercicio01;
import java.util.Scanner;

/* Escreva uma classe que conte a quantidade de vogais,
espaços em brancos e consoantes de uma cadeia de caracteres.

 */
public class Qst10_vogais {
    public static void main( String args[] ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite algo: ");
        String txt = scanner.nextLine().toLowerCase();

        int vogais = 0;
        int emBranco = 0;
        int nvogais = 0;

        for (char c: txt.toCharArray()){
            if( c == ' '){
                emBranco ++;
            } else if ("aeiou".contains(String.valueOf(c))) {
                vogais++;
                
            } else if (Character.isLetter(c)) {
                nvogais ++;
            }
        }
        System.out.println("A palavra " + txt + " possui " + vogais + " vogais");
        System.out.println("A palavra " + txt + " possui " + emBranco + " espacos em branco");
        System.out.println("A palavra " + txt + " possui " + nvogais + " consoantes");
    }
}
