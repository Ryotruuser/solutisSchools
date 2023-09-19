package listExercicio01;

/*Imprima o resultado da divisão por 2 de todos os múltiplos de 3,
entre 1 e 100, usando os tipos de dados int e double .

 */
public class Qst07_divMult {
    public static void main( String args[] ){
        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0){
                System.out.println("A divisao de " + i + " por 2 e igual a " + (i / 2));
            }

        }

    }
}
