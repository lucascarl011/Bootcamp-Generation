package LacosDeRepeticao;

import java.util.Scanner;

public class Ex1LacoFOR {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n1,n2;

        System.out.println("Digite p primeiro numero: ");
        n1 = entrada.nextInt();
        System.out.println("Digite o segundo numero: ");
        n2 = entrada.nextInt();

        if (n1 >= n2) {
            System.out.println("Intervalo iválido!");
        }else {
            System.out.println("Entre com o intervalo "+ n1 + "e" +n2);
            for (int x = n1; x <= n2; x++) {
                if (x % 3 == 0 && x % 5 == 0) {
                    System.out.println(x+" É multiplo de 3 e 5!");
                }
            }
        }

    }
}
