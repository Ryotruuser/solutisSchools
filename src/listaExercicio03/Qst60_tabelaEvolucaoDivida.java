package listaExercicio03;
import java.text.DecimalFormat;

public class Qst60_tabelaEvolucaoDivida {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Digite o valor da divida: ");
        double valorDivida = scanner.nextDouble();

        System.out.print("Digite a taxa de Correcao (em %): ");
        double taxaCorrecao = scanner.nextDouble() / 100.0;

        System.out.print("Digite a quantidade de anos: ");
        int quantidadeAnos = scanner.nextInt();

        System.out.println("Mes | Ano | Valor da Divida");

        int mesesPorAno = 12;

        for (int ano = 2007; ano <= 2007 + quantidadeAnos; ano++) {
            for (int mes = 1; mes <= mesesPorAno; mes++) {
                valorDivida *= (1 + taxaCorrecao / mesesPorAno);
                String mesFormatado = String.format("%02d", mes);
                System.out.println(mesFormatado + "  | " + ano + " | R$" + df.format(valorDivida));
            }
        }
    }
}
