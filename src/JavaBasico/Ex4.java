package JavaBasico;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float n1,n2,n3,n4, diferencaProduto, calculo;
        System.out.println("Digite o n1: ");
        n1 = entrada.nextFloat();
        System.out.println("Digite o n2: ");
        n2 = entrada.nextFloat();
        System.out.println("Digite o n3: ");
        n3 = entrada.nextFloat();
        System.out.println("Digite o n4: ");
        n4 = entrada.nextFloat();
        calculo = (n1 * n2) - (n3 * n4);
        diferencaProduto = calculo;

        System.out.println("A diferença do produto é: "+ diferencaProduto);
    }
}
