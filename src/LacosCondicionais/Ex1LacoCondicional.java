package LacosCondicionais;

import java.util.Scanner;

public class Ex1LacoCondicional {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a,b,c,soma;
        System.out.println("Digite o primeiro valor: ");
        a = entrada.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = entrada.nextInt();
        System.out.println("Digite o terceiro valor: ");
        c = entrada.nextInt();

        soma = a+b;
        System.out.println("Resultado soma A+B: "+soma);

        if (soma>c) {
            System.out.println("A soma de A+B é maior do que C!!!");
        }else if (soma<c) {
            System.out.println("A soma de A+B é menor do que C!!!");
        }else {
            System.out.println("A soma de A+B é igual a C!!!");
        }

    }
}
