package listaExercicio03;
import java.util.Scanner;

public class Qst01_mediaArt {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double cont = 0;
        double unit = 4;
        for (int i = 1 ; i <= unit; i++){
            System.out.println("Digite a " + i + ".º nota: ");
            double nota = scanner.nextDouble();
            cont += nota;
        }
        System.out.println("A media do aluno e " + (cont/unit));
    }
}
