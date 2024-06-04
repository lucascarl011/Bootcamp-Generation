package JavaBasico;

/*Elabore um algoritmo em Java, que leia o Salário Bruto,
o Adicional Noturno, as Horas Extras e os Descontos de um Colaborador,
em variáveis do tipo float e exiba na tela o Salário Líquido.
 */

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float salarioBruto, salarioLiquido, adicionalNoturno, horasExtras, descontos;
        System.out.println("Informe seu salário bruto: ");
        salarioBruto = entrada.nextFloat();
        System.out.println("Informe seu adicional noturno: ");
        adicionalNoturno = entrada.nextFloat();
        System.out.println("Informe suas horas extras: ");
        horasExtras = entrada.nextFloat();
        System.out.println("Informe seus descontos: ");
        descontos = entrada.nextFloat();

        salarioLiquido = salarioBruto+adicionalNoturno+(horasExtras * 5)-descontos;

        System.out.printf("Seu salário líquido é: %.2f", salarioLiquido);



    }
}
