import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //variaveis
        float x1 = 0.0f;
        float x2 = 0.0f;
        float x3 = 0.0f;

        //pesos
        float w1 = 0.0f;
        float w2 = 0.0f;
        float w3 = 0.0f;

        //bias
        float b = 0.0f;

        float taxaDeAprendizagem = 0.0f;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite as vars: ");
        System.out.println("x1");
        if (input.hasNextFloat()) {
            x1 = input.nextFloat();
            System.out.println("x2");
            x2 = input.nextFloat();
            System.out.println("x3");
            x3 = input.nextFloat();
            System.out.println("w1");
            w1 = input.nextFloat();
            System.out.println("w2");
            w2 = input.nextFloat();
            System.out.println("w3");
            w3 = input.nextFloat();
            System.out.println("b");
            b = input.nextFloat();
            System.out.println("taxaDeAprendizagem");
            taxaDeAprendizagem = input.nextFloat();
        }


        float soma = (x1 * w1) + (x2  * w2) + (x3 * w3) * b;
        int saida = (soma >= 0)? 1: 0;
        float erro = soma - saida;
        System.out.println(soma);

        if (saida != x1 || saida != x2 || saida != x3) {
            float valorErro = soma;

            valorErro -= x1;
            System.out.println(valorErro);
            float novoW1 = w1 + taxaDeAprendizagem * erro * x1;
            float novoW2 = w2 + taxaDeAprendizagem * erro * x2;
            float novoW3 = w3 + taxaDeAprendizagem * erro * x3;


            System.out.println("Novo W1: " + novoW1);
            System.out.println("Novo W2: " + novoW2);
            System.out.println("Novo W3: " + novoW3);

            soma =  (b * novoW1) + (b* novoW2) + (b* novoW3);

        }

        System.out.println("Soma: " + soma);

//        System.out.println(x1);
//        System.out.println(x2);
//        System.out.println(x3);
    }
}