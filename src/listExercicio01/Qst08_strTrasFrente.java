package listExercicio01;
import java.util.Scanner;

/*Criar uma classe Java que receba uma palavra (String) retorne uma mensagem caso a
palavra fornecida seja uma palavra que pode ser lida da esquerda pra direita ou da
direita pra esquerda obtendo-se a mesma palavra. Ex.: Ana, arara, osso, etc.

 */
public class Qst08_strTrasFrente {

    public static boolean wordChecker(String word){
      word = word.replaceAll("\\s+", "").toLowerCase();
      String rightToLeft = new StringBuilder(word).reverse().toString();
      return word.equals(rightToLeft);
    };

    public static void main( String args[] ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");

        String word = scanner.nextLine();
        if (wordChecker(word)){
            System.out.println("A palavra " + word + " e um palindromo.");
        }else{
            System.out.println("A palavra " + word + " nao e um palindromo.");
        }

    }

}
