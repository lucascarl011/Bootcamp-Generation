package LacosDeRepeticao;

import java.util.Scanner;

/*Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros),
via teclado e mostre na tela o total de pessoas
cuja idade seja menor que 21 anos e o total de pessoas cuja idade seja maior que 50 anos.
A leitura dos dados deve ser finalizada ao digitar uma idade negativa
 */

public class Ex3LacoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idade,totalMenor=0,totalMaior=0;

        while (true) {
            System.out.println("Digite a idade (ou um número negativo para sair): ");
            idade = entrada.nextInt();

            if (idade < 0) {
                break; // Encerra o programas se a idade for negativa
            }

            if (idade < 21) {
                totalMenor++;
            }else if (idade > 50) {
                totalMaior++;
            }
        }
        System.out.println("Total de pessoas com menos de 21 anos: "+totalMenor);
        System.out.println("Total de pessoas com mais de 50 anos: "+totalMaior);
    }
}
