package listaExercicio03;
import java.util.Scanner;

public class Qst48_sistemaDeFaltasAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de notas: ");
        int quantidadeNotas = scanner.nextInt();

        System.out.print("Digite a nota mínima para aprovação: ");
        double notaMinimaAprovacao = scanner.nextDouble();

        System.out.print("Digite a frequência mínima (em porcentagem): ");
        double frequenciaMinima = scanner.nextDouble();

        double somaNotas = 0.0;

        for (int i = 1; i <= quantidadeNotas; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = scanner.nextDouble();
            somaNotas += nota;
        }

        double media = somaNotas / quantidadeNotas;

        System.out.print("Digite a frequência do aluno (em porcentagem): ");
        double frequenciaAluno = scanner.nextDouble();

        if (media >= notaMinimaAprovacao && frequenciaAluno >= frequenciaMinima) {
            System.out.println("O aluno está aprovado!");
        } else if (media < notaMinimaAprovacao) {
            System.out.println("O aluno está reprovado por nota.");
        } else {
            System.out.println("O aluno está reprovado por faltas.");
        }
    }
}
