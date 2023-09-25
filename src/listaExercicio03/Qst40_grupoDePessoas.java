package listaExercicio03;
import java.util.Scanner;
public class Qst40_grupoDePessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas no grupo: ");
        int quantidadePessoas = scanner.nextInt();

        int somaIdades = 0;
        int maiorIdade = 0;
        int menorIdade = Integer.MAX_VALUE;
        int pessoasMaiorIdade = 0;

        for (int i = 1; i <= quantidadePessoas; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();

            somaIdades += idade;
            maiorIdade = Math.max(maiorIdade, idade);
            menorIdade = Math.min(menorIdade, idade);

            if (idade >= 18) {
                pessoasMaiorIdade++;
            }
        }

        double mediaIdades = (double) somaIdades / quantidadePessoas;

        System.out.println("Média das idades: " + mediaIdades);
        System.out.println("Maior idade: " + maiorIdade);
        System.out.println("Menor idade: " + menorIdade);
        System.out.println("Quantidade de pessoas maior de idade: " + pessoasMaiorIdade);
    }
}
