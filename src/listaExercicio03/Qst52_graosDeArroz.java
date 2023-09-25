package listaExercicio03;

public class Qst52_graosDeArroz {
    public static void main(String[] args) {
        int casas = 64;
        long totalGraos = 0;

        for (int i = 0; i < casas; i++) {
            totalGraos += Math.pow(2, i);
        }

        System.out.println("O súdito ganharia um total de " + totalGraos + " grãos de arroz.");
        long totalSacosDeArroz = totalGraos / 50000;
        System.out.println("Isso equivale a aproximadamente " + totalSacosDeArroz + " sacos de arroz.");
    }
}
