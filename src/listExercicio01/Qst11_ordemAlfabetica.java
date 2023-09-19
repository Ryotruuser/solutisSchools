package listExercicio01;
import java.util.Arrays;
import java.util.Scanner;
/*
Escreva um programa que tenha duas palavras como entrada,
e a saída imprima as palavras em ordem alfabética (utilize o método compareTo da classe String),.
Informe também, qual das palavras tem o maior número de caracteres
 */
public class Qst11_ordemAlfabetica {
    public static void main( String args[] ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String t1 = scanner.nextLine();
        System.out.println("Digite outra palavra: ");
        String t2 = scanner.nextLine();

        String[] txts = {t1, t2};

        int t1Size = t1.length();
        int t2Size = t2.length();

        Arrays.sort(txts);

        System.out.println("==========Imprimindo em ordem============");
        for (int i = 0; i < txts.length; i++){
            System.out.println(txts[i]);
        }

        if (t1Size > t2Size){
            System.out.println("A palavra " + t1 + " e maior que a palavra " + t2 + " pois possui " + t1Size + " caracteres,");
            System.out.println("enquanto " + t2 + " possui apenas " + t2Size + " caracters.");
        }else if (t2Size > t1Size){
            System.out.println("A palavra " + t2 + " e maior que a palavra " + t1 + " pois possui " + t2Size + " caracteres.");
            System.out.println("enquanto " + t1 + " possui apenas " + t1Size + " caracters.");
        }else{
            System.out.println("As palavras possuem o mesmo tamanho.");
        }

    }
}
