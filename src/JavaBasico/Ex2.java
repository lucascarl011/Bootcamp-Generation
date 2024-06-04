package JavaBasico;

/*Elabore um algoritmo em Java que leia 4 notas de um participante,
em variáveis do tipo float e exiba na tela a média final do participante.
 */

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota1,nota2,nota3,nota4,media;
        System.out.println("Digite sua primeira nota: ");
        nota1 = entrada.nextDouble();
        System.out.println("Digite sua segunda nota: ");
        nota2 = entrada.nextDouble();
        System.out.println("Digite sua terceira nota: ");
        nota3 = entrada.nextDouble();
        System.out.println("Digite sua quarta nota: ");
        nota4 = entrada.nextDouble();

        media = (nota1+nota2+nota3+nota4) / 4;

        System.out.printf("Sua média final é: %.2f", media);
    }

}
