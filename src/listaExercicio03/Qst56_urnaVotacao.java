package listaExercicio03;
import java.util.Scanner;

public class Qst56_urnaVotacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do primeiro candidato: ");
        String candidato1 = scanner.nextLine();

        System.out.print("Digite o nome do segundo candidato: ");
        String candidato2 = scanner.nextLine();

        System.out.print("Digite o nome do terceiro candidato: ");
        String candidato3 = scanner.nextLine();

        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;
        int votosEmBranco = 0;
        int totalVotos = 0;

        System.out.println("Digite os votos (1 para " + candidato1 + ", 2 para " + candidato2 + ", 3 para " + candidato3 + ", 0 para voto em branco, -1 para encerrar):");

        while (true) {
            int voto = scanner.nextInt();

            if (voto == -1) {
                break;
            }

            totalVotos++;

            switch (voto) {
                case 1:
                    votosCandidato1++;
                    break;
                case 2:
                    votosCandidato2++;
                    break;
                case 3:
                    votosCandidato3++;
                    break;
                case 0:
                    votosEmBranco++;
                    break;
                default:
                    System.out.println("Voto inválido. Tente novamente.");
            }
        }

        double percentualCandidato1 = (double) votosCandidato1 / totalVotos * 100;
        double percentualCandidato2 = (double) votosCandidato2 / totalVotos * 100;
        double percentualCandidato3 = (double) votosCandidato3 / totalVotos * 100;
        double percentualEmBranco = (double) votosEmBranco / totalVotos * 100;

        System.out.println("Resultados da Eleição:");
        System.out.println(candidato1 + ": " + votosCandidato1 + " votos (" + percentualCandidato1 + "%)");
        System.out.println(candidato2 + ": " + votosCandidato2 + " votos (" + percentualCandidato2 + "%)");
        System.out.println(candidato3 + ": " + votosCandidato3 + " votos (" + percentualCandidato3 + "%)");
        System.out.println("Votos em Branco: " + votosEmBranco + " votos (" + percentualEmBranco + "%)");
        System.out.println("Total de votos: " + totalVotos);

        String vencedor;

        if (votosCandidato1 > votosCandidato2 && votosCandidato1 > votosCandidato3) {
            vencedor = candidato1;
        } else if (votosCandidato2 > votosCandidato1 && votosCandidato2 > votosCandidato3) {
            vencedor = candidato2;
        } else if (votosCandidato3 > votosCandidato1 && votosCandidato3 > votosCandidato2) {
            vencedor = candidato3;
        } else {
            vencedor = "Empate";
        }

        System.out.println("O vencedor da eleição é: " + vencedor);
    }
}
