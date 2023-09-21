package listaExercicio03;
import java.util.Scanner;
public class Qst04_dataNasc {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o dia de seu nascimento: ");
        int dia = scanner.nextInt();

        System.out.println("Digite o numero do mes do seu nascimento: ");
        int mes = scanner.nextInt();

        mes = (mes - 1);
        String[] meses = {"janeiro","fevereiro","marco","abril", "maio","junho", "julho","agosto",
        "setembro", "outubro", "novembro", "dezembro"};

        //verificando se o mes e um dos meses que possuem 30 dias
        if(meses[mes] == meses[3] || meses[mes] == meses[5] || meses[mes] == meses[8] || meses[mes] == meses[10]){
            if (dia > 30){
                System.out.println("Data invalida. O mes selecionado so possui 30 dias. ");
            }else{
                System.out.println("Voce nasceu no dia " + dia + " do mes de " + meses[mes]);
            }
        }else if (meses[mes] == meses[1]){ // verificando se for fevereiro e aplicando regra do ano bissexto para verificar se possui 28 ou 29 dias
            if (dia >= 29){
                System.out.println("Digite o ano de nascimento: ");
                int anoBi = scanner.nextInt();
                if(anoBi % 4 == 0){ // anos bissextos quando dividos por 4 retornam o resto 0 enquanto os demais mesmo pares retornam 2 ou 1.
                    //se for bissexto
                    System.out.println("Voce nasceu no dia " + dia + " do mes de " + meses[mes] + " no ano bissexto de " + anoBi);
                }else {
                    //se nao for bissexto
                    System.out.println("Data invalida, o mes de fevereiro so possui mais de 28 dias quando e bissexto o ano " + anoBi + " nao se enquadra em ano bissexto.");
                }
            }else {
                // se for fevereiro porem em qualquer dia que nao 29 ou depois
                System.out.println("Voce nasceu no dia " + dia + " do mes de " + meses[mes]);
            }

        }else {
            //se nao for nenhum dos meses que possuem 30 dias ou fevereiro
            System.out.println("Voce nasceu no dia " + dia + " do mes de " + meses[mes]);
        }

        //Imprimindo semestre de nascimento.
        if(meses[mes] == meses[0] || meses[mes] == meses[1] ||meses[mes] == meses[2] ){
            System.out.println("Voce nasceu no 1.º semestre do ano.");
        }else if (meses[mes] == meses[3] || meses[mes] == meses[4] ||meses[mes] == meses[5] ){
            System.out.println("Voce nasceu no 2.º semestre do ano.");
        }else if (meses[mes] == meses[6] || meses[mes] == meses[7] ||meses[mes] == meses[8] ){
            System.out.println("Voce nasceu no 3.º semestre do ano.");
        }else {
            System.out.println("Voce nasceu no 4.º semestre do ano.");
        }

    }
}
