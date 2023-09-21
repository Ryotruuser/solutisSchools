package listaExercicio03;
import java.util.Scanner;
import java.math.BigDecimal;

public class Qst03_AprovadoOrN {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double media = 0;
        int qntNotas = 3;
        for(int i = 1; i <= qntNotas; i++){
            System.out.println("Digite a " + i + "º nota: ");
            double notas = scanner.nextDouble();
            media += notas;
        }
        media = media / qntNotas;
        BigDecimal mediaRedonda = new BigDecimal(media);

        if(media >= 7){
            System.out.println("Parabens sua media de " + mediaRedonda.setScale(2, mediaRedonda.ROUND_HALF_UP) + " atingiu o determinado e voce foi aprovado");
        }else if(media >= 5 && media < 7){
            System.out.println("Infelizmente sua media de " + mediaRedonda.setScale(2, mediaRedonda.ROUND_HALF_UP) + " nao atingiu o determinado e voce foi de recuperacao");
        }else{
            System.out.println("Sentimos em dizer que sua media de " + mediaRedonda.setScale(2, mediaRedonda.ROUND_HALF_UP) + " nao atingiu a media, e voce foi reprovado");
            System.out.println("Ate o proximo ano..");
        }
    }
}
