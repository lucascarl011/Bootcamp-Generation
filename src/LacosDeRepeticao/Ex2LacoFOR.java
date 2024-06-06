package LacosDeRepeticao;

import java.util.Scanner;

public class Ex2LacoFOR {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero,impar=0,par=0;

        for (int i = 1; i <=10; i++) {
            System.out.printf("Digite o " +i+ "º numero: ");
            numero = entrada.nextInt();

            if (numero % 2 ==0) {
                par++;
            }else {
                impar++;
            }
        }
        System.out.println("Total de numeros pares: "+par);
        System.out.println("Total de numeros impares: "+impar);

    }
}
