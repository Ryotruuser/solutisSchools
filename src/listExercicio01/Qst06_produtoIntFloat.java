package listExercicio01;

public class Qst06_produtoIntFloat {
    public static void main( String args[] ){
        int inteiro = 1;
        float flutuante = 1;

        for(int i = 15; i <= 30; i++){
            inteiro *= i;
            flutuante *= i;

            System.out.println(inteiro);
            System.out.println(flutuante);
        }

    }
}
