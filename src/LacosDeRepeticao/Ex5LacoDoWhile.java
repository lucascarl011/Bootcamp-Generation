package LacosDeRepeticao;

/*
Escreva um algoritmo em Java, que leia números inteiros via teclado,
até que o número zero seja digitado. Ao final, mostre na tela a soma de todos os números digitados,
que sejam positivos.
 */


import java.util.Scanner;

public class Ex5LacoDoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero,somaPosistivos=0;

        do {
            System.out.printf("Digite um numero (ou zero para sair): ");
            numero = entrada.nextInt();

            if (numero > 0) {
                somaPosistivos += numero;
            }
        }while (numero != 0);

        System.out.println("A soma dos numeros positivos é: "+somaPosistivos);
    }
}
