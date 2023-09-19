public class Carro {
    String cor;
    String modelo;
    double velocidadeAtual;
    double velocidadeMaxima;

    void liga(){
        System.out.println("Carro ligado");
    }

    void acelera(double quantidade){
        double velocidadeNova = this.velocidadeAtual + quantidade;
        this.velocidadeAtual = velocidadeNova;
        if(velocidadeAtual > velocidadeMaxima){
            System.out.println("limite alcancado");
        }else {
            System.out.println("acelerando " + velocidadeAtual);
        }
    }
}
