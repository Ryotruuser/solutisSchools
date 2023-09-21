package listaExercicio03;
import java.util.Scanner;

public class Qst05_maisNovoMaisVelho {
    public static class Pessoa{
        public String nome;
        public int idade;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da primeira pessoa: ");
        String prNome = scanner.nextLine();
        System.out.println("Digite a idade da primeira pessoa: ");
        int prIdade = scanner.nextInt();

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = prNome;
        pessoa1.idade = prIdade;

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println("Digite o nome da segunda pessoa: ");
        String segNome = scanner2.nextLine();
        System.out.println("Digite a idade da segunda pessoa: ");
        int segIdade = scanner2.nextInt();



        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = segNome;
        pessoa2.idade = segIdade;

        System.out.println("===================================");
        if(pessoa1.idade > pessoa2.idade){
            System.out.println("A pessoa mais velha e a " + pessoa1.nome + " com " + pessoa1.idade + " anos");
            System.out.println("A pessoa mais nova e a " + pessoa2.nome + " com " + pessoa2.idade + " anos");
        }else if(pessoa2.idade > pessoa1.idade){
            System.out.println("A pessoa mais velha e a " + pessoa2.nome + " com " + pessoa2.idade + " anos");
            System.out.println("A pessoa mais nova e a " + pessoa1.nome + " com " + pessoa1.idade + " anos");
        }else{
            System.out.println("Ambas as pessoas " + pessoa1.nome + " e " + pessoa2.nome + " possuem exatamente a mesma idade " + pessoa1.idade + " anos de idade.");
        }

    }
}
